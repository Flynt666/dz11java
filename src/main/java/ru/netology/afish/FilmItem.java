package ru.netology.afish;

public class FilmItem {
    private int id;
    private int filmId;
    private String filmName;
    private String filmGenre;
    private long duration;

    public FilmItem (int id, int filmId, String filmName, String filmGenre, long duration){
        this.id = id;
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmGenre = filmGenre;
        this.duration = duration;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
