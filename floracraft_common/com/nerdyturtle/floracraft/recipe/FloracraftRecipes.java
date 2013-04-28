package com.nerdyturtle.floracraft.recipe;

import com.nerdyturtle.floracraft.block.FloracraftBlocks;
import com.nerdyturtle.floracraft.item.FloracraftItems;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class FloracraftRecipes {
    public static void init(){
        
        GameRegistry.addRecipe(new ItemStack(FloracraftBlocks.deathnettle),
                new Object[] {" s ","sis"," s ",
                Character.valueOf('s'), FloracraftItems.nettleleaf,
                Character.valueOf('i'), Item.spiderEye
               });
       GameRegistry.addRecipe(new ItemStack(FloracraftItems.lavapearlseeds, 1),
               new Object[] {" i ","igi"," i ",
               Character.valueOf('i'), 
               FloracraftItems.plantash,
               Character.valueOf('g'), 
               Item.wheat
               });
       GameRegistry.addRecipe(new ItemStack(FloracraftItems.waterpearlseeds, 1),
               new Object[] {" i ","igi"," i ",
               Character.valueOf('i'), Item.bucketWater,
               Character.valueOf('g'), Item.seeds
               });
       GameRegistry.addRecipe(new ItemStack(FloracraftItems.deathbloomseedling, 1),
               new Object[] {" i ","igi"," i ",
               Character.valueOf('i'), Block.slowSand,
               Character.valueOf('g'), Block.dirt
               });
       GameRegistry.addRecipe(new ItemStack(FloracraftItems.crystalseed, 1),
               new Object[] {" i ","igi"," i ",
               Character.valueOf('i'), Block.ice,
               Character.valueOf('g'), Item.seeds
               });
       //Tier 2
       GameRegistry.addRecipe(new ItemStack(FloracraftItems.creeperpodspores, 1),
               new Object[] {" i ","rgr"," i ",
               Character.valueOf('r'), FloracraftItems.plantmutagen,
               Character.valueOf('g'), Item.seeds,
               Character.valueOf('i'), FloracraftBlocks.deathnettle
               });
       GameRegistry.addRecipe(new ItemStack(FloracraftItems.enderseeds, 1),
               new Object[] {" i ","rgr"," t ",
               Character.valueOf('i'), FloracraftItems.lavapearl,
               Character.valueOf('g'), Item.seeds,
               Character.valueOf('r'), FloracraftItems.plantmutagen,
               Character.valueOf('t'), FloracraftItems.waterpearl
               });
       GameRegistry.addRecipe(new ItemStack(FloracraftItems.lyreplantseeds, 1),
               new Object[] {" t ","igi"," t ",
               Character.valueOf('i'), FloracraftItems.plantmutagen,
               Character.valueOf('g'), Item.seeds,
               Character.valueOf('t'), FloracraftItems.aerolilypetal
               });
       GameRegistry.addRecipe(new ItemStack(FloracraftItems.calcifiedtendril, 1),
               new Object[] {" d ","igi"," d ",
               Character.valueOf('i'), FloracraftItems.plantmutagen,
               Character.valueOf('g'), Item.seeds,
               Character.valueOf('d'), FloracraftItems.deathpetal
               });
       GameRegistry.addRecipe(new ItemStack(FloracraftItems.crystallauncher, 1),
               new Object[] {"cgi","iii","  s",
               Character.valueOf('i'), Item.ingotIron,
               Character.valueOf('g'), Item.gunpowder,
               Character.valueOf('c'), FloracraftItems.crystalinespike,
               Character.valueOf('s'), Item.stick
               });
       GameRegistry.addRecipe(new ItemStack(FloracraftItems.nettlesword, 1),
               new Object[] {" d "," d "," s ",
               Character.valueOf('d'), FloracraftItems.nettleleaf,
               Character.valueOf('s'), Item.stick
               });
       //Tier 3
       GameRegistry.addRecipe(new ItemStack(FloracraftItems.rawdna, 1),
               new Object[] {" d ","dgd"," d ",
               Character.valueOf('g'), Item.wheat,
               Character.valueOf('d'), FloracraftItems.plantmutagen
               });
       
       
   }
        
        
    }