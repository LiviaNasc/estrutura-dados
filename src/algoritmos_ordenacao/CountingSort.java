package algoritmos_ordenacao;

import static tipos_abstratos.ArrayDinamico.maiorElemento;

public class CountingSort {

    public static int[] countingSort(int[] a, int k) {

        int[] c = new int[k + 1];


        for (int i = 0; i < a.length; i++) {
            c[a[i]] += 1;
        }


        for (int i = 1; i < c.length; i++) {
            c[i] += c[i - 1];
        }

        int[] b = new int[a.length];

        for (int i = a.length - 1; i >= 0; i--) {
            b[c[a[i]] - 1] = a[i];
            c[a[i]] -= 1;
        }

        return b;

    }

}

