package ru.netology.afish;

public class AfishRepository {
    int maxLenght = 10;
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

    public FilmItem[] findLast() {    //выводим 10 последних фильмов
        FilmItem[] all = items;
        FilmItem[] reversed = new FilmItem[0];
        if (all.length > maxLenght) {
            reversed = new FilmItem[maxLenght];
            for (int i = 0; i < maxLenght; i++) {
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

    public FilmItem[] findLastSetNumber(int setLenght) {   //выводим заданное количество фильмов
        FilmItem[] all = items;
        FilmItem[] reversed = new FilmItem[0];
        if (setLenght > all.length) {
            setLenght = all.length;
        }
        if (all.length > setLenght) {
            reversed = new FilmItem[setLenght];
            for (int i = 0; i < setLenght; i++) {
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






