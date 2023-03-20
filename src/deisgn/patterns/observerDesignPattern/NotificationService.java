package deisgn.patterns.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
List<Subscriber> subscribers=new ArrayList<>();


public NotificationService() {
	
}
public void subscribe(Subscriber subscriber) {
	subscribers.add(subscriber);
}
public void unsubscribe(Subscriber subscriber) {
	subscribers.remove(subscriber);
}
public void notifyAllSubscribers() {
	for(Subscriber subscriber:subscribers) {
		subscriber.update();
	}
}
}
