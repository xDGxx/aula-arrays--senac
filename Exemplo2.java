package aula9;

import java.util.Scanner;

public class Exemplo2 {

    //1
    public static int tamanhoVetor() {
        System.out.println("*- Tamanho do Vetor -*");
        Scanner input = new Scanner(System.in);
        System.out.println("Tamanho: ");
        int t = input.nextInt();
        return t;
    }

    //2
    public static int[] criarVetor(int t) {
        System.out.println("=+ Criar o vetor +=");
        int[] vetor = new int[t];
        return vetor;
    }

    /*3 O valor inicial do i é zero, dentro do for iremos
    solicitar dados para preencher todos os dados do vetor*/
    public static int[] preencherVetor(int[] vetor) {
        System.out.println("-* Preenchendo o vetor -*");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%d]: ", i);
            vetor[i] = input.nextInt();
        }
        return vetor;
    }

    public static void imprimir(int[] v) {
        System.out.println("Imprimir ");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("vetor[%d]: %d \n", i, v[i]);
        }
    }

    public static int obterNumero() {
        System.out.println("Obter Número");
        Scanner input = new Scanner(System.in);
        System.out.println("Número: ");
        int n = input.nextInt();
        return n;
    }

    public static int verificarOcorrencias(int n, int[] v) {
        System.out.println("Verificar Ocorrencias");
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (n == v[i]) {
                cont++;
            }
        }
        return cont;
    }

    //testando o programa
    public static void main(String[] args) {
        int t = tamanhoVetor();
        int[] v = criarVetor(t);
        imprimir(v);
        v = preencherVetor(v);
        imprimir(v);
        System.out.println("=====================");
        int n = obterNumero();
        int vo = verificarOcorrencias(n, v);
        System.out.printf("O numero %d apareceu %d vezes\n", n, vo);
    }

}
