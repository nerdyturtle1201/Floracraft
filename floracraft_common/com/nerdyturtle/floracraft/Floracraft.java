package com.nerdyturtle.floracraft;

import net.minecraftforge.common.MinecraftForge;

import com.nerdyturtle.floracraft.block.FloracraftBlocks;
import com.nerdyturtle.floracraft.configuration.ConfigurationHandler;
import com.nerdyturtle.floracraft.core.handlers.FloracraftLocalizationHandler;
import com.nerdyturtle.floracraft.core.helpers.FloracraftChestGenHelper;
import com.nerdyturtle.floracraft.core.helpers.FloracraftDropsHelper;
import com.nerdyturtle.floracraft.core.helpers.LogHelper;
import com.nerdyturtle.floracraft.core.proxy.CommonProxy;
import com.nerdyturtle.floracraft.gen.FloracraftWorldGenerator;
import com.nerdyturtle.floracraft.item.FloracraftItems;
import com.nerdyturtle.floracraft.network.FloracraftPacketHandler;
import com.nerdyturtle.floracraft.recipe.FloracraftRecipes;
import com.nerdyturtle.floracraft.tick.PlayerTickHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = "Floracraft", name = "Floracraft", version = "1.0.0")
@NetworkMod(channels = {"Floracraft"}, clientSideRequired = true, serverSideRequired = false, packetHandler = FloracraftPacketHandler.class)

public class Floracraft {
    @Instance("Floracraft")
    public static Floracraft instance;

    
    
    @PreInit
    public void preinit(FMLPreInitializationEvent event){
        //Starts logger
        LogHelper.init();
        //Loads Configuration
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        //Loads Dev Capes
        CommonProxy.proxy.initCapes();
        //Loads Localizations(Languages)
        FloracraftLocalizationHandler.loadLanguages();
        //Loads Tick Handlers
        CommonProxy.proxy.initTickHandlers();

        
        
    }
    @Init
    public void load(FMLInitializationEvent event){
        //Loads Drop Handler
        MinecraftForge.EVENT_BUS.register(new FloracraftDropsHelper());
        //Loads Chest Gen Handler
        FloracraftChestGenHelper.init();
        //Loads Recipes
        FloracraftRecipes.init();
        //Loads Items
        FloracraftBlocks.init();
        //Loads Blocks
        FloracraftItems.init();
        //Proxy information
        CommonProxy.proxy.initRenderingandTextures();
        CommonProxy.proxy.initTileEntities();
        CommonProxy.proxy.registerRenderers();
        NetworkRegistry.instance().registerGuiHandler(instance, CommonProxy.proxy);
        //World Generator
        GameRegistry.registerWorldGenerator(new FloracraftWorldGenerator());
    }
    @PostInit
    public void postInit(FMLPostInitializationEvent event){
        
    }

}
