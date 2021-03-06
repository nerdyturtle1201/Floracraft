package com.nerdyturtle.floracraft.core;

public enum FloracraftToolMaterial {
    
NETTLE(2, 400, 2.0F, 5, 15);
    

    private final int harvestLevel;

    private final int maxUses;

    private final float efficiencyOnProperMaterial;

    private final int damageVsEntity;

    private final int enchantability;

    private FloracraftToolMaterial(int par3, int par4, float par5, int par6, int par7)
    {
        this.harvestLevel = par3;
        this.maxUses = par4;
        this.efficiencyOnProperMaterial = par5;
        this.damageVsEntity = par6;
        this.enchantability = par7;
    }

    public int getMaxUses()
    {
        return this.maxUses;
    }

    public float getEfficiencyOnProperMaterial()
    {
        return this.efficiencyOnProperMaterial;
    }

    public int getDamageVsEntity()
    {
        return this.damageVsEntity;
    }

    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }

    public int getEnchantability()
    {
        return this.enchantability;
    }


}
