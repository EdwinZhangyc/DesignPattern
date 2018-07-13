package com.zyc.Command;

public class GarageDoorOpenCommand implements Command {

    Door door;

    public GarageDoorOpenCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        this.door.lightOn();
    }

    @Override
    public void undo() {
        this.door.lightOff();
    }
}