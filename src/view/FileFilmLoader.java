package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import model.Film;

public class FileFilmLoader implements FilmLoader {

    private final String path;

    public FileFilmLoader(String path) {
        this.path = path;
    }
    
    @Override
    public ArrayList<Film> load() {
        ArrayList<Film> films = new ArrayList<Film>();
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                films.add(loadFilm(read(line)));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(path + " not found");
            e.printStackTrace();
        }
        return films;
    }
    
    private String[] read(String line) {
        String[] result = new String[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = "";
        }
        int counter = 0;
        boolean reading = false;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '"') {
                if (reading) counter++;
                reading = !reading;
            } else if (reading) {
                result[counter] += line.charAt(i);
            }
        }
        return result;
    }
    
    private Film loadFilm(String[] attributes) {
        return new Film(attributes[0],
                attributes[1],
                Integer.parseInt(attributes[2]),
                attributes[3],
                attributes[4],
                attributes[5],
                Integer.parseInt(attributes[6]),
                Float.parseFloat(attributes[7]),
                Integer.parseInt(attributes[8]));
    }
    
}
