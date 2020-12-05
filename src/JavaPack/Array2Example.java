package JavaPack;

public class Array2Example {

	public static void main(String[] args) {
		String[][] emprec = new String[2][3];
		emprec[0][0] = "100";
		emprec[0][1] = "Ravi";
		emprec[0][2] = "Simplilearn";
		emprec[1][0] = "101";
		emprec[1][1] = "Anindita";
		emprec[1][2] = "Simplilearn";

		for(int r=0;r<emprec.length;r++) {
			 for(int c=0;c<emprec[r].length;c++)
			 {
			   System.out.print("emprec["+r+"]["+c+"] = "+emprec[r][c] + "\t");
			 }
			 System.out.print("\n");
			}

	}

}
