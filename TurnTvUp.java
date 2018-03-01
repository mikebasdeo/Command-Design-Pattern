package com.mike;

public class TurnTvUp implements Command {

    ElectronicDevice device;

    public TurnTvUp(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }
}
