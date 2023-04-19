/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestreams;

/**
 *
 * @author Student
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator (Shape shape){
        super(shape);
        
    }
     @Override
   public void draw(){
       shape.draw();
         System.out.println("Border Color : Red");
   }

    
}
