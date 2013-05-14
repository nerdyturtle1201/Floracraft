package com.nerdyturtle.floracraft.tick;

import java.util.EnumSet;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class PlayerTickHandler implements ITickHandler{

    @Override
    public void tickStart(EnumSet<TickType> type, Object... tickData) {

        
    }

    @Override
    public void tickEnd(EnumSet<TickType> type, Object... tickData) {

        
    }

    @Override
    public EnumSet<TickType> ticks() {

        return EnumSet.of(TickType.PLAYER);
    }

    @Override
    public String getLabel() {
        return "Floracraft: Player TickHandler";
    }

}
