package com.ttstori19.trafficmod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class EditableSignBlock extends Block {
    public EditableSignBlock() {
        super(Properties.of(Material.WOOD)
                .strength(1.0f)
                .sound(SoundType.WOOD));
    }
}
