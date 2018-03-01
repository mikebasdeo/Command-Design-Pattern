package com.mike;

/*
* First receiver object.
* Each command to be called will need its own class. (Downside of Command Pattern)*/

public class Television implements ElectronicDevice{

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("TV is ON");
    }

    @Override
    public void off() {
        System.out.println("TV is OFF");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("TV is at volume " + this.volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("TV is at volume " + this.volume);
    }
}
