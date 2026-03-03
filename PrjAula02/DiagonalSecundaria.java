
public class DiagonalSecundaria {

	public static void main(String[] args) {
		final int TAM = 4;
		int[][] matriz = new int[TAM][TAM];
		int i, j, soma=0;
		
				
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				soma++;
							
				if(i == j) {
					matriz [i++] [j--] = soma;
				}
			}
		}
		

				

		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
			
		}
		
		
		

	}

}
