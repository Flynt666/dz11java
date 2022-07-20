package ru.netology.afish;

public class AfishRepository {
    private FilmItem[] items = new FilmItem[0];


    public void addNewFilm(FilmItem item) {
        FilmItem[] tmp = new FilmItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public FilmItem[] findAll() {
        return items;

    }

    public FilmItem[] findLast() {
        FilmItem[] all = items;
        FilmItem[] reversed = new FilmItem[all.length];
        for (int i=0; i< reversed.length; i++){
            reversed[i]=all[all.length-1-i];
        }
        return reversed;


    }
}
