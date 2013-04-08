package com.nerdyturtle.floracraft.core.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ClientProxy extends CommonProxy{

    @Override 
    public void initRenderingandTextures(){
        
    }
    @Override 
    public void initTileEntities(){
        
    }
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world,
            int x, int y, int z) {
        return null;
    }
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world,
            int x, int y, int z) {
        return null;
    }

}
