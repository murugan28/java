package day_5.hirarchial;

public class ChildA extends Parent {
	void name() {
		System.out.println("Child A name");
	}

	public static void main(String[] args) {
		ChildA a = new ChildA();
		a.name();
		a.address();
		a.phno();
	}


}
