/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Point2D;


public class RectangleBuilder  {

    private double X;
    private double Y;
    private double Width;
    private double Height;
    private Color c;
String name ="rectangle";
    public RectangleBuilder() {
    }

    public RectangleBuilder setX(double X) {
        this.X = X;
        return this;
    }

    public RectangleBuilder setY(double Y) {
        this.Y = Y;
        return this;
    }

    public RectangleBuilder setWidth(double Width) {
        this.Width = Width;
        return this;
    }

    public RectangleBuilder setHeight(double Height) {
        this.Height = Height;
        return this;
    }

    public RectangleBuilder setC(Color c) {
        this.c = c;
        return this;
    }

    public Rectangle createRectangle() {
        return new Rectangle(X, Y, Width, Height, c);
    }
    

    public String getname() {
        return name;
    }

    
}
