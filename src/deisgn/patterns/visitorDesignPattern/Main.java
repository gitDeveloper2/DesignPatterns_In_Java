package deisgn.patterns.visitorDesignPattern;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
     private static final int DISCOUNTED_FLOOR_PRICE = 1000;
    private static final int DISCOUNTED_PRICE = 150;
    public static void main(String[] args) throws IOException {
        final int harryPorterPrice = 1500;
        final int alchemistPrice = 2000;
        
       Book harryPotter=new Book("Harry Portter", harryPorterPrice);
        Book alchemist=new Book("The Alchemist", alchemistPrice);
        List<Book> books=Arrays.asList(harryPotter,alchemist);
        int patternSum=0;
        for (Book book:books){
            patternSum+=book.finalCost(new BookCalculation());
        }
        System.out.println("Pattern Sum :"+patternSum);



    }
   
}