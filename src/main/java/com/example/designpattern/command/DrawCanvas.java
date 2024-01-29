package com.example.designpattern.command;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    // 그리는 색
    private Color color = Color.red;
    // 그리는 점의 반지름
    private int radius = 6;
    // 이력
    private MacroCommand history;

    //생성자
    public DrawCanvas(int width, int height, MacroCommand history){
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    @Override
    public void paint(Graphics g){
        history.execute();
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x-radius, y- radius, radius * 2, radius *2);
    }

    public void clear() {
        Graphics g = getGraphics();
        g.clearRect(0, 0, radius * 2, radius *2);
    }
}
