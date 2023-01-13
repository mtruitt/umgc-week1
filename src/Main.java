/**
 * 
 */
public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Jurassic Park");
        System.out.println("Original title: " + movie.getTitle());
        movie.play();
        movie.setTitle("Water World");
        System.out.println("Updated title: " + movie.getTitle());
        movie.nowPlaying();
    }
}