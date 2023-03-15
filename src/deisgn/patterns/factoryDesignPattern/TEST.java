/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deisgn.patterns.factoryDesignPattern;

import deisgn.patterns.factoryDesignPattern.Factories.ShapeFactory;
import deisgn.patterns.factoryDesignPattern.shapes.Circle;
import deisgn.patterns.factoryDesignPattern.shapes.IShape;

/**
 *
 * @author developer
 */
public class TEST {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
       IShape circle=shapeFactory.getShape("circle");
    
       IShape triangle=shapeFactory.getShape("triangle");
          circle.draw();
       triangle.draw();
    }
}
