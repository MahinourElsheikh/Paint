/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Iterator;
import static tests.Shape.Shapeslist;

/**
 *
 * @author zeina
 */
public class Line extends Line2D.Double implements Shape,Cloneable{
 private Color c;
 String name="line";

    /**
     *
     */
    public Line() {
        super();

    }
   

    public Line(double x1, double y1, double x2, double y2) {
        super(x1, y1,x2,y2);

    }
    @Override
 public void setLine(double x1, double y1, double x2, double y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
 public void setLine(Point2D p1,Point2D p2)
 {
 
this.setLine(p1, p2);
 
 }
 boolean getClickedLine(int x, int y) {

    //int boxX = x -2;
    //int boxY = y -2;

    int width =2;
    int height =2;

        if (this.intersects(x-1, y-1, width+3, height+3)) {
            System.out.println("intersects!");
           
            return true;
        }    
    return false;
}
 void removeLine(Line2D line) {
    Iterator<Shape> it = Shapeslist.iterator();
    while(it.hasNext()) {
        Shape selectedLine = it.next();
        if(selectedLine.equals(line)) {
            it.remove();
           
        }
    }
}
   
    @Override
    public void draw(Graphics g) {
        
         g.setColor(getC());
        g.drawLine((int) x1, (int) y1, (int)x2, (int)y2);
       
    }

   
    public void resize(Graphics g) {
       g.setColor(getC());
        g.drawLine((int)x1,(int)y1, (int)x2+10,(int) y2+10);
    }

    @Override
    public void Move(Graphics g, Point2D p) {
    this.x1=p.getX();
    this.y1=p.getY();
    g.setColor(getC());
    g.drawLine((int)x1,(int) y1, (int)x2, (int)y2);
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
    public void Move(Graphics g, int dx, int dy) {       
     Graphics2D g1 = (Graphics2D) g;
     this.x1= this.x1+dx;
     this.x2=this.x2+dx;
     this.y1=this.y1+dy;
     this.y2=this.y2+dy;
     this.setLine(x1, y1, x2, y2);
     
    
   
    }


     @Override
    public void resize(Graphics g2, Point2D p1, Point2D p2) {
        Graphics2D g1 = (Graphics2D) g2;
             System.out.println(x1 + y1);
            this.x2= (int) (this.x2 + (p2.getX() - p1.getX()));
            this.y2 = (int) (this.y2 + (p2.getY() - p1.getY()));
            
            System.out.println(x1 + y1);
            g1.setColor(c);
            g1.draw(this);

    }

    @Override
    public void resize(Graphics g2, int tri, Point2D ptrir2) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    @Override
    public Shape clone() {
        Line line1=(Line) super.clone();
        return line1;
        
    }
    @Override
    public String getname() {
        return name;
    }
}