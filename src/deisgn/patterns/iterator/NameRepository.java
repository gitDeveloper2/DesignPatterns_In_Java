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
public class NameRepository implements Container{
String [] name={"Robert" , "John" ,"Julie" , "Lora"};
    @Override
    public Iterator getIterator() {
           return new NameIterator();
    }
    public class NameIterator implements Iterator{
        private int index;
        @Override
        public boolean hasNext() {
            
            if(index<name.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return name[index++];
            }
            return null;
        }
        
    }
    
}
