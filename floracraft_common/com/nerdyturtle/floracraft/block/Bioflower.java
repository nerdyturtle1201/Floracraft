package com.nerdyturtle.floracraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class Bioflower extends BlockFlower{
    
    public Bioflower(int id, Material material){
        super(id, Material.plants);
        this.setUnlocalizedName("bioflower");
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        blockIcon = iconRegister.registerIcon("floracraft" + ":" + this.getUnlocalizedName().substring(5));
    }

}
