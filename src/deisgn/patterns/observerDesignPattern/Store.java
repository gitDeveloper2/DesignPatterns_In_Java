package deisgn.patterns.observerDesignPattern;

public class Store {
	private final NotificationService notificationService;

	public Store() {
		this.notificationService = new NotificationService();
	}
	public void newItemPromotion() {
		notificationService.notifyAllSubscribers();
	}
	public NotificationService getNotificationService() {
		return this.notificationService;
	}
}
