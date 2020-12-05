package JavaPack;

public class datatypeExamples {

	public static void main(String[] args) {
		int qty = 50;
		//float needs to be end with f lower case to indicate it is a float variable
		float price = 45.6f;
		double totalPrice = qty * price;
		char c = 'e';
		boolean flag = false;
		//Example 1
		//print I
		System.out.println("Quantity of Apple = " + qty);
		System.out.println("Price of Apple = " + price);
		System.out.println("Total Price = " + totalPrice);
		System.out.println("Char Value = " + c);
		System.out.println("Value of flag = " + flag);
		
		//print II
		System.out.println("Quantity of Apple = " + qty + "\n"
		+ "Price of Apple = " + price + "\n"
		+ "Total Price = " + totalPrice + "\n"
		+ "Char Value = " + c + "\n"
		+ "Value of flag = " + flag);
		
		//Example2
		int i = 100;
		int j = 200;
		String s = "Hello";
		System.out.println(i+j+s);
		System.out.println(s+i+j);
		System.out.println(s+(i+j));
		
	}

}
