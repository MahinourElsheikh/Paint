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
import java.awt.geom.Ellipse2D;


/**
 *
 * @author Fujitsu
 */
public class Ellipse extends Ellipse2D.Double implements Shape,Cloneable {

   
    private Color c;
String name="Ellipse";
    /**
     *
     */
    public Ellipse() {
        super();

    }
    public Ellipse(double x, double y, double width, double hight) {
        super(x, y, width, hight);
    
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
    public String getname() {
        return name;
    }
    
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

    
    @Override
    public void draw(Graphics g) {

         g.setColor(c);
        g.drawOval((int) x, (int) y, (int) width, (int) height);
       

    }
    
    
    public  void resize(  Graphics g ) {
        g.setColor(c);
        g.drawOval((int)x,(int) y, (int)(width+10), (int)(height+10));
        
        
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
    public void Move( Graphics g,Point2D p){
    this.x=p.getX();
    this.y=p.getY();
    g.setColor(c);
    g.drawOval((int)x,(int) y, (int)width, (int)height);
    
    
}
    
     @Override
    public void resize(Graphics g, Point2D p1, Point2D p2) {
        double d0,d1,delta;
        Graphics2D g1 = (Graphics2D) g;
        g1.setColor(c);
        d0= Math.pow(( Math.pow(((p1.getX()-this.getCenterX())),2))+( Math.pow(((p1.getY()-this.getCenterY())),2)),0.5);
        d1=  Math.pow(( Math.pow(((p2.getX()-this.getCenterX())),2))+(Math.pow(((p2.getY()-this.getCenterY())),2)),0.5);
        delta=(d1/d0);
        System.out.println(delta+"\n"+width+"\n"+height);
    
       this.setHight(height*delta);
       this.setWidth(width*delta);
       this.setX(x);
       this.setY(y);
       g1.draw(this);

    }
    @Override
    public Shape clone() {
        Ellipse ell1=(Ellipse) super.clone();
        return ell1;
        
    }

    @Override
    public void Move(Graphics g, int dx, int dy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resize(Graphics g2, int tri, Point2D ptrir2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
