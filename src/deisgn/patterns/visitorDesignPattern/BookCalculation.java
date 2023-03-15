package deisgn.patterns.visitorDesignPattern;

public class BookCalculation implements IBookCalculations{

    public static final int DISCOUNT_FLOOR = 1000;
    public static final int DISCOUNT_AMMOUNT = 150;

    @Override
    public int calculateBookCostAfterDiscount(Book book) {
        int price = book.getPrice();
        if(price > DISCOUNT_FLOOR){
            return price- DISCOUNT_AMMOUNT;
        }else {
            return price;
        }

    }
}
