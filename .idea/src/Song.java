
public class Song {
    String _title; 
    double _duration;

    public Song(String title, double duration) {
        _title = title;
        _duration = duration;

    }

    public Song() {

    }

    public String getTitle() {
        return _title;
    }

    public double getDuration() {
        return _duration;
    }

    public String toString() {
        String output = "Song title: " + _title + " \nDuration: " + _duration;
        return output;
    }

}