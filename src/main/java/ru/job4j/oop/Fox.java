package ru.job4j.oop;

public class Fox {
        public void tryEat(Ball ball) {
            boolean condition = true;
            ball.tryRun(true);
            System.out.println(condition ? "Лисой" : "Лисы");
        }
    }
