import java.util.ArrayList;
import java.util.List;

public class import java.util.ArrayList;
import java.util.List;

public class MusicStreamingApp {
    private List<Song> playlist;
    private boolean isPlaying;
    private Song currentSong;

    public MusicStreamingApp() {
        this.playlist = new ArrayList<>();
        this.isPlaying = false;
        this.currentSong = null;
    }

    public void addSong(Song song) {
        playlist.add(song);
    }

    public void removeSong(Song song) {
        playlist.remove(song);
    }

    public void play() {
        if (!playlist.isEmpty()) {
            currentSong = playlist.get(0);
            isPlaying = true;
            System.out.println("Now playing: " + currentSong.getTitle() + " by " + currentSong.getArtist());
        } else {
            System.out.println("Playlist is empty. Add songs to your playlist first.");
        }
    }

    public void pause() {
        if (isPlaying) {
            System.out.println("Paused: " + currentSong.getTitle());
            isPlaying = false;
        } else {
            System.out.println("No song is currently playing.");
        }
    }

    public void next() {
        int currentIndex = playlist.indexOf(currentSong);
        if (currentIndex < playlist.size() - 1) {
            currentSong = playlist.get(currentIndex + 1);
            System.out.println("Now playing: " + currentSong.getTitle() + " by " + currentSong.getArtist());
        } else {
            System.out.println("End of playlist reached. Add more songs to continue listening.");
            isPlaying = false;
        }
    }

    public static void main(String[] args) {
        MusicStreamingApp app = new MusicStreamingApp();


        app.addSong(new Song("Song 1", "Artist 1", "url1"));
        app.addSong(new Song("Song 2", "Artist 2", "url2"));
        app.addSong(new Song("Song 3", "Artist 3", "url3"));


        app.play();


        app.next();
        app.pause();
    }
}
 {
    private List<Song> playlist;
    private boolean isPlaying;
    private Song currentSong;

    public MusicStreamingApp() {
        this.playlist = new ArrayList<>();
        this.isPlaying = false;
        this.currentSong = null;
    }

    public void addSong(Song song) {
        playlist.add(song);
    }

    public void removeSong(Song song) {
        playlist.remove(song);
    }

    public void play() {
        if (!playlist.isEmpty()) {
            currentSong = playlist.get(0);
            isPlaying = true;
            System.out.println("Now playing: " + currentSong.getTitle() + " by " + currentSong.getArtist());
        } else {
            System.out.println("Playlist is empty. Add songs to your playlist first.");
        }
    }

    public void pause() {
        if (isPlaying) {
            System.out.println("Paused: " + currentSong.getTitle());
            isPlaying = false;
        } else {
            System.out.println("No song is currently playing.");
        }
    }

    public void next() {
        int currentIndex = playlist.indexOf(currentSong);
        if (currentIndex < playlist.size() - 1) {
            currentSong = playlist.get(currentIndex + 1);
            System.out.println("Now playing: " + currentSong.getTitle() + " by " + currentSong.getArtist());
        } else {
            System.out.println("End of playlist reached. Add more songs to continue listening.");
            isPlaying = false;
        }
    }

    public static void main(String[] args) {
        MusicStreamingApp app = new MusicStreamingApp();


        app.addSong(new Song("Song 1", "Artist 1", "url1"));
        app.addSong(new Song("Song 2", "Artist 2", "url2"));
        app.addSong(new Song("Song 3", "Artist 3", "url3"));


        app.play();


        app.next();
        app.pause();
    }
}
