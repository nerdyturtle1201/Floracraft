package com.nerdyturtle.floracraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class DeathNettle extends BlockFlower{
    protected DeathNettle(int id, Material material) {
        super(id, Material.plants);
        this.setUnlocalizedName("deathNettle");
}

    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        par5Entity.attackEntityFrom(DamageSource.cactus, 1);
    }
    public void onEntityWalking(World world, int i, int j, int k, Entity entity)
    {
            if(entity instanceof EntityLiving)
            {
             ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.poison.id, 10 * 20, 0));
             ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 5 * 20, 0));
            }
    }
    public boolean isOpaqueBlock(){
        return false;
    }
    public boolean renderAsNormalBlock(){
        return false;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {

        blockIcon = iconRegister.registerIcon("floracraft" + ":" + this.getUnlocalizedName().substring(5));
    }



}
