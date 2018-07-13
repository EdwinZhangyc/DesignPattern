package com.zyc.Command;

public class RemoteControlTest {

    public static void main(String[] args){

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new HallLight();
        Door door = new Door();
        Command command1 = new GarageDoorOpenCommand(door);
        Command command2 = new GarageDoorCloseCommand(door);
        Command command3 = new LightOnCommand(light);
        Command command4 = new LightOffCommand(light);

        simpleRemoteControl.setCommand(0,command1,command2);
        simpleRemoteControl.setCommand(1,command3,command4);
        simpleRemoteControl.onButtonWasPushed(0);
        simpleRemoteControl.offButtonWasPushed(0);
        simpleRemoteControl.undoPushed();
        simpleRemoteControl.onButtonWasPushed(1);
        simpleRemoteControl.offButtonWasPushed(1);
        simpleRemoteControl.undoPushed();
        String s = simpleRemoteControl.toString();
        System.out.println(s);
    }
}