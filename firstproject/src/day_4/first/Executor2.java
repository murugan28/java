package day_4.first;

public class Executor2 {
	public static void main(String[] args) {
		Base obj = new Base();
		obj.methodDefault();
		obj.methodProtected();
		
		@SuppressWarnings("unused")
		Base obj1 = new Base();
	}

}
