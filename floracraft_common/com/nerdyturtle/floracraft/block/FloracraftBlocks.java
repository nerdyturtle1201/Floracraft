package com.nerdyturtle.floracraft.block;

import com.nerdyturtle.floracraft.lib.BlockIds;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;

public class FloracraftBlocks {
    
    public static BlockFlower bioflower;
    public static BlockFlower ironlotus;
    public static BlockFlower flamethorn;
    public static BlockFlower nettle;
    public static BlockFlower deathnettle;
    public static BlockFlower aerolily;
    
    public static void init(){
        
        bioflower = (BlockFlower)new Bioflower(BlockIds.BIOFLOWER, Material.plants);
        ironlotus = (BlockFlower)new IronLotus(BlockIds.IRONLOTUS, Material.plants);
        flamethorn = (BlockFlower)new FlameThorn(BlockIds.FLAMETHORN, Material.plants);
        nettle = (BlockFlower)new Nettle(BlockIds.NETTLE, Material.plants);
        deathnettle = (BlockFlower)new DeathNettle(BlockIds.DEATHNETTLE, Material.plants);
        aerolily = (BlockFlower)new Aerolily(BlockIds.AEROLILY, Material.plants);
        
    }

}
