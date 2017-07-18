/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;


import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Safo-PC
 */
public interface Shape extends java.awt.Shape  {
    
    List<Shape> Shapeslist = new ArrayList();
    List<Shape> Historylist = new ArrayList();
    
   
    void draw(  Graphics g);

    /**
     *
     * @param s
     */
     abstract  void  resize( Graphics g , Point2D p1, Point2D p2 );
    
    public String getname() ;
     void Move( Graphics g,Point2D p);
     void Move( Graphics g,int dx,int dy);
      public Shape clone();
     
   

    public void resize(Graphics g2, int tri, Point2D ptrir2);
   
   
 
}
