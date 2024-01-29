package com.example.designpattern;

import com.example.designpattern.command.Command;
import com.example.designpattern.command.DrawCanvas;
import com.example.designpattern.command.DrawCommand;
import com.example.designpattern.command.MacroCommand;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CommandPattern extends JFrame implements MouseMotionListener, WindowListener {
    // 그리기 이력
    private MacroCommand history = new MacroCommand();
    // 그리는 영역
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // 삭제 버튼
    private JButton clearButton = new JButton("clear");

    private JButton historyButton = new JButton("history button");

    private JButton historyClearButton = new JButton("history clear button");

    // 생성자
    public CommandPattern(String title){
        super(title);
        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(e->{
            canvas.clear();
        });
        historyButton.addActionListener(e->{
            canvas.clear();
            canvas.repaint();
        });
        historyClearButton.addActionListener(e->{
            canvas.clear();
            history.clear();
            canvas.repaint();
        });

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(historyButton);
        buttonBox.add(historyClearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
    public static void main(String[] args){
        new CommandPattern("Command Pattern Sample");
    }
}
