package com.max.myapplication2.app;

/**
 * Created by Max on 22.04.2014.
 */
public class Model {
    int x = 50;
    int y = 50;
    int t;
public void setT(int t){
    this.t = t;
}
    public void left(){
        x -= t;
    }
    public void right(){
        x += t;
    }
    public void down(){
        y += t;
    }
    public void up(){
        y -= t;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void move(float x, float y)
    {
        this.x +=x;
        this.y +=y;
        if (this.y >= 290)  this.y = 290;
        if (this.y <= 20)  this.y = 20;
        if (this.x <= 20)  this.x = 20;
        if (this.x >= 710)  this.x = 710;
    }
}
