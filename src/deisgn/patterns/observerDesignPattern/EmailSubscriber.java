package deisgn.patterns.observerDesignPattern;

public class EmailSubscriber implements Subscriber {
private String emailAdress;


	public EmailSubscriber(String emailAdress) {

	this.emailAdress = emailAdress;
}

	public String getEmailAdress() {
	return emailAdress;
}

public void setEmailAdress(String emailAdress) {
	this.emailAdress = emailAdress;
}

	@Override
	public void update() {
		System.out.println("Email sent to "+getEmailAdress());
		
	}

}
