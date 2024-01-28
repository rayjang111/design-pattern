package com.example.designpattern.decorator;

public class UpdownBorder extends Border{
    public UpdownBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return display.getRows()+2;
    }

    @Override
    public String getRowText(int row) {
        if (row==0){
            return getUpdownLine();
        }
        else if (row == display.getRows()+1){
            return getUpdownLine();
        }
        else {
            return display.getRowText(row-1);
        }
    }

    private String getUpdownLine(){
        StringBuilder line = new StringBuilder();
        for (int i=0; i<getColumns();i++){
          line.append("-");
        }
        return line.toString();
    }
}
