package com.example.designpattern.command;

import java.awt.*;

public class DrawCommand implements Command{

    protected Drawable drawable;
    private Point position;

    public DrawCommand(Drawable drawable, Point position){
        this.drawable = drawable;
        this.position = position;
    }
    //실행
    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
