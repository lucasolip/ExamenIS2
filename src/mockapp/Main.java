package mockapp;

import control.Command;
import control.ExitCommand;
import control.NullCommand;
import control.SortByGenreCommand;
import control.SortByNewCommand;
import control.SortByRatingsCommand;
import control.SortByViewsCommand;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import model.Film;
import view.FileFilmLoader;
import view.FilmDisplay;
import view.FilmLoader;
import view.mock.MockFilmDisplay;

public class Main {

    private HashMap<String, Command> commands;
    private FilmDisplay filmDisplay;
    private ArrayList<Film> films;
    
    public static void main(String[] args) {
        new Main().execute();
    }
    
    public void execute() {
        FilmLoader filmLoader = new FileFilmLoader("films.csv");
        films = filmLoader.load();
        filmDisplay = new MockFilmDisplay(films);
        initializeCommands();
        filmDisplay.display();
        inputLoop();
    }
    
    public void initializeCommands() {
        commands = new HashMap<>();
        commands.put("exit", new ExitCommand());
        commands.put("genre", new SortByGenreCommand(filmDisplay, films));
        commands.put("new", new SortByNewCommand(filmDisplay, films));
        commands.put("ratings", new SortByRatingsCommand(filmDisplay, films));
        commands.put("views", new SortByViewsCommand(filmDisplay, films));
    }
    
    public void inputLoop() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            getCommand(scanner.nextLine()).execute();
        }
    }
    
    public Command getCommand(String key) {
        Command currentCommand = commands.get(key);
        if (currentCommand != null) return currentCommand;
        else return new NullCommand();
    }
    
}
