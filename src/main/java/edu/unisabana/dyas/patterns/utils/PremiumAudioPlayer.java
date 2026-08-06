package edu.unisabana.dyas.patterns.utils;

// Clase de un proveedor externo distinto, con una interfaz incompatible con AudioPlayer/AdvancedAudioPlayer
public class PremiumAudioPlayer {
    public void playAudio(String codec, String path, int volumePercent) {
        System.out.println("[Premium] Reproduciendo (" + codec + ") " + path + " al " + volumePercent + "% de volumen");
    }

    public void halt() {
        System.out.println("[Premium] Reproducción detenida");
    }
}
