package com.nerdyturtle.floracraft.item;

import com.nerdyturtle.floracraft.entity.EntityCrystalineSpike;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CrystalLauncher extends Item {
    
    public CrystalLauncher(int id){
        super(id);
        this.setUnlocalizedName("crystalLauncher");
    }
    
    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,EntityPlayer par3EntityPlayer) {
      if(par3EntityPlayer.capabilities.isCreativeMode||par3EntityPlayer.inventory.consumeInventoryItem(FloracraftItems.crystalinespike.itemID))
      {
        par2World.playSoundAtEntity(par3EntityPlayer, "crystalinespike", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        if (!par2World.isRemote)
        {
          par2World.spawnEntityInWorld(new EntityCrystalineSpike(par2World, par3EntityPlayer));
        }
      }
      return par1ItemStack;
      }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        iconIndex = iconRegister.registerIcon("floracraft" + ":" + this.getUnlocalizedName().substring(5));
    }
    

}
