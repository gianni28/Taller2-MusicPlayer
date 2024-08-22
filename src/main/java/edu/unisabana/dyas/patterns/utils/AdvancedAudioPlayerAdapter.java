package edu.unisabana.dyas.patterns.utils;

public class AdvancedAudioPlayerAdapter implements AudioPlayer {
    private AdvancedAudioPlayer advancedAudioPlayer;

    // Constructor que toma una instancia de AdvancedAudioPlayer
    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        // Adaptamos las llamadas según el tipo de audio
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedAudioPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedAudioPlayer.playVlc(fileName);
        } else {
            System.out.println("Tipo de audio no soportado: " + audioType);
        }
    }

    @Override
    public void stop() {
        // Delegamos la llamada al método stop de AdvancedAudioPlayer
        advancedAudioPlayer.stop();
    }
}
