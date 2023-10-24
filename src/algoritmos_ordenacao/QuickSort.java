package algoritmos_ordenacao;

public class QuickSort {
        public static void quickSort(int [] vetor, int inicio, int fim) {
            if (inicio < fim) {
                int posicaoPivo = separar(vetor, inicio, fim);
                quickSort(vetor, inicio, posicaoPivo);
                quickSort(vetor, posicaoPivo + 1, fim);
            }
        }

        static int separar(int [] vetor,  int inicio, int fim ){
            int meio = (int) (inicio+fim)/2;
            int pivo = vetor[meio];
            int i = inicio - 1 ;
            int j = fim + 1;
            while(true){
                do{
                    i++;
                }while(vetor[i]< pivo);
                do{
                    j--;
                }while(vetor[j] > pivo);
                if(i >= j){
                    return j;
                }
                int aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
            }
        }
    }

