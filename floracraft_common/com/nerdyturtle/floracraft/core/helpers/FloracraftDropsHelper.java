package com.nerdyturtle.floracraft.core.helpers;

import net.minecraft.entity.passive.EntityAnimal;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.ForgeSubscribe;

import com.nerdyturtle.floracraft.item.FloracraftItems;

public class FloracraftDropsHelper {
    
public static double rand;
    
         @ForgeSubscribe
        public void onEntityDrop(LivingDropsEvent event){
            if (event.source.getDamageType().equals("player")) {
                rand = Math.random();
                 if (event.entityLiving instanceof EntityAnimal) {
                      if (rand < 0.10d){ 
                         event.entityLiving.dropItem(FloracraftItems.rawdna.itemID, 1);

                    }
              }
        }
        }
        
    }