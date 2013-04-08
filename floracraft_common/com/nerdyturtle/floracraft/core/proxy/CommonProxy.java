package com.nerdyturtle.floracraft.core.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler{
    @SidedProxy(clientSide = "com.nerdyturtle.floracraft.core.proxy.ClientProxy", serverSide= "com.nerdyturtle.floracraft.core.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    public void initRenderingandTextures(){
        
    }
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
