package com.company;

public class Shooter extends Game {
    @Override
    public void buttonForwardPressed() {
        System.out.println("You moved forward");
    }

    @Override
    public void buttonDownPressed() {
        System.out.println("You moved back");
    }
//    private GameDevices shooter;
//    public Shooter(GameDevices newGame){
//        shooter = newGame;
//    }
//
//    public Shooter() {
//
//    }
//
//    public void buttonForwardPressed(){
//        shooter.buttonForwardPressed();
//    }
//    public void buttonDownPressed(){
//        shooter.buttonDownPressed();
//    }


}
