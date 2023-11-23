

public abstract class Music {
    private String title;
    private String artist;
    private int release_date;

    public Music(String title, String _artist, int _release_date) {
        artist = _artist;
        release_date = _release_date;
        this.title = title;
    }

    public Music(String title, String _artist) {
        artist = _artist;
        this.title = title;
    }
    
    public Music(String title, int releaseDate) {
        this.title = title;
        release_date = releaseDate;
    }

    public Music(String title) {
        this.title = title;
    }

    public Music() {

    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public abstract double getDuration();

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getReleaseDate() {
        return release_date;
    }
}
