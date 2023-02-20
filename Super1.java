package Ashwani;
class Shape{
	String name= "circle";
}
class Size extends Shape{
	String name = "no Size";
	void print() {
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class Super1 {
public static void main(String[] args) {
	Size c = new Size();
	c.print();
}
}
