package com.nerdyturtle.floracraft.client.gui;

import org.lwjgl.opengl.GL11;

import com.nerdyturtle.floracraft.inventory.ContainerResearchTable;
import com.nerdyturtle.floracraft.lib.Strings;
import com.nerdyturtle.floracraft.tileentity.TileEntityResearchTable;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.relauncher.Side;


@SideOnly(Side.CLIENT)
public class GuiResearchTable extends GuiContainer{
    
    private TileEntityResearchTable tileResearch;

    public GuiResearchTable(InventoryPlayer player, TileEntityResearchTable tileResearch) {

        super(new ContainerResearchTable(player, tileResearch));
        this.tileResearch = tileResearch;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y) {

        String containerName = tileResearch.isInvNameLocalized() ? tileResearch.getInvName() : StatCollector.translateToLocal(tileResearch.getInvName());
        fontRenderer.drawString(containerName, xSize / 2 - fontRenderer.getStringWidth(containerName) / 2, 6, 4210752);
        fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float opacity, int x, int y) {

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture("/mods/floracraft/gui/research_gui.png");
        int xStart = (width - xSize) / 2;
        int yStart = (height - ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
    }

}
