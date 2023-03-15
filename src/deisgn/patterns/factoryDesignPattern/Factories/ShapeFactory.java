/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deisgn.patterns.factoryDesignPattern.Factories;

import deisgn.patterns.factoryDesignPattern.shapes.Circle;
import deisgn.patterns.factoryDesignPattern.shapes.IShape;
import deisgn.patterns.factoryDesignPattern.shapes.Triangle;

/**
 *
 * @author developer
 */
public class ShapeFactory implements IShapeFactory{
        public IShape getShape(String shape){
            if(shape.equalsIgnoreCase(null)){
                return null;
            }
            if(shape.equalsIgnoreCase("circle")){
                return new Circle();
            }
            if(shape.equalsIgnoreCase("triangle")){
                return new Triangle();
            }
            return null;
        }

}
