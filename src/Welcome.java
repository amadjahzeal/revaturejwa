
public class Welcome {
	
	public static void main(String[] args) {
		System.out.println("Welcome to my program");
		Welcome w = new Welcome();
		w.display();
		Logo l = new Logo();
		l.printLogo();
		Product p = new Product();
		p.order();
	}
	public void login() {
		System.out.println("Login required");
	}
	public void display() {
		System.out.println("###Welcome to Revature");
		Welcome w = new Welcome();
		w.login();
	}
}
class Logo 
{
	public void printLogo() {
		System.out.println("Logo print logo called");
	}
	public static void main(String[] args) {
		System.out.println("MAIN METHOD OF LOGO CALLED");
	}
}