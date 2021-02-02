package control;

import java.util.Scanner;
import view.FilmDisplay;

public class SelectCommand implements Command {

    FilmDisplay filmDisplay;

    public SelectCommand(FilmDisplay filmDisplay) {
        this.filmDisplay = filmDisplay;
    }
    
    @Override
    public void execute() {
        System.out.println("Select which film?");
        Scanner scanner = new Scanner(System.in);
        filmDisplay.displayFilm(scanner.nextLine());
    }
    
}
