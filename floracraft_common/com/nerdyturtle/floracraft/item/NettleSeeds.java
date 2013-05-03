package com.nerdyturtle.floracraft.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class NettleSeeds extends ItemSeeds {
    
    public NettleSeeds(int i, int blockID, int blockID2) {
        super(i,blockID,blockID2);
        this.setUnlocalizedName("nettleSeeds");
}
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        itemIcon = iconRegister.registerIcon("floracraft" + ":" + this.getUnlocalizedName().substring(5));
    }
    



}
