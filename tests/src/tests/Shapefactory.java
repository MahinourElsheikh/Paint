/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author Safo-PC
 */
public class Shapefactory {
    
    private static Shapefactory instance=new Shapefactory();
    Shapefactory(){}
    
     
     public static Shapefactory getInstance(){
        
            return instance;

}
             public Shape getShape(String shapeType ){
             
            
             if (shapeType.equalsIgnoreCase("SQUARE"))
             {
             return new Square();
             }
              if (shapeType.equalsIgnoreCase("ELLIPSE"))
             {
             return new Ellipse();
             }
             if (shapeType.equalsIgnoreCase("CIRCLE"))
             {
             return new Circle();
             }
             if (shapeType.equalsIgnoreCase("LINE"))
             {
             return new Line();
             }
              
              
             
              
              
              
              return null;
             
             
             }
             public Shape getShape(String shapeType , int[]x,int y[] ){
             if (shapeType.equalsIgnoreCase("TRIANGLE"))
             {
             return new triangle(x,y);
             }
             
             return null;
             
             }
    
}
