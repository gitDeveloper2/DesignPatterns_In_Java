package deisgn.patterns.observerDesignPattern;

public class Test {
public static void main(String[] args) {
	Store store=new Store();
	
	EmailSubscriber john=new EmailSubscriber("john@gmail.com");
	EmailSubscriber marcus=new EmailSubscriber("marcus@gmail.com");
	store.getNotificationService().subscribe(john);
	store.getNotificationService().subscribe(marcus);
	
	store.newItemPromotion();
}
}
