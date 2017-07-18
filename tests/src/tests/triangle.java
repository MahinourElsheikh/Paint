/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Point2D;

/**
 *
 * @author Safo-PC
 */
public class triangle extends Polygon implements Shape, Cloneable {

    private Color c;
String name ="triangle";
    public triangle(int x[], int y[]) {
        super(x, y, 3);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(c);
        g.drawPolygon(xpoints, ypoints, 3);

    }

    public void resize(Graphics g) {

    }

    @Override
    public void Move(Graphics g, int dx, int dy) {
        Graphics2D g1 = (Graphics2D) g;

        this.translate(dx, dy);

        g1.setColor(c);
        g1.draw(this);

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

    public int[] getXpoints() {
        return xpoints;
    }

    /**
     * @param x
     */
    public void setXpoints(int[] x) {
        System.arraycopy(x, 0, this.xpoints, 0, 3);

    }

    public int[] getYpoints() {
        return ypoints;
    }

    /**
     * @param y
     */
    public void setYpoints(int[] y) {
        System.arraycopy(y, 0, this.ypoints, 0, 3);
    }

    @Override
    public void resize(Graphics g2, int tri, Point2D ptrir2) {
        Graphics2D g1 = (Graphics2D) g2;
        if (tri == 0) {
            System.out.println(xpoints[0]);
            this.xpoints[0] = (int) (this.xpoints[0] + (ptrir2.getX() - this.xpoints[0]));
            this.ypoints[0] = (int) (this.ypoints[0] + (ptrir2.getY() - this.ypoints[0]));

            System.out.println(xpoints[0]);
            g1.setColor(c);
            g1.draw(this);

        }
        if (tri == 1) {
            this.xpoints[1] = (int) (this.xpoints[1] + (ptrir2.getX() - this.xpoints[1]));
            this.ypoints[1] = (int) (this.ypoints[1] + (ptrir2.getY() - this.ypoints[1]));
            g1.setColor(c);
            g1.draw(this);

        }
        if (tri == 2) {
            this.xpoints[2] = (int) (this.xpoints[2] + (ptrir2.getX() - this.xpoints[2]));
            this.ypoints[2] = (int) (this.ypoints[2] + (ptrir2.getY() - this.ypoints[2]));
            g1.setColor(c);
            g1.draw(this);

        }
        if (tri == -1) {
            return;

        }
    }

    @Override
    public Shape clone() {

        triangle tri = new triangle((this.getXpoints()), (this.getYpoints()));
        return tri;

    }

    @Override
    public void Move(Graphics g, Point2D p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void resize(Graphics g, Point2D p1, Point2D p2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
@Override
    public String getname() {
        return name;
    }
}
