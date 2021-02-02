package control;

import java.util.ArrayList;
import java.util.Collections;
import model.Film;
import view.FilmDisplay;

public class SortByRatingsCommand implements Command {
    protected FilmDisplay filmDisplay;
    protected ArrayList<Film> films;

    public SortByRatingsCommand(FilmDisplay filmDisplay, ArrayList<Film> films) {
        this.filmDisplay = filmDisplay;
        this.films = films;
    }


    
    @Override
    public void execute() {
        Collections.sort(films, (Film f1, Film f2) -> ((Float)f1.getRatings()).compareTo((Float)f2.getRatings()));
        filmDisplay.display();
    }
}
