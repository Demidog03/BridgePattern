package com.company;

public class PlatformerButtonThrowStones extends InteractButton {
    public PlatformerButtonThrowStones(Game newGameDevice) {
        super(newGameDevice);
    }

    @Override
    public void useButtonClicked() {
        System.out.println("You threw a stone");
    }
}
