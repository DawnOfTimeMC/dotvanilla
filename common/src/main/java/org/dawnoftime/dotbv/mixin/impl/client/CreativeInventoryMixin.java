package org.dawnoftime.dotbv.mixin.impl.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.dawnoftime.dotbv.client.gui.creative.CreativeInventoryCategories;
import org.dawnoftime.dotbv.client.gui.elements.buttons.CategoryButton;
import org.dawnoftime.dotbv.client.gui.elements.buttons.GroupButton;
import org.dawnoftime.dotbv.client.gui.elements.buttons.SubTabButton;
import org.dawnoftime.dotbv.mixin.api.CreativeScreen;
import org.dawnoftime.dotbv.registry.DoTBVCreativeModeTabsRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;

import static org.dawnoftime.dotbv.DoTBVCommon.CREATIVE_ICONS;

@SuppressWarnings("unused")
@Mixin(CreativeModeInventoryScreen.class)
public abstract class CreativeInventoryMixin extends EffectRenderingInventoryScreen<CreativeModeInventoryScreen.ItemPickerMenu> implements CreativeScreen {
    @Shadow public abstract boolean mouseScrolled(double p_98527_, double p_98528_, double p_98529_);

    @Unique
    private List<CategoryButton> dotbv$buttons;
    @Unique
    private Button dotbv$btnScrollUp;
    @Unique
    private Button dotbv$btnScrollDown;
    @Unique
    private List<SubTabButton> dotbv$subTabButtons;
    @Unique
    private static int dotbv$selectedCategoryID = 0;
    @Unique
    private static int dotbv$selectedSubTabID = 0;
    @Unique
    private static int dotbv$page = 0;
    @Unique
    private boolean dotbv$tabDoTBVSelected;
    @Unique
    private final int DOTBV_MAX_PAGE = (int) Math.floor((double) (CreativeInventoryCategories.values().length - 1) / 4);

    protected CreativeInventoryMixin(CreativeModeInventoryScreen.ItemPickerMenu $$0, Inventory $$1, Component $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    public int dotbv$getPage() {
        return dotbv$page;
    }

    @Inject(method = "init", at = @At(value = "TAIL"))
    public void dotbv$init(CallbackInfo ci) {
        this.dotbv$buttons = new ArrayList<>();

        this.addRenderableWidget(this.dotbv$btnScrollUp = new GroupButton(this.leftPos - 22, this.topPos - 22, Component.empty(), button -> {
            if(dotbv$page > 0) {
                dotbv$page--;
                this.dotbv$updateCategoryButtons();
            }
        }, CREATIVE_ICONS, 0, 56));

        this.addRenderableWidget(this.dotbv$btnScrollDown = new GroupButton(this.leftPos - 22, this.topPos + 120, Component.empty(), button -> {
            if(dotbv$page < DOTBV_MAX_PAGE) {
                dotbv$page++;
                this.dotbv$updateCategoryButtons();
            }
        }, CREATIVE_ICONS, 16, 56));

        this.dotbv$subTabButtons = new ArrayList<>();
        this.dotbv$buildSubTabButtons((CreativeModeInventoryScreen) (Object) this);

        for(int i = 0; i < 4; i++) {
            this.dotbv$buttons.add(new CategoryButton(this.leftPos - 27, this.topPos + 30 * i, i, button -> {
                CategoryButton categoryButton = (CategoryButton) button;
                if(!categoryButton.isSelected()) {
                    dotbv$buttons.get(dotbv$selectedCategoryID % 4).setSelected(false);
                    categoryButton.setSelected(true);
                    dotbv$selectedCategoryID = categoryButton.getCategoryID();
                    dotbv$selectedSubTabID = 0;
                    Screen screen1 = Minecraft.getInstance().screen;
                    if(screen1 instanceof CreativeModeInventoryScreen screen2) {
                        this.dotbv$buildSubTabButtons(screen2);
                        this.dotbv$updateItems(screen2);
                    }
                }
            }, this));
        }

        for (CategoryButton dotbv$button : this.dotbv$buttons) {
            addRenderableWidget(dotbv$button);
        }
        this.dotbv$updateCategoryButtons();

        if(this.dotbv$tabDoTBVSelected) {
            this.dotbv$updateItems((CreativeModeInventoryScreen) (Object) this);
            dotbv$toggleButtons(true);
            this.dotbv$buttons.get(dotbv$selectedCategoryID % 4).setSelected(true);
        } else {
            dotbv$toggleButtons(false);
        }
    }

    @Unique
    private static boolean dotbv$hasSetItemsYet = false;
    @Inject(method = "render", at = @At(value = "HEAD"))
    public void dotbv$render(GuiGraphics $$0, int $$1, int $$2, float $$3, CallbackInfo ci) {
        if (!dotbv$hasSetItemsYet && this.dotbv$tabDoTBVSelected) {
            dotbv$updateItems((CreativeModeInventoryScreen) (Object) this);
            dotbv$hasSetItemsYet = true;
        } else if (!this.dotbv$tabDoTBVSelected) {
            dotbv$hasSetItemsYet = false;
        }

        dotbv$toggleButtons(this.dotbv$tabDoTBVSelected);
    }

    @Unique
    private void dotbv$toggleButtons(boolean val) {
        this.dotbv$btnScrollUp.visible = val;
        this.dotbv$btnScrollDown.visible = val;
        this.dotbv$buttons.forEach(button -> button.visible = val);
        boolean hasSubTabs = CreativeInventoryCategories.values()[dotbv$selectedCategoryID].hasSubTabs();
        this.dotbv$subTabButtons.forEach(button -> button.visible = val && hasSubTabs);
    }

    @Inject(method = "selectTab", at = @At(value = "HEAD"), cancellable = false)
    public void dotbv$selectTab(CreativeModeTab $$0, CallbackInfo ci) {
        dotbv$tabDoTBVSelected = $$0 == DoTBVCreativeModeTabsRegistry.INSTANCE.DOTBV_TAB.get();
    }

    @Inject(method = "mouseScrolled", at = @At(value = "HEAD"), cancellable = true)
    public void dotbv$mouseScrolled(double mouseX, double mouseY, double delta, CallbackInfoReturnable<Boolean> cir) {
        if (!this.dotbv$tabDoTBVSelected) return;
        int guiLeft = this.leftPos;
        int guiTop = this.topPos;
        int startX = guiLeft - 32;
        int startY = guiTop + 10;
        int endY = startY + 28 * 4 + 3;
        if(mouseX >= startX && mouseX < guiLeft && mouseY >= startY && mouseY < endY) {
            if(delta > 0) {
                this.dotbv$scrollUp();
            } else {
                this.dotbv$scrollDown();
            }
            cir.setReturnValue(true);
        }
    }

    @Unique
    private void dotbv$updateCategoryButtons() {
        this.dotbv$btnScrollUp.active = (dotbv$page > 0);
        this.dotbv$btnScrollDown.active = (dotbv$page < DOTBV_MAX_PAGE);
        this.dotbv$buttons.forEach(button -> {
            button.active = (button.getCategoryID() < CreativeInventoryCategories.values().length);
            if (button.active) {
                Tooltip tt = button.getTooltipForCategory();
                if (tt != null) {
                    button.setTooltip(tt);
                }
            } else {
                button.setTooltip(null);
            }
        });
        this.dotbv$buttons.get(dotbv$selectedCategoryID % 4).setSelected(dotbv$selectedCategoryID - dotbv$page * 4 >= 0 && dotbv$selectedCategoryID - dotbv$page * 4 < 4);
    }

    @Unique
    private void dotbv$updateItems(CreativeModeInventoryScreen screen) {
        this.mouseScrolled(0, 0, Float.MAX_VALUE);
        CreativeModeInventoryScreen.ItemPickerMenu container = screen.getMenu();
        container.items.clear();
        CreativeInventoryCategories.values()[dotbv$selectedCategoryID].getSubTabItems(dotbv$selectedSubTabID).forEach(item -> container.items.add(new ItemStack(item)));
        container.scrollTo(0);
    }

    @Unique
    private void dotbv$buildSubTabButtons(CreativeModeInventoryScreen screen) {
        // Use an explicit lambda instead of this::removeWidget.
        // this::removeWidget compiles to a STATIC lambda method with CreativeInventoryMixin as an
        // explicit parameter type. When Mixin injects it into the target class, the JVM tries to
        // load CreativeInventoryMixin to verify that type — but Mixin marks it INVALID, causing
        // a NoClassDefFoundError at runtime.
        // An explicit lambda compiles to an INSTANCE method where 'this' is implicit, just like
        // the other button -> ... lambdas in this class, and does not produce this problem.
        this.dotbv$subTabButtons.forEach(widget -> removeWidget(widget));
        this.dotbv$subTabButtons.clear();

        CreativeInventoryCategories category = CreativeInventoryCategories.values()[dotbv$selectedCategoryID];
        List<CreativeInventoryCategories.SubTab> subTabs = category.getSubTabs();
        if (subTabs.isEmpty()) return;

        int count = subTabs.size();
        int y = this.topPos + 4;

        for (int i = 0; i < count; i++) {
            final int subTabIndex = i;
            int x = this.leftPos + 170 - (count - i) * 14;
            CreativeInventoryCategories.SubTab subTab = subTabs.get(i);
            SubTabButton btn = new SubTabButton(
                    x, y,
                    subTab.textureOn(),
                    subTab.textureOff(),
                    subTab.getTooltip(),
                    button -> {
                        dotbv$subTabButtons.forEach(b -> b.setSelected(false));
                        ((SubTabButton) button).setSelected(true);
                        dotbv$selectedSubTabID = subTabIndex;
                        this.dotbv$updateItems(screen);
                    }
            );
            btn.setSelected(i == dotbv$selectedSubTabID);
            this.dotbv$subTabButtons.add(btn);
            this.addRenderableWidget(btn);
        }
    }

    @Unique
    private void dotbv$scrollUp() {
        if(dotbv$page > 0) {
            dotbv$page--;
            this.dotbv$updateCategoryButtons();
        }
    }

    @Unique
    private void dotbv$scrollDown() {
        if(dotbv$page < DOTBV_MAX_PAGE) {
            dotbv$page++;
            this.dotbv$updateCategoryButtons();
        }
    }
}