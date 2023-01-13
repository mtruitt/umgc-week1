public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void play() {
        System.out.println("Playing movie: " + this.title);
    }

    public void nowPlaying() {
        System.out.println("Now playing: " + this.title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}