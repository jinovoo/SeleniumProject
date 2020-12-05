package JavaPack;

public class ArrayExample {

	public static void main(String[] args) {
		int[] arr = new int[5];
		//assign values to arr
		arr[0] = 45;
		arr[1] = 56;
		arr[2] = 67;
		arr[3] = 90;
		arr[4] = 35;
		for(int i = 0 ; i<arr.length;i++)
		{
		  System.out.println("arr["+i+"] ="+ arr[i]);
		}

	}

}
