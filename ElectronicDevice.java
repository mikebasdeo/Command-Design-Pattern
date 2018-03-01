package com.mike;

/*
* An interface used to create all 'command receiver' objects.
* */

public interface ElectronicDevice {

    //Each of these will need its own class.
    public void on();
    public void off();
    public void volumeUp();
    public void volumeDown();

}
