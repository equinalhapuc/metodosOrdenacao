
public class App {

	public static void main(String[] args) {

		// Define o vetor a ser ordenado e imprime na tela
		System.out.print("Vetor 1: ");
		int[] vetor = { 3, 6, 8, 1, 4, 9, 0 };
		imprimeVetor(vetor);

		// Ordena o vetor com o Selection Sort e imprime o resultado
		selectionSort(vetor);
		System.out.print("\n\n\t1 - Selection Sort:");
		imprimeVetor(vetor);

		// Define o vetor a ser ordenado e imprime na tela
		System.out.print("\n\nVetor 2: ");
		int[] vetor2 = { 3, 6, 8, 1, 4, 9, 0 };
		imprimeVetor(vetor2);

		// Ordena o vetor com o Bubble Sort e imprime o resultado
		bubbleSort(vetor2);
		System.out.print("\n\n\t2 - Bubble Sort: ");
		imprimeVetor(vetor2);
	}

	/**
	 * Bubble Sort
	 * 
	 * @param vetor - Um vetor de inteiros
	 */
	public static void bubbleSort(int[] vetor) {
		// Variável de controle que indica sempre que houver uma troca
		boolean troca;

		// Loop principal
		do {
			troca = false;
			// Percorre o vetor
			for (int i = 1; i < vetor.length; i++) {
				// Se o valor da próxima posição for menor que o da posição atual, faz a troca
				// entre os dois
				if (vetor[i - 1] > vetor[i]) {
					int temp = vetor[i];
					vetor[i] = vetor[i - 1];
					vetor[i - 1] = temp;

					// Sinaliza que houve uma troca
					troca = true;
				}
			}
			// Quando não ocorrer mais nenhuma troca, interrompe o loop
		} while (troca);
	}

	/**
	 * Selection Sort
	 * 
	 * @param vetor - Um vetor de inteiros
	 */
	public static void selectionSort(int[] vetor) {
		// Percorre o vetor
		for (int i = 0; i < vetor.length - 1; i++) {
			// Inicialmente, seta a posição do menor valor como sendo a do próximo elemento
			int posMin = i + 1;

			// Começa a buscar a partir da próxima posição, a posição do menor valor
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[posMin]) {
					posMin = j;
				}
			}

			// Se o menor valor encontrado for menor que o valor da posição atual, faz a
			// troca
			if (vetor[posMin] < vetor[i]) {
				int temp = vetor[posMin];
				vetor[posMin] = vetor[i];
				vetor[i] = temp;
			}
		}
	}

	/**
	 * Função auxiliar para imprimir os vetores na tela.
	 * 
	 * @param vetor - Um vetor de inteiros
	 */
	public static void imprimeVetor(int[] vetor) {
		System.out.print("[ ");
		for (int i = 0; i < vetor.length - 1; i++) {
			System.out.print(vetor[i] + ", ");
		}
		System.out.println(vetor[vetor.length - 1] + "]");
	}
}
