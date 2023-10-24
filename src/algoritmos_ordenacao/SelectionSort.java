package algoritmos_ordenacao;

public class SelectionSort {
    public static void selectionSort(int [] vetor){
        int menorIndice, aux;
        for(int i = 0; i < vetor.length; i++){
            menorIndice = i;
            for(int j = i + 1; j < vetor.length; j++){
                if (vetor[j] < vetor[menorIndice]){
                    menorIndice = j;
                }
            }
            aux = vetor[menorIndice];
            vetor[menorIndice] = vetor[i];
            vetor[i] = aux;
        }
    }
}
