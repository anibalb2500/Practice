package polymorphism;

public class polymorphism {
	public static void main(String[] args) {
		food t[] = new food[2];	//food is the super class. Each array index can be either data type food, tuna (child class), or potie (child)
		
		t[0] = new tuna();	//instead of creating new objects, we can just define them quickly here and use the same methods as such in comment *1
		t[1] = new potpie();
		for(int i = 0; i<2; i++) {
			t[i].eat();		//*1
			t[i].bye(i);
		}
		
		food b = new tuna();
		b.a();
	}
}
