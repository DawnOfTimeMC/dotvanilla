package org.dawnoftime.dotbv.util;

import net.minecraft.util.StringRepresentable;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import org.jetbrains.annotations.NotNull;

public class BlockStatePropertiesAA {
    public static final BooleanProperty AXIS_X = BooleanProperty.create("axis_x");
    public static final BooleanProperty AXIS_Y = BooleanProperty.create("axis_y");
    public static final BooleanProperty AXIS_Z = BooleanProperty.create("axis_z");
    public static final BooleanProperty SUBAXIS = BooleanProperty.create("subaxis");
    public static final EnumProperty<PillarConnection> PILLAR_CONNECTION = EnumProperty.create("pillar_connection", PillarConnection.class);

    public enum PillarConnection implements StringRepresentable {
        NOTHING("nothing"),
        FOUR_PX("4_pixels"),
        SIX_PX("6_pixels"),
        EIGHT_PX("8_pixels"),
        TEN_PX("10_pixels");
        private final String name;

        PillarConnection(final String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }

        @Override
        public @NotNull String getSerializedName() {
            return this.name;
        }
    }
}