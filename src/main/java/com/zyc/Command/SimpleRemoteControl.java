package com.zyc.Command;

public class SimpleRemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command lastCommand;

    public SimpleRemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {

            //给变量附上默认的什么都没有的指令，防止报空指针异常
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        lastCommand = noCommand;
    }

    public void setCommand (int index, Command onCommand, Command offCommand){
        this.onCommands[index] = onCommand;
        this.offCommands[index] = offCommand;
    }

    public void onButtonWasPushed (int index){
        this.onCommands[index].execute();
        lastCommand = this.onCommands[index];
    }

    public void offButtonWasPushed (int index) {
        this.offCommands[index].execute();
        lastCommand = this.offCommands[index];
    }

    public void undoPushed(){
        this.lastCommand.undo();
    }


    public String toString (){

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----------Remote Control----------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[index " + i + "] " + onCommands[i].getClass().getName() + "       "+ offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}