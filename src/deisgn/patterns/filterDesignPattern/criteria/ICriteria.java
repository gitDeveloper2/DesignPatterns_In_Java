/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deisgn.patterns.filterDesignPattern.criteria;

import deisgn.patterns.filterDesignPattern.models.Person;
import java.util.List;

/**
 *
 * @author developer
 */
public interface ICriteria {
    public List<Person> meetCriteria(List<Person> people);
    
}
