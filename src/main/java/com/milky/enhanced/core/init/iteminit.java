package com.milky.enhanced.core.init;

import com.milky.enhanced.enhanced;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class iteminit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, enhanced.MOD_ID);

    //Items
    public static final RegistryObject<Item> DRAGON_SCALE = ITEMS.register("dragon_scale",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

    //BlockItems
    public static final RegistryObject<BlockItem> TUNGSTEN_ORE = ITEMS.register("tungsten_ore",
            () -> new BlockItem(blockinit.TUNGSTEN_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_MISC)));

}
