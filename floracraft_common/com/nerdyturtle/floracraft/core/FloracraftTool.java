package com.nerdyturtle.floracraft.core;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FloracraftTool extends Item{
    
    private Block blocksEffectiveAgainst[];
    public float efficiencyOnProperMaterial;
    public int damageVsEntity;
    protected FloracraftToolMaterial toolMaterial;
 
    protected FloracraftTool(int i, int j,FloracraftToolMaterial enumtoolmaterial, Block ablock[])
    {
        super(i);
        efficiencyOnProperMaterial = 4F;
        toolMaterial = enumtoolmaterial;
        blocksEffectiveAgainst = ablock;
        maxStackSize = 1;
        setMaxDamage(enumtoolmaterial.getMaxUses());
        efficiencyOnProperMaterial = enumtoolmaterial.getEfficiencyOnProperMaterial();
        damageVsEntity = j + enumtoolmaterial.getDamageVsEntity();
    }
 
    public float getStrVsBlock(ItemStack itemstack, Block block)
    {
        for(int i = 0; i < blocksEffectiveAgainst.length; i++)
        {
            if(blocksEffectiveAgainst[i] == block)
            {
                return efficiencyOnProperMaterial;
            }
        }
 
        return 1.0F;
    }
 
    public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1)
    {
        itemstack.damageItem(2, entityliving1);
        return true;
    }
 
    public boolean onBlockDestroyed(ItemStack itemstack, int i, int j, int k, int l, EntityLiving entityliving)
    {
        itemstack.damageItem(1, entityliving);
        return true;
    }
 
    public int getDamageVsEntity(Entity entity)
    {
        return damageVsEntity;
    }
 
    public boolean isFull3D()
    {
        return true;
    }
 
    public int getItemEnchantability()
    {
        return toolMaterial.getEnchantability();
    }

}
