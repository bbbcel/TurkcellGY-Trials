package org.example;

public abstract class GameCalc {
    public abstract void calculate();

    public final void gameOver(){
        System.out.println("Game Over!");
    }
}
