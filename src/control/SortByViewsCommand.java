package control;

import java.util.ArrayList;
import java.util.Collections;
import model.Film;
import view.FilmDisplay;

public class SortByViewsCommand implements Command {
    protected FilmDisplay filmDisplay;
    protected ArrayList<Film> films;

    public SortByViewsCommand(FilmDisplay filmDisplay, ArrayList<Film> films) {
        this.filmDisplay = filmDisplay;
        this.films = films;
    }


    @Override
    public void execute() {
        Collections.sort(films, (Film f1, Film f2) -> ((Integer)f1.getViews()).compareTo((Integer)f2.getViews()));
        filmDisplay.display();
    }
}
