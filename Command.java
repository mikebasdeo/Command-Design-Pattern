package com.mike;

/*
* Every receiver object must use execute.
* We will need another object to call this. (DeviceButton)*/

public interface Command {

    public void execute();
}
