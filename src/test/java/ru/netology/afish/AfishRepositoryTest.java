package ru.netology.afish;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AfishRepositoryTest {

    AfishRepository films = new AfishRepository();


    FilmItem item1 = new FilmItem(1, 23, "Ирония судьбы", "комедия", 135);
    FilmItem item2 = new FilmItem(2, 223, "Груз 200", "драма", 65);
    FilmItem item3 = new FilmItem(3, 213, "Кошмар на улице Вязов", "ужасы", 87);
    FilmItem item4 = new FilmItem(4, 234, "Унесённые ветром", "мелодрама", 122);
    FilmItem item5 = new FilmItem(5, 2243, "Тупой и ещё тупее", "комедия", 68);
    FilmItem item6 = new FilmItem(6, 2523, "Индиана Джонс", "приключения", 145);
    FilmItem item7 = new FilmItem(7, 2563, "Властелин колец", "фентези", 235);
    FilmItem item8 = new FilmItem(8, 123, "Шрек", "мультфильм", 75);
    FilmItem item9 = new FilmItem(9, 24543, "Гладиатор", "историческая драма", 89);
    FilmItem item10 = new FilmItem(10, 2113, "Распутин", "биография", 61);
    FilmItem item11 = new FilmItem(11, 273, "Молчание ягнят", "триллер", 55);
    FilmItem item12 = new FilmItem(12, 293, "Чернобыль", "документальный фильм", 155);
    FilmItem item13 = new FilmItem(13, 203, "Мальчишник в Вегасе", "комедия", 65);

    @BeforeEach
    public void setup() {
        films.addNewFilm(item1);
        films.addNewFilm(item2);
        films.addNewFilm(item3);
        films.addNewFilm(item4);
        films.addNewFilm(item5);
        films.addNewFilm(item6);
        films.addNewFilm(item7);
        films.addNewFilm(item8);
        films.addNewFilm(item9);
        films.addNewFilm(item10);
        films.addNewFilm(item11);
        films.addNewFilm(item12);
        films.addNewFilm(item13);

    }

    @Test
    public void shouldFindAll() {
        FilmItem[] expected = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12, item13};
        FilmItem[] actual = films.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindLastTen() {
        FilmItem[] expected = {item13, item12, item11, item10, item9, item8, item7, item6, item5, item4};
        FilmItem[] actual = films.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastSetNumber() {
        FilmItem[] expected = {item13, item12, item11, item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        FilmItem[] actual = films.findLastSetNumber(50);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindMoreAllLast() {
        FilmItem[] expected = {item13, item12, item11, item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        FilmItem[] actual = films.findLastSetNumber(15);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindOneLast() {
        FilmItem[] expected = {item13};
        FilmItem[] actual = films.findLastSetNumber(1);
        Assertions.assertArrayEquals(expected, actual);
    }
}

