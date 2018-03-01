package com.mike;

/*
* This invoker will call the execute command.
* It doesn't know what device or command is being used.*/


public class DeviceButton {

    Command theCommand;

    public DeviceButton(Command theCommand) {
        this.theCommand = theCommand;
    }

    public void press(){

        theCommand.execute();
    }
}
