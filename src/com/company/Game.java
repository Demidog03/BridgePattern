package com.company;

public abstract class Game {
    public abstract void buttonForwardPressed();
    public abstract void buttonDownPressed();

    public void buttonRightPressed(){
        System.out.println("You moved right");
    }

    public void buttonLeftPressed(){
        System.out.println("You moved left");
    }

}
