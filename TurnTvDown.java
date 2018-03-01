package com.mike;

public class TurnTvDown implements Command{

    ElectronicDevice device;

    public TurnTvDown(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }
}
