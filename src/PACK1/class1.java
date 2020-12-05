package PACK1;

public class class1 {
	protected int var1=100;
	protected void method1()
	{
		System.out.println("method1");
	}

	public static void main(String[] args) {
		class1 c1 = new class1();
		System.out.println(c1.var1);
		c1.method1();
	}

}
