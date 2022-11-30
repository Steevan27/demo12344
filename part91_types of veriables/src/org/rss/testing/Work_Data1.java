package org.rss.testing;

public class Work_Data1 {
	
	// Outside a method inside a class is known as class or Instant..
			//And
	//static variables ------- it will asain any were,
	//the value are change one asained
	int a = 15;

	private void ball() {
		int a = 20;
		int b = a;
		System.out.println("The Price of Ball=" + b);

	}

	private void box() {
		a = 30;
		System.out.println("The Price of Box=" + a);

	}

	
	public static void main(String[] args) {
		Work_Data1 z = new Work_Data1();
		z.ball();
		z.box();
		
		//static method first int a=123;
		// static method call bye (variable name.veriable) Ex... (z.a)
		
		
		System.out.println("comman value=" + z.a);
	}

}
