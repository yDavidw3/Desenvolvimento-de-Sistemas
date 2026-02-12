
public class Exercicio02 {

	public static void main(String[] args) {
		final int TAM = 4;
		int [] [] matriz = new int [TAM] [TAM];
		int soma = 1;
		
		for (int i=0; i<TAM; i++) {
			for (int j=0; j<TAM; j++) {
				matriz [i++] [j] = soma++;
				soma = soma + 4;
			}
		}

		
		
		for (int i=0; i<TAM; i++) {
			for (int j=0; j<TAM; j++) {
				System.out.print(matriz[i] [j] + " ");
			}
			System.out.println();
		}

	}
}
