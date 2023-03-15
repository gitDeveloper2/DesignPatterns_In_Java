package deisgn.patterns.builderDesignPattern;

import deisgn.patterns.visitorDesignPattern.*;

public class Chair {
    private String name;
    private int price;

    public Chair(String name, int price) {
        this.name = name;
        this.price = price;
    }
     public Chair(ChairBuilder chairBuilder) {
        this.name = chairBuilder.name;
        this.price = chairBuilder.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public static class ChairBuilder{
         private String name;
         private int price;
        public ChairBuilder setName(String name){
            this.name=name;
            return this;
        }
        public ChairBuilder setPrice(int price){
            this.price=price;
            return this;
        }
        public Chair build(){
           
            return new Chair(this);
        }
    }
    
}
