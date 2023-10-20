package algoritmos_ordenacao;

public class BubbleSort {
    public static void bubbleSort(int[] vetor) {
        int tamanho = vetor.length;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int auxiliar = vetor[j + 1];
                    vetor[j + 1] = vetor[j];
                    vetor[j] = auxiliar;
                }
            }
        }
    }

    public static void bubbleSortOtimizado(int[] vetor) {
        int tamanho = vetor.length;
        boolean troca;

        do {
            troca = false;
            for (int j = 0; j < tamanho - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int auxiliar = vetor[j + 1];
                    vetor[j + 1] = vetor[j];
                    vetor[j] = auxiliar;
                    troca = true;
                }
            }
            tamanho--;
        } while (troca);
    }
}
