package com.nerdyturtle.floracraft.block;

import com.nerdyturtle.floracraft.lib.BlockIds;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;

public class FloracraftBlocks {
    
    public static BlockFlower bioflower;
    public static BlockFlower ironlotus;
    public static BlockFlower flamethorn;
    public static BlockFlower nettle;
    public static BlockFlower deathnettle;
    public static BlockFlower aerolily;
    public static Block creeperpod;
    public static Block lyreplant;
    public static Block waterpearlplant;
    public static Block lavapearlplant;
    public static Block mossbeak;
    public static Block bamboo;
    public static Block researchtable;
    public static Block ironlotusplant;
    public static Block crystalblossom;
    public static Block deathbloom;
    public static Block enderorchid;
    public static Block nettleplant;
    public static Block skullbramble;

    
    @SuppressWarnings("deprecation")
    public static void init(){
        
        bioflower = (BlockFlower)new Bioflower(BlockIds.BIOFLOWER, Material.plants);
        ironlotus = (BlockFlower)new IronLotus(BlockIds.IRONLOTUS, Material.plants);
        flamethorn = (BlockFlower)new FlameThorn(BlockIds.FLAMETHORN, Material.plants);
        nettle = (BlockFlower)new Nettle(BlockIds.NETTLE, Material.plants);
        deathnettle = (BlockFlower)new DeathNettle(BlockIds.DEATHNETTLE, Material.plants);
        aerolily = (BlockFlower)new Aerolily(BlockIds.AEROLILY, Material.plants);
        creeperpod = new CreeperPod(BlockIds.CREEPERPOD, Material.plants).setHardness(0F);
        lyreplant = new LyrePlant(BlockIds.LYREPLANT, Material.plants).setHardness(0F);
        waterpearlplant = new WaterPearlPlant(BlockIds.WATERPEARLPLANT, Material.plants).setHardness(0F);
        lavapearlplant = new LavaPearlPlant(BlockIds.LAVAPEARLPLANT, Material.plants).setHardness(0F);
        mossbeak = new MossBeak(BlockIds.MOSSBEAK, Material.plants).setHardness(0F);
        //bamboo = new Bamboo(BlockIds.BAMBOO);
        ironlotusplant = new IronLotusCrop(BlockIds.IRONLOTUSCROP, Material.plants);
        crystalblossom = new CrystalBlossom(BlockIds.CRYSTALBLOSSOM, Material.plants);
        skullbramble = new SkullBramble(BlockIds.SKULLBRAMBLE, Material.plants);
        nettleplant = new NettlePlant(BlockIds.NETTLEPLANT, Material.plants);
        deathbloom = new DeathBloom(BlockIds.DEATHBLOOM, Material.plants);
        enderorchid = new EnderOrchid(BlockIds.ENDERORCHID, Material.plants);
        researchtable = new ResearchTable(BlockIds.RESEARCHTABLE, Material.iron);
        
        
        GameRegistry.registerBlock(bioflower);
        GameRegistry.registerBlock(ironlotus);
        GameRegistry.registerBlock(ironlotusplant);
        GameRegistry.registerBlock(flamethorn);
        GameRegistry.registerBlock(nettle);
        GameRegistry.registerBlock(creeperpod);
        GameRegistry.registerBlock(lyreplant);
        GameRegistry.registerBlock(lavapearlplant);
        GameRegistry.registerBlock(waterpearlplant);
        GameRegistry.registerBlock(mossbeak);
        GameRegistry.registerBlock(bamboo);
        GameRegistry.registerBlock(researchtable);
        GameRegistry.registerBlock(aerolily);
        GameRegistry.registerBlock(crystalblossom);
        GameRegistry.registerBlock(deathbloom);
        GameRegistry.registerBlock(enderorchid);
        GameRegistry.registerBlock(nettleplant);
        GameRegistry.registerBlock(skullbramble);
        LanguageRegistry.addName(aerolily, "Aerolily");
        LanguageRegistry.addName(bioflower, "Bioflower");
        LanguageRegistry.addName(ironlotus, "Iron Lotus");
        LanguageRegistry.addName(flamethorn, "Flame Thorn");
        LanguageRegistry.addName(nettle, "Nettle");
        LanguageRegistry.addName(researchtable, "Research Table");
        
    }


}
