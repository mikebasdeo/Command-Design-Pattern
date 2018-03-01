package com.mike;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]){

        ElectronicDevice newDevice = TVRemote.getDevice();

        TurnTVOn onCommand = new TurnTVOn(newDevice);

        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();

    }


}
