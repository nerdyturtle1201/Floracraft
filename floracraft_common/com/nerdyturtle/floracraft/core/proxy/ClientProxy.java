package com.nerdyturtle.floracraft.core.proxy;

import com.nerdyturtle.floracraft.client.audio.Sounds;
import com.nerdyturtle.floracraft.client.render.RenderCrystalineSpike;
import com.nerdyturtle.floracraft.entity.EntityCrystalineSpike;


import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy{

    @Override 
    public void initRenderingandTextures(){
      
    }
    @Override
    public void registerRenderers() {
        super.registerRenderers();
        EntityRegistry.registerGlobalEntityID(EntityCrystalineSpike.class, "CrystalineSpike", ModLoader.getUniqueEntityId());
        RenderingRegistry.registerEntityRenderingHandler(EntityCrystalineSpike.class, new RenderCrystalineSpike());
        }
    @Override 
    public void initTileEntities(){
        
    }
    @Override
    public void registerSoundHandler() {

        MinecraftForge.EVENT_BUS.register(new Sounds());
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
