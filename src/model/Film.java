package model;

public class Film {
    private final String cover;
    private final String title;
    private final int year;
    private final String director;
    private final String cast;
    private final String genre;
    private final int length;
    private FilmValoration filmValoration;

    public Film(String cover, String title, int year, String director, String cast, String genre, int length, float ratings, int views) {
        this.cover = cover;
        this.title = title;
        this.year = year;
        this.director = director;
        this.cast = cast;
        this.genre = genre;
        this.length = length;
        filmValoration = new FilmValoration(ratings, views);
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public String getCover() {
        return cover;
    }

    public String getCast() {
        return cast;
    }

    public int getLength() {
        return length;
    }
    
    public float getRatings() {
        return filmValoration.getRatings();
    }
    
    public int getViews() {
        return filmValoration.getViews();
    }
    
    @Override
    public String toString() {
        return title + ", year: " + 
                year + ", director: " + 
                director + ", cast: " + 
                cast + ", genre: " + 
                genre + ", length: " + 
                length + ", ratings: " + 
                filmValoration.getRatings() + ", views: " + 
                filmValoration.getViews();
    }
    
}
