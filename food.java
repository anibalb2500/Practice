package polymorphism;

public class food {
	void eat() {
		System.out.println("This food slaps");
	}
	
	void bye(int x) {
		if(x == 1) {
			System.out.println("This is the " + x + "st food item");
		}
		else if(x == 3) {
			System.out.println("This is the " + x + "rd food item");
		}
		else {
			System.out.println("This is the " + x + "th food item");
		}
	}
	
	void a() {
		System.out.println("a");
	}
}
