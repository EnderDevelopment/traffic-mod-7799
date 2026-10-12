package com.ttstori19.trafficmod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class RoadBlock extends Block {
    public RoadBlock() {
        super(Properties.of(Material.STONE)
                .strength(2.0f)
                .sound(SoundType.STONE));
    }
}
