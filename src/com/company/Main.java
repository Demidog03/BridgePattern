package com.company;

public class Main {

    public static void main(String[] args) {
        InteractButton theShooter1 = new ShooterButtonStealthKill(new Shooter());
        InteractButton theShooter2 = new ShooterButtonCheckAttachments(new Shooter());
        InteractButton thePlatformer = new PlatformerButtonThrowStones(new Platformer());
        System.out.println("Testing first shooter game with interact key manipulation");
        theShooter1.buttonForwardPressed();
        theShooter1.buttonDownPressed();
        theShooter1.buttonLeftPressed();
        theShooter1.buttonRightPressed();
        theShooter1.useButtonClicked();
        System.out.println();
        System.out.println("Testing second shooter game with interact key manipulation");
        theShooter2.buttonForwardPressed();
        theShooter2.buttonDownPressed();
        theShooter2.buttonLeftPressed();
        theShooter2.buttonRightPressed();
        theShooter2.useButtonClicked();
        System.out.println();
        System.out.println("Testing platformer game with interact key manipulation");
        thePlatformer.buttonForwardPressed();
        thePlatformer.buttonDownPressed();
        thePlatformer.buttonLeftPressed();
        thePlatformer.buttonRightPressed();
        thePlatformer.useButtonClicked();
    }
}
