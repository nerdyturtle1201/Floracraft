package com.nerdyturtle.floracraft.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityCrystalineSpike extends EntityThrowable{
    
    private float explosionRadius = 0.4F;
    public EntityCrystalineSpike(World par1World)
    {
        super(par1World);
        setSpeed();
        
    }
    private void setSpeed()
    {    
        setThrowableHeading(this.motionX, this.motionY, this.motionZ, 3.0F, 1.0F);
    }
    public EntityCrystalineSpike(World par1World, EntityLiving par2EntityLiving)
    {
        super(par1World, par2EntityLiving);
    }
    public EntityCrystalineSpike(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
    @Override
    protected void onImpact(MovingObjectPosition movingobjectposition){
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius , true);        
        this.setDead();
    }
    @Override
    protected float getGravityVelocity() 
    {
        return 0;
    }

}
