package com.nerdyturtle.floracraft.core.handlers;

import com.nerdyturtle.floracraft.core.helpers.FloracraftLocalizationHelper;
import com.nerdyturtle.floracraft.lib.FloracraftLocalizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class FloracraftLocalizationHandler {
    
    public static void loadLanguages() {

        for (String localizationFile : FloracraftLocalizations.localizationFiles) {
            LanguageRegistry.instance().loadLocalization(localizationFile, FloracraftLocalizationHelper.getLocaleFromFileName(localizationFile), FloracraftLocalizationHelper.isXMLFile(localizationFile));
        }
    }

}
