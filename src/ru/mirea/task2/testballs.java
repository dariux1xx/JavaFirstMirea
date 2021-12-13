package ru.mirea.task2;

public class testBalls {
    public static void main(String[] args) {
            Balls Dan = new Balls (123.6437, 75364.45432);
            Dan.SetName("Dan");
            Dan.PrintBalls();
            Balls Vi = new Balls ();
            Vi.PrintBalls();
            Vi.SetName("Vi");
            Vi.setX(3213.5040543);
            Vi.setY(324323.5341);
            Vi.PrintBalls();
        }
    }
