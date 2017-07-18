/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;


import java.awt.Graphics;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Safo-PC
 */
public class Reusableshapes {
   public Stack<Shape> free;
   public Stack<Shape> used;
   private static Reusableshapes instance;
   
   private Reusableshapes()
   {
       free= new <Shape> Stack();
       used = new <Shape> Stack();
   
   
   }
       public static Reusableshapes getInstance()
       {
       if(instance==null)
           instance= new Reusableshapes();
       return instance;
       }
       
       public Shape undo()
       {
           if(!free.isEmpty())
           {
            Shape s =  free.pop();

               used.push(s);
               return s;
               
           }   
           else 
               return null;
       }
public Shape redo()
{
   if(!used.isEmpty())
   {
       Shape s=(Shape)used.pop();
       free.push(s);   
       return s;
   }
   else
       return null;
   
}
public void refresh(List<Shape> Shapeslist )
{
while(!free.isEmpty())
{
free.clear();}
for(Shape s:Shapeslist)
{
free.push(s);

}


}
   
       
}
