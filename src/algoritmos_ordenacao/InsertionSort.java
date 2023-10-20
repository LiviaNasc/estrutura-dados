package algoritmos_ordenacao;

public class InsertionSort {

    public static void insertionSort(int[] vetor){
        int tamanho = vetor.length;

        for (int i = 1; i < tamanho; ++i) {
            int aux = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
    }
}
