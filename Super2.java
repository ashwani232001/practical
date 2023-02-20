package Ashwani;
class Shape1{
	void Print() {
		System.out.println("circle");
	}
}
class Shape2 extends Shape1{
	void display() {
		System.out.println("triangle");
		super.Print();
	}
}
public class Super2 {
public static void main(String[] args) {
	Shape2 obj = new Shape2();
	obj.display();
	}
}
