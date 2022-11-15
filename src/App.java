
public class App {

	public static void main(String[] args) {
		int[] vetor = { 3, 6, 8, 1, 4, 9, 0 };
		imprimeVetor(vetor);
		bubbleSort(vetor);
		imprimeVetor(vetor);
		int[] vetor2 = { 3, 6, 8, 1, 4, 9, 0 };
		imprimeVetor(vetor2);
		selectionSort(vetor2);
		imprimeVetor(vetor2);
	}

	public static void bubbleSort(int[] vetor) {
		boolean troca;
		do {
			troca = false;
			for (int i = 1; i < vetor.length; i++) {
				if (vetor[i - 1] > vetor[i]) {
					int temp = vetor[i];
					vetor[i] = vetor[i - 1];
					vetor[i - 1] = temp;
					troca = true;
				}
			}
		} while (troca);
	}

	public static void selectionSort(int[] vetor) {
		for (int i = 0; i < vetor.length - 1; i++) {
			int posMin = i + 1;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[posMin]) {
					posMin = j;
				}
			}
			
			if (vetor[posMin] < vetor[i]) {
				int temp = vetor[posMin];
				vetor[posMin] = vetor[i];
				vetor[i] = temp;
			}
		}
	}

	public static void imprimeVetor(int[] vetor) {
		System.out.print("[ ");
		for (int i = 0; i < vetor.length - 1; i++) {
			System.out.print(vetor[i] + ", ");
		}
		System.out.println(vetor[vetor.length - 1] + "]");
	}
}
