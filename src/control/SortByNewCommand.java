package control;

import java.util.ArrayList;
import java.util.Collections;
import model.Film;
import view.FilmDisplay;

public class SortByNewCommand implements Command {
    protected FilmDisplay filmDisplay;
    protected ArrayList<Film> films;

    public SortByNewCommand(FilmDisplay filmDisplay, ArrayList<Film> films) {
        this.filmDisplay = filmDisplay;
        this.films = films;
    }
    
    @Override
    public void execute() {
        Collections.sort(films, (Film f1, Film f2) -> ((Integer)f2.getYear()).compareTo((Integer)f1.getYear()));
        filmDisplay.display();
    }
}
