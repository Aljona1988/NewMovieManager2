import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MovieManagerTest {

    @Test
    public void shouldAddNewMovie() {
        MovieManager movie = new MovieManager();

        movie.addNewMovie("Movie1");
        movie.addNewMovie("Movie2");
        movie.addNewMovie("Movie3");
        movie.addNewMovie("Movie4");
        movie.addNewMovie("Movie5");

        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5"};
        String[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovieMin() {
        MovieManager movie = new MovieManager();

        movie.addNewMovie("Movie1");
        movie.addNewMovie("Movie2");
        movie.addNewMovie("Movie3");

        String[] expected = {"Movie3", "Movie2", "Movie1"};
        String[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastMovieEqual() {
        MovieManager movie = new MovieManager();

        movie.addNewMovie("Movie1");
        movie.addNewMovie("Movie2");
        movie.addNewMovie("Movie3");
        movie.addNewMovie("Movie4");
        movie.addNewMovie("Movie5");
        movie.addNewMovie("Movie6");
        movie.addNewMovie("Movie7");
        movie.addNewMovie("Movie8");
        movie.addNewMovie("Movie9");
        movie.addNewMovie("Movie10");


        String[] expected = {"Movie10", "Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = movie.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovieMax() {
        MovieManager movie = new MovieManager(16);
        movie.addNewMovie("Movie1");
        movie.addNewMovie("Movie2");
        movie.addNewMovie("Movie3");
        movie.addNewMovie("Movie4");
        movie.addNewMovie("Movie5");
        movie.addNewMovie("Movie6");
        movie.addNewMovie("Movie7");
        movie.addNewMovie("Movie8");
        movie.addNewMovie("Movie9");
        movie.addNewMovie("Movie10");
        movie.addNewMovie("Movie11");
        movie.addNewMovie("Movie12");
        movie.addNewMovie("Movie13");
        movie.addNewMovie("Movie14");
        movie.addNewMovie("Movie15");
        movie.addNewMovie("Movie16");

        String[] expected = {"Movie16", "Movie15", "Movie14", "Movie13", "Movie12", "Movie11", "Movie10", "Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        String[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}


