package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AdvancedAudioAdapter;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.AudioPlayer;
import edu.unisabana.dyas.patterns.utils.PremiumAudioAdapter;
import edu.unisabana.dyas.patterns.utils.PremiumAudioPlayer;

public class Client {

    public static void main(String[] args) {

        AudioPlayer advancedPlayer =
                new AdvancedAudioAdapter(new AdvancedAudioPlayer());

        advancedPlayer.play("mp4", "video.mp4");
        advancedPlayer.play("vlc", "video.vlc");
        advancedPlayer.stop();

        AudioPlayer premiumPlayer =
                new PremiumAudioAdapter(new PremiumAudioPlayer());

        premiumPlayer.play("flac", "album.flac");
        premiumPlayer.play("aac", "song.aac");
        premiumPlayer.stop();
    }
}