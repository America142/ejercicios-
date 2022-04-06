package arreglo;

public class Principal {
	// private static int x;// este es el del programa de ayer
	// private static int y;// tambien este 

	// private static int array[] = new int[3];
	// private static byte []bytePuntos= {1,2,3};
	// private static short []shortPuntos= {1,2,3};
	// private static int []intPuntos= {1,2,3};
	// private static double []doublePuntos= {1.5,2.5,3.5};
 
	private static byte matriz1[][]= {{2,2},{2,2}};
    private static short matriz2 [][]= {{1,1},{1,1}};
    private static int  matriz3 [][] = new int [2][2];


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//x = 5;
		//y = 10;

		//array[0] = ++x;
		//array[1] = y / x;
		//array[2] = ++y;

		//System.out.println("array 1: " + array[0]);
		//System.out.println("array 2: " + array[1]);
		//System.out.println("array 3: " + array[2]);
		
		//for(int i=0;i<3;i++) {
			//System.out.println(bytePuntos[i]+"-"+shortPuntos[i]+"-"+intPuntos[i]+"-"+doublePuntos[i]);
		//}


		// System.out.println(bits.getNombre() + " " + bits.getLongitud() + "");
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<2;j++) {
				matriz3[i][j]=matriz1[i][j]+matriz2[i][j];
				
		}
			System.out.println("\n");
		}
		
		
}

}
