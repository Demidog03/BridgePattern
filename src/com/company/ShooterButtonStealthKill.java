package com.company;

public class ShooterButtonStealthKill extends InteractButton {

    public ShooterButtonStealthKill(Game newGameDevice) {
        super(newGameDevice);
    }

    @Override
    public void useButtonClicked() {
        System.out.println("You pressed use button and killed enemy from behind");
    }

}
