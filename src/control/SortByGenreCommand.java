package control;

import java.util.ArrayList;
import java.util.Collections;
import model.Film;
import view.FilmDisplay;

public class SortByGenreCommand implements Command {
    protected FilmDisplay filmDisplay;
    protected ArrayList<Film> films;

    public SortByGenreCommand(FilmDisplay filmDisplay, ArrayList<Film> films) {
        this.filmDisplay = filmDisplay;
        this.films = films;
    }
    
    @Override
    public void execute() {
        Collections.sort(films, (Film f1, Film f2) -> f1.getGenre().compareTo(f2.getGenre()));
        filmDisplay.display();
    }
}
