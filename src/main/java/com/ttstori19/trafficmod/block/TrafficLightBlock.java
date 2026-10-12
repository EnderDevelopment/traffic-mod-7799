package com.ttstori19.trafficmod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class TrafficLightBlock extends Block {
    public TrafficLightBlock() {
        super(Properties.of(Material.METAL)
                .strength(2.0f)
                .sound(SoundType.METAL));
    }
}
