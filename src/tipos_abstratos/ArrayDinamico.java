package tipos_abstratos;

import java.util.Arrays;

public class ArrayDinamico {
    private static int[] vetor = new int[10];
    private static int tamanho = 0;

    public static boolean pesquisarElemento(int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public static int menorElemento(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static int maiorElemento(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int sucessor(int elemento) {
        for (int i = 0; i < tamanho - 1; i++) {
            if (vetor[i] == elemento) {
                return vetor[i + 1];
            }
        }
        throw new IllegalArgumentException("Elemento não encontrado ou já é o último");
    }

    public static int antecessor(int elemento) {
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] == elemento) {
                return vetor[i - 1];
            }
        }
        throw new IllegalArgumentException("Elemento não encontrado ou já é o primeiro");
    }

    public static void inserir(int elemento) {
        if (tamanho == vetor.length) {
            vetor = Arrays.copyOf(vetor, vetor.length * 2);
        }
        vetor[tamanho] = elemento;
        tamanho++;
    }

    public static void deletar(int elemento) {
        int indice = -1;
        boolean encontrado = false;

        //buscando o índice do elemento
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == elemento) {
                indice = i;
                encontrado = true;
            }
            // se o elemento for encontrado, move os elementos 1 posição
            if (encontrado && i < tamanho - 1) {
                vetor[i] = vetor[i + 1];
            }
        }

        if (encontrado) {
            tamanho--;
        } else {
            throw new IllegalArgumentException("Elemento não encontrado");
        }
    }
}
