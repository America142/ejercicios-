/*Autor:America Yaridsaida Villalobos Rodriguez 
 * fecha de creacion:01/abril/2022
 * fecha de actualizacion:05/abril/2022
 * */
package arreglo;

public class Multilicacion {
	private static byte matriz1[][]= {{2,2},{2,5}};
    private static short matriz2 [][]= {{1,1},{4,5}};
    private static int  matriz3 [][] = new int [2][2];

	public static void main(String[] args) {
		
		System.out.println("Resultado: ");
        
		for ( int i = 0; i <2; i++){ 
		        for ( int j = 0; j <2; j++){
		                for ( int k = 0; k < 2; k++ ){ 
		                        matriz3[ i ][j ] += matriz1[i][k]*matriz2[k][j];
		                }
		                System.out.print(matriz3[i][j]+" ");
		        }
		        System.out.println();
		}

		
		
		
	}
	
	
	
}
