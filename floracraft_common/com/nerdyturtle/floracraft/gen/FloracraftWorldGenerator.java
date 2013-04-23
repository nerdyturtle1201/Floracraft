package com.nerdyturtle.floracraft.gen;

import java.util.Random;

import com.nerdyturtle.floracraft.block.FloracraftBlocks;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import cpw.mods.fml.common.IWorldGenerator;

public class FloracraftWorldGenerator implements IWorldGenerator{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
          switch(world.provider.dimensionId){
          case -1: generateNether(world, random,chunkX*16,chunkZ*16);
          case 0 : generateSurface(world, random,chunkX*16,chunkZ*16);
          }

    }
    private void generateSurface(World world, Random random, int BlockX, int BlockZ) {
        for(int j=0;j<1;j++){
            int XCoordinate=BlockX + random.nextInt(80);
            int ZCoordinate=BlockZ + random.nextInt(80);
            int YCoordinate=random.nextInt(256);
            (new WorldGenFlowers(FloracraftBlocks.bioflower.blockID)).generate(world, random, XCoordinate,YCoordinate,ZCoordinate);
            (new WorldGenFlowers(FloracraftBlocks.ironlotus.blockID)).generate(world, random, XCoordinate,YCoordinate,ZCoordinate);
            (new WorldGenFlowers(FloracraftBlocks.flamethorn.blockID)).generate(world, random, XCoordinate,YCoordinate,ZCoordinate);
            (new WorldGenFlowers(FloracraftBlocks.nettle.blockID)).generate(world, random, XCoordinate,YCoordinate,ZCoordinate);
            (new WorldGenFlowers(FloracraftBlocks.aerolily.blockID)).generate(world, random, XCoordinate,YCoordinate,ZCoordinate);
    }
        }

private void generateNether(World world, Random random, int i, int j) {
       
       
}

}