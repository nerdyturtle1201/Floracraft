package com.nerdyturtle.floracraft.recipe;

import java.util.HashMap;
import java.util.Map;

import com.nerdyturtle.floracraft.block.FloracraftBlocks;
import com.nerdyturtle.floracraft.item.FloracraftItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;



public class ResearchTableRecipes {
    private static final ResearchTableRecipes researchBase = new ResearchTableRecipes();
    private Map researchList = new HashMap();
    private Map experienceList = new HashMap();
    
    public static final ResearchTableRecipes research()
    {
        return researchBase;
    }
    private ResearchTableRecipes()
    {
        this.addResearch(FloracraftItems.plantmutagen.itemID, new ItemStack(FloracraftItems.researchpapers), 2F);
    }
    public void addResearch(int par1, ItemStack par2ItemStack, float par3)
    {
        this.researchList.put(Integer.valueOf(par1), par2ItemStack);
        this.experienceList.put(Integer.valueOf(par2ItemStack.itemID), Float.valueOf(par3));
    }

}
