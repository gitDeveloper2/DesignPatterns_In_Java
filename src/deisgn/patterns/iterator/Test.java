/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deisgn.patterns.iterator;

/**
 *
 * @author developer
 */
public class Test {
    
    public static void main(String[] args) {
        NameRepository nameRepository=new NameRepository();
        for (Iterator iterator=nameRepository.getIterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
    
}
