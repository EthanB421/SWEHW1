package hwk7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongProxy implements SongService {

    private SongService songService;
    private Map<Integer, Song> cacheId;
    private Map<String, List<Song>> cacheTitle;
    private Map<String, List<Song>> cacheAlbum;

    public SongProxy(SongService songService)
    {
        this.songService = songService;
        this.cacheId = new HashMap<>();
        this.cacheTitle = new HashMap<>();
        this.cacheAlbum = new HashMap<>();
    }
    @Override
    public Song searchById(Integer songID) {
        if(cacheId.containsKey(songID))
        {
            System.out.println("This song is in the cache!");
        }else{
            System.out.println("This song is not in the cache, adding it now...");
            this.cacheId.put(songID, this.songService.searchById(songID));
        }
        System.out.println("Song with ID: "+songID);
        cacheId.get(songID).printSong();
        return cacheId.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        if(cacheTitle.containsKey(title))
        {
            System.out.println("This song is in the cache!");
        }else{
            System.out.println("This song is not in the cache, adding it now...");
            this.cacheTitle.put(title, this.songService.searchByTitle(title));
        }
        System.out.println("Songs by the name of: "+title);
        for(List<Song> songList : cacheTitle.values())
        {
            for(Song song : songList)
            {
                if(song.getTitle().equals(title))
                song.printSong();
            }
        }
        return cacheTitle.get(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        if(cacheAlbum.containsKey(album))
        {
            System.out.println("This song is in the cache!");
        }else{
            System.out.println("This song is not in the cache, adding it now...");
            this.cacheAlbum.put(album, this.songService.searchByAlbum(album));
        }
        System.out.println("Songs from the album: "+album);
        for(List<Song> songList : cacheAlbum.values())
        {
            for(Song song : songList)
            {
                if(song.getAlbum().equals(album))
                song.printSong();
            }
        }
        return cacheAlbum.get(album);
    }
    
}
