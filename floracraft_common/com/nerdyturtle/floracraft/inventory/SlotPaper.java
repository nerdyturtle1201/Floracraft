package com.nerdyturtle.floracraft.inventory;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SlotPaper extends Slot {
    
    public SlotPaper(IInventory inventory, int x, int y, int z) {

        super(inventory, x, y, z);
    }

    @Override
    public boolean isItemValid(ItemStack itemStack) {

        return itemStack.itemID == Item.paper.itemID;
    }

}
