/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Safo-PC
 */
public class Rectangle extends Rectangle2D.Double implements Shape, Cloneable {

    private double X = x;
    private double Y = y;
    private double Width = width;
    private double Height = height;
    private Color c;
String name="Rectangle";
    /**
     *
     */
    public Rectangle(double X, double Y, double Width, double Height, Color c) {

        super(X, Y, Width, Height);
        this.X = X;
        this.Y = Y;
        this.Width = Width;
        this.Height = Height;
        this.c = c;

    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(c);
        g.drawRect((int) x, (int) y, (int) width, (int) height);

    }

    @Override
    public void resize(Graphics g, Point2D p1, Point2D p2) {
        double d0, d1, delta;
        Graphics2D g1 = (Graphics2D) g;
        g1.setColor(c);
        d0 = Math.pow((Math.pow(((p1.getX() - this.getCenterX())), 2)) + (Math.pow(((p1.getY() - this.getCenterY())), 2)), 0.5);
        d1 = Math.pow((Math.pow(((p2.getX() - this.getCenterX())), 2)) + (Math.pow(((p2.getY() - this.getCenterY())), 2)), 0.5);
        delta = (d1 / d0);
        System.out.println(delta + "\n" + width + "\n" + height);

        this.setRect(x, y, (width * delta), (height * delta));
        g1.draw(this);

    }

    /**
     * @param X the X to set
     */
    public void setX(double X) {
        this.x = X;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @param hight the hight to set
     */
    public void setHight(double hight) {
        this.height = hight;
    }

    /**
     * @return the c
     */
    public Color getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Color c) {
        this.c = c;
    }

    @Override
    public void Move(Graphics g, Point2D p) {
        Graphics2D g1 = (Graphics2D) g;
        this.x = p.getX();
        this.y = p.getY();
        this.X = p.getX();
        this.Y = p.getY();
        g1.setColor(c);
        g1.draw(this);

    }
    @Override
    public Shape clone() {
        Rectangle rec1 = new Rectangle((this.x), (this.y), (this.width), (this.height), (this.c));

        return rec1;

    }

    @Override
    public void Move(Graphics g, int dx, int dy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resize(Graphics g2, int tri, Point2D ptrir2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getname() {
        return name;
    }

}
