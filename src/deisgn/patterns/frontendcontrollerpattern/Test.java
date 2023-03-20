package deisgn.patterns.frontendcontrollerpattern;

public class Test {
public static void main(String[] args) {
	FrontEndController controller=new FrontEndController();
	HomeView homeView=new HomeView();
	StudentView studentView=new StudentView();
	controller.getDispatcher().addView("home", homeView);
	controller.getDispatcher().addView("student", studentView);
	controller.dispathRequest("home");
}
}
