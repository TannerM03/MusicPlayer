
public class Song extends Music{
    private double _duration;
    private Album _album;
    private String _album_name;

    public Song(String title, double duration) {
        super(title);
        _duration = duration;
    }
    public Song(String title, double duration, Album album) {
        super(title);
        _album = album;
        _duration = duration;
    }

    public Song() {
        super();
    }

    public void setAlbum(Album album) {
        _album = album;
    }

    public Album getAlbum() {
        return _album;
    }

    public void setAlbumName(String album_name) {
        _album_name = album_name;
    }

    public String getAlbumName() {
        return _album_name;
    }

    public double getDuration() {
        return _duration;
    }

    public String toString() {
        String output;
        if (getArtist() != null) {
            output = getTitle() + " by " + getArtist() + "\nDuration: " + _duration + " minutes";
        } else {
            output = getTitle() + "\nDuration: " + _duration + " minutes";
        }
        return output;
    }

}