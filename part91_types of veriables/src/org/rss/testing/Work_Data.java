package org.rss.testing;

public class Work_Data {
	
			// LOCAL Data type
			// inside a method
	

	public void kit() {
		int a = 10;
		int b = a;
		System.out.println("The Kit Price=" + b);

	}

	public void bike() {
		int a = 20;
		System.out.println("The Bike Price=" + a);

	}



	public static void main(String[] args) {
		Work_Data x = new Work_Data();
		x.bike();
		x.kit();
	}
}
