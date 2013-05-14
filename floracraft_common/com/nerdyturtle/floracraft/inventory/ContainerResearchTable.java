package com.nerdyturtle.floracraft.inventory;

import com.nerdyturtle.floracraft.tileentity.TileEntityResearchTable;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerResearchTable extends Container{
    
    public ContainerResearchTable(InventoryPlayer inventoryPlayer, TileEntityResearchTable researchTable) {
        //adds slot for item to research
        this.addSlotToContainer(new Slot(researchTable, 0, 55, 52));
        //adds slot for paper
        this.addSlotToContainer(new SlotPaper(researchTable, 1, 88, 52));
        //adds slot for result
        this.addSlotToContainer(new SlotResearchTable(researchTable, 2, 122, 10));

        for (int inventoryRowIndex = 0; inventoryRowIndex < 3; ++inventoryRowIndex) {
            for (int inventoryColumnIndex = 0; inventoryColumnIndex < 9; ++inventoryColumnIndex) {
                this.addSlotToContainer(new Slot(inventoryPlayer, inventoryColumnIndex + inventoryRowIndex * 9 + 9, 8 + inventoryColumnIndex * 18, 94 + inventoryRowIndex * 18));
            }
        }

        for (int actionBarSlotIndex = 0; actionBarSlotIndex < 9; ++actionBarSlotIndex) {
            this.addSlotToContainer(new Slot(inventoryPlayer, actionBarSlotIndex, 8 + actionBarSlotIndex * 18, 152));
        }
    }
    @Override
    public boolean canInteractWith(EntityPlayer entityplayer) {
        return true;
    }
    @Override
    public ItemStack transferStackInSlot(EntityPlayer entityPlayer, int slotIndex) {

        return null;
    }

}
