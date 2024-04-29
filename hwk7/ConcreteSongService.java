package hwk7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConcreteSongService implements SongService {
    private int songID = 0;
    private HashMap<Integer, Song> hashMapID;

    public ConcreteSongService()
    {
        this.hashMapID = new HashMap<Integer, Song>();
    }
    @Override
    public Song searchById(Integer songID) {
        try {
            Thread.sleep(1000);
            } catch (Exception e) {}
            
        return this.hashMapID.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
            } catch (Exception e) {}
            
        ArrayList<Song> searchTitleResult = new ArrayList<>();
        for(Song song : hashMapID.values())
        {
            if(song.getTitle().equals(title))
            {
                searchTitleResult.add(song);
            }
        }
        return searchTitleResult;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
            } catch (Exception e) {}
            
        ArrayList<Song> searchAlbumResult = new ArrayList<>();
        for(Song song : hashMapID.values())
        {
            if(song.getAlbum().equals(album))
            {
                searchAlbumResult.add(song);
            }
        }
        return searchAlbumResult;
    }

    public void upload(Song song)
    {
        hashMapID.put(this.songID, song);
        songID++;
    }
    
}
