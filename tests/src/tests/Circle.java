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
public class Circle  extends Ellipse2D.Double implements Shape,Cloneable  {
   
     private Color c;
     private double radius;
     String name="Circle";

    /**
     *
     */
    public Circle() {
        super();

    }
    public Circle(double x, double y, double width, double hight) {
        super(x, y, width, hight);
    
}
     public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
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
        return radius;
    }

    @Override
    public double getHeight() {
        return radius;
    }

    @Override
    public boolean isEmpty() {
        return false;
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
     * @param radius
     */
    public void setWidth(double radius) {
        this.radius = radius;
    }

    /**
     * @param radius
     */
    public void setHight(double radius) {
        this.radius = radius;
    }

    
    @Override
    public void draw(Graphics g) {

         g.setColor(c);
        g.drawOval((int) x, (int) y, (int) radius, (int) radius);
       

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
    g.drawOval((int)x,(int) y, (int)radius, (int)radius);
    
    
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
    
       this.setHight(radius*delta);
       this.setWidth(radius*delta);
       this.setX(x);
       this.setY(y);
       this.setRadius(radius);
        g1.draw(this);

    }
    @Override
    public Shape clone() {
        Circle cir1=(Circle) super.clone();
        return cir1;
        
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
    /**
     * @return the radius
     */
   
}
