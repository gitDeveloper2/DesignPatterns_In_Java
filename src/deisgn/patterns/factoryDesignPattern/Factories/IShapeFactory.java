/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deisgn.patterns.factoryDesignPattern.Factories;

import deisgn.patterns.factoryDesignPattern.shapes.IShape;

/**
 *
 * @author developer
 */
public interface IShapeFactory {
    public IShape getShape(String shape);
}
