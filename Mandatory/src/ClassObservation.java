
public class ClassObservation {

	public static void main(String[] args) {
		C objC = new C();

	}

}

class A {
A(){
	
}
}

class B {
	int num;

}

class C extends A {
	public void accessB() {
		B objB = new B();
		objB.num = 10;//accessing member of B from A
	}

}