package com.zyc.Command;

public class GarageDoorCloseCommand implements Command {

    Door door;

    public GarageDoorCloseCommand(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        this.door.lightOff();
    }

    @Override
    public void undo() {
        this.door.lightOn();
    }
}