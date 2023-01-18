public class Movie {

    // attributes
    private String title;

    // constructor
    public Movie(String title) {
        this.title = title;
    }

    // method to play a movie
    public void play() {
        System.out.println("Playing movie: " + this.title);
    }

    // method to update the movie playing
    public void nowPlaying() {
        System.out.println("Now playing: " + this.title);
    }

    // setter method to update the title of the movie
    public void setTitle(String title) {
        this.title = title;
    }

    // getter method to retrieve the title of the movie
    public String getTitle() {
        return this.title;
    }
}