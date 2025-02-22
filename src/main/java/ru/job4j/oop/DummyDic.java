package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic petr = new DummyDic();
        String engToRus = petr.engToRus("Start");
        System.out.println(engToRus);
    }
}