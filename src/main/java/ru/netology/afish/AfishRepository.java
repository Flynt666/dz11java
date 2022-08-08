package ru.netology.afish;

public class AfishRepository {

    private FilmItem[] items = new FilmItem[0];
    private int maxLength;

    public AfishRepository() {
        this.maxLength = 10;
    }

    public AfishRepository(int maxLength) {
        this.maxLength = maxLength;
    }

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


    public FilmItem[] findLastSetNumber() {   //выводим заданное количество фильмов
        FilmItem[] all = items;
        FilmItem[] reversed = new FilmItem[0];
        if (maxLength > all.length) {
            maxLength = all.length;
        }
        if (all.length > maxLength) {
            reversed = new FilmItem[maxLength];
            for (int i = 0; i < maxLength; i++) {
                reversed[i] = all[all.length - 1 - i];
            }
        } else {
            reversed = new FilmItem[all.length];
            for (int i = 0; i < all.length; i++) {
                reversed[i] = all[all.length - 1 - i];
            }
        }
        return reversed;
    }
}






