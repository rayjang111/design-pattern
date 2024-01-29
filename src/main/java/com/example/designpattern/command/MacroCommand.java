package com.example.designpattern.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class MacroCommand implements Command {
    private Deque<Command> commands = new ArrayDeque<>();

    @Override
    public void execute() {
        for (Command cmd: commands){
            cmd.execute();
        }
    }

    //추가
    public void append(Command cmd){
        if (cmd == this){
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
    }

    // 마지막 명령을 삭제
    public void undo(){
        if(!commands.isEmpty()){
            commands.pop();
        }
    }

    // 전부 삭제
    public void clear(){
        commands.clear();
    }
}
