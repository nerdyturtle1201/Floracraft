package com.nerdyturtle.floracraft.core.helpers;

import java.util.logging.Level;
import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;

public class LogHelper {
    private static Logger floracraftLogger = Logger.getLogger("Floracraft");

public static void init() {
    floracraftLogger.setParent(FMLLog.getLogger());
}

public static void log(Level logLevel, String message) {
    floracraftLogger.log(logLevel, message);
}


}
