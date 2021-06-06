package com.milky.enhanced.core.init;

import com.milky.enhanced.enhanced;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class blockinit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, enhanced.MOD_ID);

    public static final RegistryObject<Block> TUNGSTEN_ORE = BLOCKS.register("tungsten_ore",
            () -> new Block(Block.Properties.of(
                    Material.STONE)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()
                    .strength(15f, 30f)
                    .harvestLevel(4)
                    .sound(SoundType.STONE)));
}
