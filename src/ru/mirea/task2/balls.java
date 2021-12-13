package ru.mirea.task2;

public class Balls {
    private double x = 0.0, y = 0.0;
    private String name;
    public Balls(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void SetName (String name){
        this.name = name;
    }

    public Balls(){
        x = 0.0;
        y = 0.0;
        name = "Ball1";
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp){
        this.x = x + xDisp;
        this.y = y + yDisp;
    }
    public void PrintBalls(){
        System.out.println("Name ball is " + name);
        System.out.println("x = " + x);
        System.out.println("y = " + y + "\n");
    }
}
