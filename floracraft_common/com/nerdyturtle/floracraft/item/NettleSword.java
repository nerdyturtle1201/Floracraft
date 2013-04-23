package com.nerdyturtle.floracraft.item;

import com.nerdyturtle.floracraft.core.FloracraftTool;
import com.nerdyturtle.floracraft.core.FloracraftToolMaterial;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;

import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class NettleSword extends FloracraftTool {
    
    private static Block blocksEffectiveAgainst[];

    public NettleSword(int par1, FloracraftToolMaterial par2enumtoolmaterial) {
        super(par1, 1, par2enumtoolmaterial, blocksEffectiveAgainst);
        this.setUnlocalizedName("aerolilyPetal");

    }


    public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
     {
             par1ItemStack.damageItem(1, par3EntityLiving);
             par2EntityLiving.addPotionEffect(new PotionEffect(Potion.poison.id, 200, 1));
             return true;
     }
    
    
   
      static
        {
            blocksEffectiveAgainst = (new Block[] {
                Block.planks, Block.wood, Block.chest,Block.pumpkin, Block.pumpkinLantern
            });
        }
      
      @SideOnly(Side.CLIENT)
      public void registerIcons(IconRegister iconRegister) {

          iconIndex = iconRegister.registerIcon("floracraft" + ":" + this.getUnlocalizedName().substring(5));
      }

}
