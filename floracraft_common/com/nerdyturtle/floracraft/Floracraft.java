package com.nerdyturtle.floracraft;

import com.nerdyturtle.floracraft.network.FloracraftPacketHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "Floracraft", name = "Floracraft", version = "1.0.0")
@NetworkMod(channels = {"Floracraft"}, clientSideRequired = true, serverSideRequired = false, packetHandler = FloracraftPacketHandler.class)

public class Floracraft {
    @Instance("Floracraft")
    public static Floracraft instance;
    
    
    @PreInit
    public void preinit(FMLPreInitializationEvent event){
        
    }
    @Init
    public void load(FMLInitializationEvent event){
        
    }
    @PostInit
    public void postInit(FMLPostInitializationEvent event){
        
    }

}
