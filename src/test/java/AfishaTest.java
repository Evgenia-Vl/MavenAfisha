import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.afisha.Afisha;

public class AfishaTest {

    @Test
    public void addNewFilmsAndFindAllFilms() {
        Afisha manager = new Afisha();
        manager.addNewFilm("Film I");
        manager.addNewFilm("Film II");
        manager.addNewFilm("Film III");
        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNothingAndFindAllFilms() {
        Afisha manager = new Afisha();
        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilmAndFindAllFilms() {
        Afisha manager = new Afisha();
        manager.addNewFilm("Film I");
        String[] actual = manager.findAll();
        String[] expected = {"Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmsIfFilmsLengthBelowLimit() {
        Afisha manager = new Afisha();
        manager.addNewFilm("Film I");
        manager.addNewFilm("Film II");
        manager.addNewFilm("Film III");
        String[] actual = manager.findLast();
        String[] expected = {"Film III", "Film II", "Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmsIfFilmsLengthEqualLimit() {
        Afisha manager = new Afisha();
        manager.addNewFilm("Film I");
        manager.addNewFilm("Film II");
        manager.addNewFilm("Film III");
        manager.addNewFilm("Film IV");
        manager.addNewFilm("Film V");
        String[] actual = manager.findLast();
        String[] expected = {"Film V", "Film IV", "Film III", "Film II", "Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmsIfFilmsLengthMoreThanLimit() {
        Afisha manager = new Afisha();
        manager.addNewFilm("Film I");
        manager.addNewFilm("Film II");
        manager.addNewFilm("Film III");
        manager.addNewFilm("Film IV");
        manager.addNewFilm("Film V");
        manager.addNewFilm("Film VI");
        manager.addNewFilm("Film VII");
        manager.addNewFilm("Film VIII");
        String[] actual = manager.findLast();
        String[] expected = {"Film VIII", "Film VII", "Film VI", "Film V", "Film IV"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmsIfFilmsLengthlike0() {
        Afisha manager = new Afisha();
        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }
}
