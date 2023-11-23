import java.util.ArrayList;
import java.util.LinkedList;

public class Album extends Music{
    private ArrayList<Song> songs;
    private double duration;

    public Album(String title, String artist, int releaseDate) {
        super(title, artist, releaseDate);
        this.songs = new ArrayList<Song>();
    }
    public Album(String title, String artist) {
        super(title, artist);
        this.songs = new ArrayList<Song>();
    }

    public double getDuration() {
        duration = 0;
        for (Song i: songs) {
            duration += i.getDuration();
        }
        return Math.round((duration * 10.0) / 10.0);
    }

    public Song findSong(String title) {
        for (Song i: songs) {
            if (i.getTitle().equals(title)) {
                return i;
            }
        }
        return null;
    }

    public Song findSong(Song newSong) {
        for (Song i: songs) {
            if (i.getTitle().equals(newSong.getTitle())) {
                return i;
            }
        }
        return null;
    }

    public boolean addSong(Song newSong) {
        if (findSong(newSong) == null) {
            songs.add(new Song(newSong.getTitle(), newSong.getDuration(), newSong.getAlbum()));
            newSong.setArtist(this.getArtist());
            return true;
        } else {
            System.out.println("Song with name " + newSong.getTitle() + " already exists in the list");
            return false;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList) {
        int index = trackNumber - 1;
        if(index > 0 && index <= this.songs.size()) {
            PlayList.add(this.songs.get(index));
            return true;
        }
        // System.out.println("This album does not have song with tracknumber "+ trackNumber);
        return false;
    }

    public boolean addToPlayList(Song song, LinkedList<Song> PlayList) {
        for(Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(song.getTitle())) {
                PlayList.add(checkedSong);
                return true;
            }
        }
        // System.out.println("There is no such song in album");
        return false;
    }

}