package algoritmos_ordenacao;

public class MergeSort {
    public static void mergeSort(int[] v, int inicio, int fim) {
        if (inicio < fim) { // verifica se há pelo menos 2 elementos no array
            int meio = (fim + inicio) / 2;
            mergeSort(v, inicio, meio);
            mergeSort(v, meio + 1, fim);
            merge(v, inicio, meio, fim);
        }
    }

    public static void merge(int[] v, int inicio, int meio, int fim) {

        // copiando os elementos para um array auxiliar
        int[] aux = new int[v.length];
        for (int i = inicio; i <= fim; i++) {
            aux[i] = v[i];
        }

        int i = inicio;
        int j = meio + 1;
        int k = inicio; // indice atual de v

        while (i <= meio && j <= fim) {
            if (aux[i] < aux[j]) {
                v[k] = aux[i];
                i++;
            } else {
                v[k] = aux[j];
                j++;
            }
            k++;
        }

        while (i <= meio) {
            v[k] = aux[i];
            i++;
            k++;
        }

        while (j <= fim) {
            v[k] = aux[j];
            j++;
            k++;
        }
    }

}
