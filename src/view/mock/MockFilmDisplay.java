package view.mock;

import java.util.ArrayList;
import model.Film;
import view.FilmDisplay;

public class MockFilmDisplay implements FilmDisplay {

    private ArrayList<Film> films;

    public MockFilmDisplay(ArrayList<Film> films) {
        this.films = films;
    }
    
    @Override
    public void display() {
        for (Film film : films) {
            System.out.println(film.getTitle());
        }
    }
    
    public void displayFilm(String title) {
        for (Film film : films) {
            if (film.getTitle().equals(title)) {
                System.out.println(film);
                return;
            }
        }
        System.out.println("Esa película no existe");
    }
    
}
