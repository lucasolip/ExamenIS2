package model;

public class FilmValoration {
    private float ratings;
    private int views;

    public FilmValoration(float ratings, int views) {
        this.ratings = ratings;
        this.views = views;
    }

    public float getRatings() {
        return ratings;
    }

    public int getViews() {
        return views;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    public void setViews(int views) {
        this.views = views;
    }
    
}
