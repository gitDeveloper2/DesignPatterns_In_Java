package deisgn.patterns.mementoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
public static void main(String[] args) {
	List<Memento> saveStockState=new  ArrayList<>();
	
	Stock dones=new Stock("John Downs");
	saveStockState.add(dones.saveToMemento());
	saveStockState.forEach(System.out::print);
	
}
}
