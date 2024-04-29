package hwk7;


public class Song{
    String title;
    String artist;
    String album;
    int duration;
    public Song(String title, String artist, String album, int duration){
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public  void printSong()
    {
        System.out.println("The song title is: "+title+"\nBy: "+artist+"\nAlbum: "+album+"\nDuration: "+duration);
    }

    public String getTitle()
    {
        return title;
    }

    public String getAlbum()
    {
        return album;
    }
}
