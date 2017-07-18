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
 * @author zeina
 */
public class Square extends Rectangle2D.Double implements Shape, Cloneable {

    private Color c;
    private double dimension;
String name ="Square";
    public Square() {
        super();

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
    public void draw(Graphics g) {
        g.setColor(c);
        g.drawRect((int) x, (int) y, (int) width, (int) height);

    }

    /**
     * @return the l
     */
    @Override
    public void Move(Graphics g, Point2D p) {
        this.x = p.getX();
        this.y = p.getY();
        g.setColor(c);
        g.drawRect((int) x, (int) y, (int) width, (int) height);
    }

    public double getDimension() {
        return dimension;
    }

    /**
     * @param dimension the dimension to set
     */
    public void setDimension(double dimension) {
        this.dimension = dimension;
        this.width = dimension;
        this.height = dimension;
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

        this.setRect(x, y, (dimension * delta), (dimension * delta));
        g1.draw(this);

    }

    @Override
    public Shape clone() {
        Square seq1 = (Square) super.clone();
        return seq1;

    }

    @Override
    public void Move(Graphics g, int dx, int dy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the dimension
     */
    @Override
    public void resize(Graphics g2, int tri, Point2D ptrir2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
@Override
    public String getname() {
        return name;
    }
}
