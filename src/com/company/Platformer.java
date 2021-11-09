package com.company;

public class Platformer extends Game {
    @Override
    public void buttonForwardPressed() {
        System.out.println("You jumped");
    }

    @Override
    public void buttonDownPressed() {
        System.out.println("You crouched");
    }
}
