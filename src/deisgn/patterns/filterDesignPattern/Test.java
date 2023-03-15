/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deisgn.patterns.filterDesignPattern;

import deisgn.patterns.filterDesignPattern.criteria.criterias.CriteriaMale;
import deisgn.patterns.filterDesignPattern.models.Person;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author developer
 */
public class Test {

    
    public static void main(String[] args) {
        Person alex = new Person("Alex", 23, "Male");
    Person lucy = new Person("Alex", 23, "Female");
    Person fentasia = new Person("Alex", 23, "Female");
    Person john = new Person("Alex", 23, "Male");
    Person rousia = new Person("Alex", 23, "Male");

    List<Person> students = Arrays.asList(alex, lucy, fentasia, john, rousia);
        CriteriaMale criteriaMale=new CriteriaMale();
          System.out.println(students);
        System.out.println(criteriaMale.meetCriteria(students));
   
    }
    
    
}
