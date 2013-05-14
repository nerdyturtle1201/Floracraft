package com.nerdyturtle.floracraft.item;

import com.nerdyturtle.floracraft.block.FloracraftBlocks;
import com.nerdyturtle.floracraft.core.FloracraftToolMaterial;
import com.nerdyturtle.floracraft.lib.ItemIds;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class FloracraftItems {
    
    public static Item nettleleaf;
    public static Item creeperpodspores;
    public static Item lyreplantseeds;
    public static Item nettlesword;
    public static Item ironpetal;
    public static Item plantash;
    public static Item plantmutagen;
    public static Item waterpearl;
    public static Item lavapearl;
    public static Item waterpearlseeds;
    public static Item lavapearlseeds;
    public static Item mossbeakseeds;
    public static Item bambooitem;
    public static Item ironseeds;
    public static Item aerolilypetal;
    public static Item crystalseed;
    public static Item crystalinespike;
    public static Item calcifiedtendril;
    public static Item nettleseeds;
    public static Item enderseeds;
    public static Item deathbloomseedling;
    public static Item deathpetal;
    public static Item rawdna;
    public static Item crystallauncher;
    public static Item FarmHelmet;
    public static Item FarmChest;
    public static Item FarmLegs;
    public static Item FarmBoots;
    public static Item researchpapers;

    
    public static void init(){
        
        nettleleaf = new NettleLeaf(ItemIds.NETTLELEAF);
        creeperpodspores = new CreeperPodSpores(ItemIds.CREEPERPODSPORES,FloracraftBlocks.creeperpod.blockID,Block.tilledField.blockID);
        lyreplantseeds = new LyrePlantSeeds(ItemIds.LYREPLANTSEEDS, FloracraftBlocks.lyreplant.blockID, Block.tilledField.blockID);
        waterpearlseeds = new WaterPearlSeeds(ItemIds.WATERPEARLSEEDS, FloracraftBlocks.waterpearlplant.blockID, Block.tilledField.blockID);
        lavapearlseeds = new LavaPearlSeeds(ItemIds.LAVAPEARLSEEDS, FloracraftBlocks.lavapearlplant.blockID, Block.tilledField.blockID);
        nettlesword = new NettleSword(ItemIds.NETTLESWORD_, FloracraftToolMaterial.NETTLE);
        mossbeakseeds = new MossBeakSeeds(ItemIds.MOSSBEAKSEEDS, FloracraftBlocks.mossbeak.blockID, Block.cobblestone.blockID);
        ironpetal = new IronPetal(ItemIds.IRONPETAL);
        plantash = new PlantAsh(ItemIds.PLANTASH);
        plantmutagen = new PlantMutagen(ItemIds.PLANTMUTAGEN);
        lavapearl = new LavaPearl(ItemIds.LAVAPEARL);
        waterpearl = new WaterPearl(ItemIds.WATERPEARL);
        //bambooitem = new BambooItem(ItemIds.BAMBOOITEM, FloracraftBlocks.bamboo);
        ironseeds = new IronLotusSeeds(ItemIds.IRONLOTUSSEEDS, FloracraftBlocks.ironlotusplant.blockID, Block.tilledField.blockID);
        aerolilypetal = new AerolilyPetal(ItemIds.AEROLILYPETAL);
        crystalinespike = new CrystalineSpike(ItemIds.CRYSTALINESPIKE);
        crystalseed = new CrystalSeed(ItemIds.CRYSTALSEED, FloracraftBlocks.crystalblossom.blockID, Block.tilledField.blockID);
        calcifiedtendril = new CalcifiedTendril(ItemIds.CALCIFIEDTENDRIL, FloracraftBlocks.skullbramble.blockID, Block.tilledField.blockID);
        nettleseeds = new NettleSeeds(ItemIds.NETTLESEEDS_, FloracraftBlocks.nettleplant.blockID, Block.tilledField.blockID);
        enderseeds = new EnderSeeds(ItemIds.ENDERSEEDS, FloracraftBlocks.enderorchid.blockID, Block.tilledField.blockID);
        deathbloomseedling = new DeathBloomSeedling(ItemIds.DEATHBLOOMSEEDLING, FloracraftBlocks.deathbloom.blockID, Block.tilledField.blockID);
        deathpetal = new DeathPetal(ItemIds.DEATHPETAL);
        rawdna = new RawDna(ItemIds.RAWDNA);
        crystallauncher = new CrystalLauncher(ItemIds.CRYSTALLAUNCHER);
        //FarmHelmet = new FarmArmor(ItemIds.FARMHELMET, FarmArmour, CommonProxy.proxy.initArmor("Farm"), 0).setUnlocalizedName("Tut Helmet");
        //FarmChest = new FarmArmor(ItemIds.FARMCHEST, FarmArmour, CommonProxy.proxy.initArmor("Farm"), 1).setUnlocalizedName("Tut Plate");
        //FarmLegs = new FarmArmor(ItemIds.FARMLEGS, FarmArmour, CommonProxy.proxy.initArmor("Farm"), 2).setUnlocalizedName("Tut Legs");
        // FarmBoots = new FarmArmor(ItemIds.FARMBOOTS, FarmArmour, CommonProxy.proxy.initArmor("Farm"), 3).setUnlocalizedName("Tut Boots");
        researchpapers = new ResearchPapers(ItemIds.RESEARCHPAPERS);  
    }

}
