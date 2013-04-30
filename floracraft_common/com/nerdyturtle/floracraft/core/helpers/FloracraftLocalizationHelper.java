package com.nerdyturtle.floracraft.core.helpers;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class FloracraftLocalizationHelper {
    public static String getLocaleFromFileName(String fileName) {

        return fileName.substring(fileName.lastIndexOf('/') + 1, fileName.lastIndexOf('.'));
    }

    public static boolean isXMLFile(String fileName) {

        return fileName.endsWith(".xml");
    }
    public static String getLocalizedString(String key) {

        return LanguageRegistry.instance().getStringLocalization(key);
    }

}
