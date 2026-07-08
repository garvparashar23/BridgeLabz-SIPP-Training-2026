import java.util.LinkedList;

public class MusicPlaylistRecommendationEngine {
    private static final int HISTORY_LIMIT = 10;
    private final LinkedList<String> recentlyPlayed = new LinkedList<>();

    public void playSong(String songName) {
        String song = songName.trim();
        recentlyPlayed.removeIf(existingSong -> existingSong.equalsIgnoreCase(song));
        recentlyPlayed.addFirst(song);

        if (recentlyPlayed.size() > HISTORY_LIMIT) {
            recentlyPlayed.removeLast();
        }
    }

    public boolean searchSong(String songName) {
        String song = songName.trim();
        for (String existingSong : recentlyPlayed) {
            if (existingSong.equalsIgnoreCase(song)) {
                return true;
            }
        }
        return false;
    }

    public void displayRecentlyPlayed() {
        if (recentlyPlayed.isEmpty()) {
            System.out.println("No songs have been played yet.");
            return;
        }

        System.out.println("Recently played songs:");
        for (int index = 0; index < recentlyPlayed.size(); index++) {
            System.out.println((index + 1) + ". " + recentlyPlayed.get(index));
        }
    }

    public static void main(String[] args) {
        MusicPlaylistRecommendationEngine engine = new MusicPlaylistRecommendationEngine();
        engine.playSong("Shape of You");
        engine.playSong("Believer");
        engine.playSong("Perfect");
        engine.playSong("Believer");
        System.out.println("Found Perfect? " + engine.searchSong("Perfect"));
        engine.displayRecentlyPlayed();
    }
}
