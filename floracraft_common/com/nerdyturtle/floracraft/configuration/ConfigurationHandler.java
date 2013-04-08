package com.nerdyturtle.floracraft.configuration;

import java.io.File;
import java.util.logging.Level;

import cpw.mods.fml.common.FMLLog;
import net.minecraftforge.common.Configuration;


public class ConfigurationHandler {

    public static void init(File configFile) {
            Configuration configuration = new Configuration(configFile);

            try {
                configuration.load();
            }
            catch (Exception e) {
                FMLLog.log(Level.SEVERE, e, "Floracraft" + " could not properly load config file.");
            }
            finally {
                configuration.save();
            }
        }

}
