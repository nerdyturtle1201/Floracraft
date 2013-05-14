package com.nerdyturtle.floracraft.configuration;

import java.io.File;
import java.util.logging.Level;

import com.nerdyturtle.floracraft.lib.BlockIds;
import com.nerdyturtle.floracraft.lib.ItemIds;
import com.nerdyturtle.floracraft.lib.Strings;

import cpw.mods.fml.common.FMLLog;
import net.minecraftforge.common.Configuration;


public class ConfigurationHandler {

    public static void init(File configFile) {
            Configuration configuration = new Configuration(configFile);

            try {
                configuration.load();
                
                ItemIds.AEROLILYPETAL = configuration
                        .getItem(Strings.AEROLILYPETAL_NAME, ItemIds.AEROLILYPETAL_DEFAULT)
                        .getInt(ItemIds.AEROLILYPETAL_DEFAULT);
                       ItemIds.BAMBOOITEM = configuration
                        .getItem(Strings.BAMBOOITEM_NAME, ItemIds.BAMBOOITEM_DEFAULT)
                        .getInt(ItemIds.BAMBOOITEM_DEFAULT);
                       ItemIds.CALCIFIEDTENDRIL = configuration
                        .getItem(Strings.CALCIFIEDTENDRIL_NAME, ItemIds.CALCIFIEDTENDRIL_DEFAULT)
                        .getInt(ItemIds.CALCIFIEDTENDRIL_DEFAULT);
                       ItemIds.CREEPERPODSPORES = configuration
                        .getItem(Strings.CREEPERPODSPORES_NAME, ItemIds.CREEPERPODSPORES_DEFAULT)
                        .getInt(ItemIds.CREEPERPODSPORES_DEFAULT);
                       ItemIds.CRYSTALINESPIKE = configuration
                        .getItem(Strings.CRYSTALINESPIKE_NAME, ItemIds.CRYSTALINESPIKE_DEFAULT)
                        .getInt(ItemIds.CRYSTALINESPIKE_DEFAULT);
                       ItemIds.CRYSTALSEED = configuration
                        .getItem(Strings.CRYSTALSEED_NAME, ItemIds.CRYSTALSEED_DEFAULT)
                        .getInt(ItemIds.CRYSTALSEED_DEFAULT);
                       ItemIds.DEATHBLOOMSEEDLING = configuration
                            .getItem(Strings.DEATHBLOOMSEEDLING_NAME, ItemIds.DEATHBLOOMSEEDLING_DEFAULT)
                            .getInt(ItemIds.DEATHBLOOMSEEDLING_DEFAULT);
                       ItemIds.DEATHPETAL = configuration
                            .getItem(Strings.DEATHPETAL_NAME, ItemIds.DEATHPETAL_DEFAULT)
                            .getInt(ItemIds.DEATHPETAL_DEFAULT);
                       ItemIds.ENDERSEEDS = configuration
                            .getItem(Strings.ENDERSEEDS_NAME, ItemIds.ENDERSEEDS_DEFAULT)
                            .getInt(ItemIds.ENDERSEEDS_DEFAULT);
                       ItemIds.IRONLOTUSSEEDS = configuration
                            .getItem(Strings.IRONLOTUSSEEDS_NAME, ItemIds.IRONLOTUSSEEDS_DEFAULT)
                            .getInt(ItemIds.IRONLOTUSSEEDS_DEFAULT);
                       ItemIds.IRONPETAL = configuration
                            .getItem(Strings.IRONPETAL_NAME, ItemIds.IRONPETAL_DEFAULT)
                            .getInt(ItemIds.IRONPETAL_DEFAULT);
                       ItemIds.LAVAPEARL = configuration
                            .getItem(Strings.LAVAPEARL_NAME, ItemIds.LAVAPEARL_DEFAULT)
                            .getInt(ItemIds.LAVAPEARL_DEFAULT);
                       ItemIds.LAVAPEARLSEEDS = configuration
                            .getItem(Strings.LAVAPEARLSEEDS_NAME, ItemIds.LAVAPEARLSEEDS_DEFAULT)
                            .getInt(ItemIds.LAVAPEARLSEEDS_DEFAULT);
                       ItemIds.LYREPLANTSEEDS = configuration
                            .getItem(Strings.LYREPLANTSEEDS_NAME, ItemIds.LYREPLANTSEEDS_DEFAULT)
                            .getInt(ItemIds.LYREPLANTSEEDS_DEFAULT);
                       ItemIds.MOSSBEAKSEEDS = configuration
                            .getItem(Strings.MOSSBEAKSEEDS_NAME, ItemIds.MOSSBEAKSEEDS_DEFAULT)
                            .getInt(ItemIds.MOSSBEAKSEEDS_DEFAULT);
                       ItemIds.NETTLELEAF = configuration
                            .getItem(Strings.NETTLELEAF_NAME, ItemIds.NETTLELEAF_DEFAULT)
                            .getInt(ItemIds.NETTLELEAF_DEFAULT);
                       ItemIds.NETTLESEEDS_ = configuration
                            .getItem(Strings.NETTLESEEDS_NAME, ItemIds.NETTLESEEDS_DEFAULT)
                            .getInt(ItemIds.NETTLESEEDS_DEFAULT);
                       ItemIds.NETTLESWORD_ = configuration
                            .getItem(Strings.NETTLESWORD_NAME, ItemIds.NETTLESWORD_DEFAULT)
                            .getInt(ItemIds.NETTLESWORD_DEFAULT);
                       ItemIds.PLANTASH = configuration
                            .getItem(Strings.PLANTASH_NAME, ItemIds.PLANTASH_DEFAULT)
                            .getInt(ItemIds.PLANTASH_DEFAULT);
                       ItemIds.PLANTMUTAGEN = configuration
                            .getItem(Strings.PLANTMUTAGEN_NAME, ItemIds.PLANTMUTAGEN_DEFAULT)
                            .getInt(ItemIds.PLANTMUTAGEN_DEFAULT);
                       ItemIds.WATERPEARL = configuration
                            .getItem(Strings.WATERPEARL_NAME, ItemIds.WATERPEARL_DEFAULT)
                            .getInt(ItemIds.WATERPEARL_DEFAULT);
                       ItemIds.WATERPEARLSEEDS = configuration
                            .getItem(Strings.WATERPEARLSEEDS_NAME, ItemIds.WATERPEARLSEEDS_DEFAULT)
                            .getInt(ItemIds.WATERPEARLSEEDS_DEFAULT);
                       ItemIds.RAWDNA = configuration
                                .getItem(Strings.RAWDNA_NAME, ItemIds.RAWDNA_DEFAULT)
                                .getInt(ItemIds.RAWDNA_DEFAULT);
                       ItemIds.CRYSTALLAUNCHER = configuration
                               .getItem(Strings.CRYSTALLAUNCHER_NAME, ItemIds.CRYSTALLAUNCHER_DEFAULT)
                               .getInt(ItemIds.CRYSTALLAUNCHER_DEFAULT);
                       ItemIds.FARMHELMET = configuration
                               .getItem(Strings.FARMHELMET_NAME, ItemIds.FARMHELMET_DEFAULT)
                               .getInt(ItemIds.FARMHELMET_DEFAULT);
                       ItemIds.FARMCHEST = configuration
                               .getItem(Strings.FARMCHEST_NAME, ItemIds.FARMCHEST_DEFAULT)
                               .getInt(ItemIds.FARMCHEST_DEFAULT);
                       ItemIds.FARMLEGS = configuration
                               .getItem(Strings.FARMLEGS_NAME, ItemIds.FARMLEGS_DEFAULT)
                               .getInt(ItemIds.FARMLEGS_DEFAULT);
                       ItemIds.FARMBOOTS = configuration
                               .getItem(Strings.FARMBOOTS_NAME, ItemIds.FARMBOOTS_DEFAULT)
                               .getInt(ItemIds.FARMBOOTS_DEFAULT);
                       
                       BlockIds.AEROLILY = configuration
                                .getItem(Strings.AEROLILY_NAME, BlockIds.AEROLILY_DEFAULT)
                                .getInt(BlockIds.AEROLILY_DEFAULT);
                       BlockIds.BAMBOO = configuration
                                .getItem(Strings.BAMBOO_NAME, BlockIds.BAMBOO_DEFAULT)
                                .getInt(BlockIds.BAMBOO_DEFAULT);
                       BlockIds.BIOFLOWER = configuration
                                .getItem(Strings.BIOFLOWER_NAME, BlockIds.BIOFLOWER_DEFAULT)
                                .getInt(BlockIds.BIOFLOWER_DEFAULT);
                       BlockIds.CREEPERPOD = configuration
                                .getItem(Strings.CREEPERPOD_NAME, BlockIds.CREEPERPOD_DEFAULT)
                                .getInt(BlockIds.CREEPERPOD_DEFAULT);
                       BlockIds.DEATHNETTLE = configuration
                                .getItem(Strings.DEATHNETTLE_NAME, BlockIds.DEATHNETTLE_DEFAULT)
                                .getInt(BlockIds.DEATHNETTLE_DEFAULT);
                       BlockIds.DEATHBLOOM = configuration
                                .getItem(Strings.DEATHBLOOM_NAME, BlockIds.DEATHBLOOM_DEFAULT)
                                .getInt(BlockIds.DEATHBLOOM_DEFAULT);
                       BlockIds.ENDERORCHID = configuration
                                .getItem(Strings.ENDERORCHID_NAME, BlockIds.ENDERORCHID_DEFAULT)
                                .getInt(BlockIds.ENDERORCHID_DEFAULT);
                       BlockIds.FLAMETHORN = configuration
                                .getItem(Strings.FLAMETHORN_NAME, BlockIds.FLAMETHORN_DEFAULT)
                                .getInt(BlockIds.FLAMETHORN_DEFAULT);
                       BlockIds.IRONLOTUS = configuration
                                .getItem(Strings.IRONLOTUS_NAME, BlockIds.IRONLOTUS_DEFAULT)
                                .getInt(BlockIds.IRONLOTUS_DEFAULT);
                       BlockIds.IRONLOTUSCROP = configuration
                                .getItem(Strings.IRONLOTUSCROP_NAME, BlockIds.IRONLOTUSCROP_DEFAULT)
                                .getInt(BlockIds.IRONLOTUSCROP_DEFAULT);
                       BlockIds.LAVAPEARLPLANT = configuration
                                .getItem(Strings.LAVAPEARLPLANT_NAME, BlockIds.LAVAPEARLPLANT_DEFAULT)
                                .getInt(BlockIds.LAVAPEARLPLANT_DEFAULT);
                       BlockIds.LYREPLANT = configuration
                                .getItem(Strings.LYREPLANT_NAME, BlockIds.LYREPLANT_DEFAULT)
                                .getInt(BlockIds.LYREPLANT_DEFAULT);
                       BlockIds.MOSSBEAK = configuration
                                .getItem(Strings.MOSSBEAK_NAME, BlockIds.MOSSBEAK_DEFAULT)
                                .getInt(BlockIds.MOSSBEAK_DEFAULT);
                       BlockIds.NETTLE = configuration
                                .getItem(Strings.NETTLE_NAME, BlockIds.NETTLE_DEFAULT)
                                .getInt(BlockIds.NETTLE_DEFAULT);
                       BlockIds.NETTLEPLANT = configuration
                                .getItem(Strings.NETTLEPLANT_NAME, BlockIds.NETTLEPLANT_DEFAULT)
                                .getInt(BlockIds.NETTLEPLANT_DEFAULT);
                       BlockIds.SKULLBRAMBLE = configuration
                                .getItem(Strings.SKULLBRAMBLE_NAME, BlockIds.SKULLBRAMBLE_DEFAULT)
                                .getInt(BlockIds.SKULLBRAMBLE_DEFAULT);
                       BlockIds.SUNDEW = configuration
                                .getItem(Strings.SUNDEW_NAME, BlockIds.SUNDEW_DEFAULT)
                                .getInt(BlockIds.SUNDEW_DEFAULT);
                       BlockIds.WATERPEARLPLANT = configuration
                                .getItem(Strings.WATERPEARLPLANT_NAME, BlockIds.WATERPEARLPLANT_DEFAULT)
                                .getInt(BlockIds.WATERPEARLPLANT_DEFAULT);
            }
            catch (Exception e) {
                FMLLog.log(Level.SEVERE, e, "Floracraft" + " could not properly load config file.");
            }
            finally {
                configuration.save();
            }
        }

}
