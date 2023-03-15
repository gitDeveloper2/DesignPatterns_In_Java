/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deisgn.patterns.filterDesignPattern.criteria.criterias;

import deisgn.patterns.filterDesignPattern.criteria.ICriteria;
import deisgn.patterns.filterDesignPattern.models.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author developer
 */
public class CriteriaMale implements ICriteria{
private final static String MALE="male";
private final static String FEMALE="female";
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> filtredPeople=new ArrayList<>();
        for(Person person:people){
            if(person.getSex().equalsIgnoreCase(MALE)){
                filtredPeople.add(person);
            }
        }
        return filtredPeople;
    }
   
    
}
