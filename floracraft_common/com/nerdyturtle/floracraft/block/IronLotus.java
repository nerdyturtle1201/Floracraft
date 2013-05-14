package com.nerdyturtle.floracraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class IronLotus extends BlockFlower{
    
    public IronLotus(int id, Material material){
        super(id, Material.plants);
        this.setUnlocalizedName("ironLotus");
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        blockIcon = iconRegister.registerIcon("floracraft" + ":" + this.getUnlocalizedName().substring(5));
    }

}
