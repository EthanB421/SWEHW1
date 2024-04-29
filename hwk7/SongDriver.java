package hwk7;

import java.util.ArrayList;

public class SongDriver {
    public static void main(String[] args) {
        Song song1 = new Song("I KNOW ?", "Travis Scott", "UTOPIA", 3);
        Song song2 = new Song("Over You", "Vacations", "No Place Like Home", 3);
        Song song3 = new Song("Ryd", "Steve Lacey", "Demo", 2);
        Song song4 = new Song("Ryd", "YG", "album2", 3);
        Song song5 = new Song("Notion", "Rare Occasion", "Notion", 3);
        Song song6 = new Song("Bad Dream", "Wallows", "Bad Dream", 3);
        Song song7 = new Song("Bad Dream", "One Direction", "Bad Dream", 3);

        Song[] allSongs = {song1, song2, song3, song4, song5, song6, song7};
        ConcreteSongService spotifyBackend = new ConcreteSongService();
        for(Song song: allSongs)
        {
            spotifyBackend.upload(song);
        }

        SongProxy spotify = new SongProxy(spotifyBackend);
        spotify.searchById(0);
        spotify.searchById(0);
        spotify.searchById(2);
        spotify.searchById(2);
        spotify.searchByTitle("Ryd");
        spotify.searchByTitle("Ryd");
        spotify.searchByTitle("Notion");
        spotify.searchByAlbum("Bad Dream");
    }
}
