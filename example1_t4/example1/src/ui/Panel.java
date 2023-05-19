package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JPanel;

import config.Utils;

public class Panel extends JPanel {
    private Color color;
    private Dimension customSize;
    private Point position;

    public Panel() {
        this.setSize(Utils.WIDTH, Utils.HEIGHT);
        this.setLocation(Utils.X, Utils.Y);
        this.setBackground(Utils.COLOR);
        this.setLayout(null);
    }

    public Panel(Dimension size, Point position, Color color) {
        this.setSize(size);
        this.setLocation(position);
        this.setBackground(color);
        this.setLayout(null);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        this.setBackground(color);
    }

    public Dimension getCustomSize() {
        return customSize;
    }

    public void setCustomSize(Dimension size) {
        this.customSize = size;
        this.setSize(size);
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
        this.setLocation(position);
    }

}
