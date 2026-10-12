package com.ttstori19.trafficmod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class HospitalBlock extends Block {
    public HospitalBlock() {
        super(Properties.of(Material.STONE)
                .strength(3.0f)
                .sound(SoundType.STONE));
    }
}
