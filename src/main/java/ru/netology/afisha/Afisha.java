package ru.netology.afisha;

public class Afisha {
    private String[] films = new String[0]; //все фильмы хранятся в массиве, изначально их 0
    private int limit;

    public Afisha() {
        this.limit = 5;
    }

    public Afisha(int limit) {
        this.limit = limit;
    }

    // Метод добавления нового фильма
    public void addNewFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    // Метод вывода всех фильмов афиши
    public String[] findAll() {
        return films;
    }

    // Метод вывода 5 последних обратных значений
    public String[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}







