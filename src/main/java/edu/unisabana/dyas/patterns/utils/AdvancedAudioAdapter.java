package edu.unisabana.dyas.patterns.utils;

public class AdvancedAudioAdapter implements AudioPlayer {

    private final AdvancedAudioPlayer advancedAudioPlayer;

    public AdvancedAudioAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("mp4".equalsIgnoreCase(audioType)) {
            advancedAudioPlayer.playMp4(fileName);
        } else if ("vlc".equalsIgnoreCase(audioType)) {
            advancedAudioPlayer.playVlc(fileName);
        }
    }

    @Override
    public void stop() {
        advancedAudioPlayer.stop();
    }
}