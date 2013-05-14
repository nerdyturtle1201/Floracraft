package com.nerdyturtle.floracraft.core.helpers;

import com.nerdyturtle.floracraft.item.FloracraftItems;

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class FloracraftChestGenHelper {
    
    public static void init(){
        
        ChestGenHooks.getInfo("DUNGEON_CHEST").addItem(new WeightedRandomChestContent(new ItemStack(FloracraftItems.plantmutagen), 1, 4, 59));
        ChestGenHooks.getInfo("DUNGEON_CHEST").addItem(new WeightedRandomChestContent(new ItemStack(FloracraftItems.rawdna), 1, 3, 23));
        ChestGenHooks.getInfo("DUNGEON_CHEST").addItem(new WeightedRandomChestContent(new ItemStack(FloracraftItems.nettlesword), 1, 1, 30));
    }
    
    

}
