package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.PremiumAudioPlayer;

// Cliente que utiliza directamente AdvancedAudioPlayer y PremiumAudioPlayer,
// cada uno con su propia API incompatible, sin conocer la interfaz AudioPlayer
public class Client {
    public static void main(String[] args) {
        AdvancedAudioPlayer advancedPlayer = new AdvancedAudioPlayer();
        advancedPlayer.playMp4("video.mp4");
        advancedPlayer.stop();

        PremiumAudioPlayer premiumPlayer = new PremiumAudioPlayer();
        premiumPlayer.playAudio("flac", "album.flac", 80);
        premiumPlayer.halt();
    }
}