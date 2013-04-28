package com.nerdyturtle.floracraft.client.audio;

import com.nerdyturtle.floracraft.Floracraft;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class Sounds {
    
    @ForgeSubscribe
    public void onSound(SoundLoadEvent event)
    {
        try
        {
             String [] soundFiles = {
                     "crystalinespike.wav",
                     };
             for (int i = 0; i < soundFiles.length; i++){
                 event.manager.soundPoolSounds.addSound(soundFiles[i], Floracraft.class.getResource("/mods/floracraft/sounds/" + soundFiles[i]));
             }
       
        }
        catch (Exception e)
        {
            System.err.println("Floracraft failed to load sound files.");
        }

}
}
