package com.mike;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]){

        //Create a new ElectronicDevice that is a Television
        ElectronicDevice newDevice = TVRemote.getDevice();

        //Create a command object that is connected to the TV.
        TurnTVOn onCommand = new TurnTVOn(newDevice);

        //Create a button that is connected to the command.
        DeviceButton onPressed = new DeviceButton(onCommand);

        //Press the button.
        onPressed.press();

    }


}
