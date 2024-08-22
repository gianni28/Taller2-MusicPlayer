package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayerAdapter;
import edu.unisabana.dyas.patterns.utils.AudioPlayer;

public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AdvancedAudioPlayerAdapter(new AdvancedAudioPlayer());

        // Ahora utilizamos la interfaz AudioPlayer a través del adaptador
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.stop();
        
        // Puedes añadir más ejemplos si lo necesitas
        audioPlayer.play("vlc", "movie.vlc");
        audioPlayer.stop();
    }
}

