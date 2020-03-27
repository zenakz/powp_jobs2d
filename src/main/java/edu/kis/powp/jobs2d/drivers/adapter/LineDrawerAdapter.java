package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter implements Job2dDriver {
    private int startX = 0;
    private int startY = 0;
    private ILine iLine;
    private DrawPanelController drawPanelController;

    public LineDrawerAdapter(DrawPanelController drawPanelController, ILine line) {
        this.drawPanelController = drawPanelController;
        this.iLine = line;
    }

    @Override
    public String toString() {
        return "Line Drawer Simulator";
    }

    @Override
    public void setPosition(int startX, int startY) {
        this.startX = startX;
        this.startY = startY;
    }

    @Override
    public void operateTo(int endX, int endY) {
        iLine.setStartCoordinates(this.startX, this.startY);
        iLine.setEndCoordinates(endY, endY);
        setPosition(endX, endY);
        drawPanelController.drawLine(iLine);
    }

}
