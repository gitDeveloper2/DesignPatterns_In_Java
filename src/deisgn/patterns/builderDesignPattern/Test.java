/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deisgn.patterns.builderDesignPattern;

/**
 *
 * @author developer
 */
public class Test {
    public static void main(String[] args) {
       Chair chair= new Chair.ChairBuilder().setName("Recliner").setPrice(2500).build();
        System.out.println(chair.getName());
    }
}
