package edu.unisabana.dyas.patterns.utils;

public class PremiumAudioAdapter implements AudioPlayer {

    private static final int DEFAULT_VOLUME = 80;

    private final PremiumAudioPlayer premiumAudioPlayer;

    public PremiumAudioAdapter(PremiumAudioPlayer premiumAudioPlayer) {
        this.premiumAudioPlayer = premiumAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        premiumAudioPlayer.playAudio(
                audioType,
                fileName,
                DEFAULT_VOLUME
        );
    }

    @Override
    public void stop() {
        premiumAudioPlayer.halt();
    }
}