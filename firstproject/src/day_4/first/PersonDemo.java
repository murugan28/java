package day_4.first;

public class PersonDemo {
	public static void main(String[] args) {
		Person p = new Person();
		int n = 10;
		p.setNumber(n);
		//p.toString();
		p = new Person(n);//Parameterized constructor
		System.out.println("Number is: "+p.getNumber());
	}

}
