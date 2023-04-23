package day_4.second;

import day_4.first.Base;

public class Executor {

	public static void main(String[] args) {
		Base b = new Base();
		//private, default, protected members cannot be access outside the package
		b.methodPublic();
		
		b.varPublic = 22;
		b.methodPublic();
	}

}
