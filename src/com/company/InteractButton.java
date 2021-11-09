package com.company;

public abstract class InteractButton {
    private Game theGameDevice;

    public InteractButton(Game newGameDevice){
        theGameDevice = newGameDevice;
    }

    public void buttonRightPressed(){
        theGameDevice.buttonRightPressed();
    }

    public void buttonLeftPressed(){
        theGameDevice.buttonLeftPressed();
    }
    public abstract void useButtonClicked();

    public void buttonForwardPressed(){
        theGameDevice.buttonForwardPressed();
    }
    public void buttonDownPressed(){
        theGameDevice.buttonDownPressed();
    }
}
