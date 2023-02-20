package Ashwani;
class Cons1{
	Cons1(){
		System.out.println("Hello");
	}
}
class Cons2 extends Cons1{
	Cons2(){
		//super();
		System.out.println("HI");
	}
}
public class Supercons {
public static void main(String[] args) {
	Cons2 obj = new Cons2();
	
}
}
