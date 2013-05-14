package com.nerdyturtle.floracraft.tileentity;

import com.nerdyturtle.floracraft.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityResearchTable extends TileEntity implements IInventory {
    
    private ItemStack[] inventory;
    private int researchTime = 200;
    private ItemStack[] researchItemStacks = new ItemStack[3];

    private final int INVENTORY_SIZE = 3;
    
    public TileEntityResearchTable() {

        inventory = new ItemStack[INVENTORY_SIZE];
    }
    public int getSizeInventory() {

        return inventory.length;
    }

    public ItemStack getStackInSlot(int slot) {

        return inventory[slot];
    }

    public ItemStack decrStackSize(int slot, int amount) {

        ItemStack itemStack = getStackInSlot(slot);
        if (itemStack != null) {
            if (itemStack.stackSize <= amount) {
                setInventorySlotContents(slot, null);
            }
            else {
                itemStack = itemStack.splitStack(amount);
                if (itemStack.stackSize == 0) {
                    setInventorySlotContents(slot, null);
                }
            }
        }

        return itemStack;
    }


    public ItemStack getStackInSlotOnClosing(int slot) {

        ItemStack itemStack = getStackInSlot(slot);
        if (itemStack != null) {
            setInventorySlotContents(slot, null);
        }
        return itemStack;
    }


    public void setInventorySlotContents(int slot, ItemStack itemStack) {

        inventory[slot] = itemStack;
        if (itemStack != null && itemStack.stackSize > getInventoryStackLimit()) {
            itemStack.stackSize = getInventoryStackLimit();
        }
    }
    public String getInvName() {

        return "container.researchTable";
    }

    public int getInventoryStackLimit() {

        return 64;
    }

    public void openChest() {

    }

    public void closeChest() {

    }

    public int getResearchTime()
    {
        return this.researchTime;
    }
    private boolean canResearch(){
        if (this.researchItemStacks[1] == null || this.researchItemStacks[2] != null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound) {

        super.readFromNBT(nbtTagCompound);

        NBTTagList tagList = nbtTagCompound.getTagList("Items");
        inventory = new ItemStack[this.getSizeInventory()];
        for (int i = 0; i < tagList.tagCount(); ++i) {
            NBTTagCompound tagCompound = (NBTTagCompound) tagList.tagAt(i);
            byte slot = tagCompound.getByte("Slot");
            if (slot >= 0 && slot < inventory.length) {
                inventory[slot] = ItemStack.loadItemStackFromNBT(tagCompound);
            }
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound) {

        super.writeToNBT(nbtTagCompound);

        NBTTagList tagList = new NBTTagList();
        for (int currentIndex = 0; currentIndex < inventory.length; ++currentIndex) {
            if (inventory[currentIndex] != null) {
                NBTTagCompound tagCompound = new NBTTagCompound();
                tagCompound.setByte("Slot", (byte) currentIndex);
                inventory[currentIndex].writeToNBT(tagCompound);
                tagList.appendTag(tagCompound);
            }
        }
        nbtTagCompound.setTag("Items", tagList);
    }

    public boolean isStackValidForSlot(int i, ItemStack itemstack) {

        return true;
    }
    @Override
    public boolean isInvNameLocalized() {

        return false;
    }
    @Override
    public boolean isUseableByPlayer(EntityPlayer entityplayer) {
        return true;
    }
}