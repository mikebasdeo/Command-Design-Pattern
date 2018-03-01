package com.mike;


/*
* Every command needs a class.*/


public class TurnTVOn implements Command{

    //Needs a device
    ElectronicDevice device;

    public TurnTVOn(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }
}
