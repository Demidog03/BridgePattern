package com.company;

public class ShooterButtonCheckAttachments extends InteractButton {
    public ShooterButtonCheckAttachments(Game newGameDevice) {
        super(newGameDevice);
    }

    @Override
    public void useButtonClicked() {
        System.out.println("You checked your attachments by clicking 'interact' button");
    }
}
