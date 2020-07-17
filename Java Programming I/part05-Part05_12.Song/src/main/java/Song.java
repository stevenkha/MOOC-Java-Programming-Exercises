
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object comparedSong) {
        if (this == comparedSong) {
            return true;
        }
        
        if (!(comparedSong instanceof Song)) {
            return false;
        }
        
        Song comparison = (Song) comparedSong;
        
        if (this.artist == comparison.artist &&
            this.name == comparison.name &&
            this.durationInSeconds == comparison.durationInSeconds) {
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
