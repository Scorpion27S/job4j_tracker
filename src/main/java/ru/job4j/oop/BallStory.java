package ru.job4j.oop;

     class Ball {
        public void truRun(boolean condition) {
            if (condition) {
                System.out.print("колобок съеден ");
            } else {
                System.out.print("колобок сбежал от ");
            }
        }
    }

     class Wolf {
            public void tryEat(Ball ball) {
                ball.truRun(false);
                System.out.println("Волка");
            }
        }

     class Hare {
        public void tryEat(Ball ball) {
            ball.truRun(false);
            System.out.println("Заяц");
        }
    }

     class Fox {
        public void tryEat(Ball ball) {
            boolean condition = true;
            ball.truRun(condition);
            System.out.println(condition ? "Лисой" : "Лисы");
        }
    }

    public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Hare hare = new Hare();
        wolf.tryEat(ball);
        hare.tryEat(ball);
        fox.tryEat(ball);
    }
}