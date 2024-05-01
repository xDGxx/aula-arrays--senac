package aula9;

public class Exemplo1 {

    public static void main(String[] args) {
        int t = 10;

        int[] v = new int[t];

        for (int i = 0; i < t; i++) {
            v[i] = i;
        }
        System.out.println("Vetor: " + t);

        int soma = 0;
        int maior = v[0];
        int menor = v[0];

        //encontra a soma, o menor e o maior elemento
        for (int i = 0; i < t; i++) {
            soma += v[i];
            if (v[i] < menor) {
                menor = v[i];
            }
            if (v[i] > maior) {
                maior = v[i];
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.printf("vetor[%d]: %d", i, v[i]);
            if (v[i] == maior) {
                System.out.print("<---meior");
            }
            if (v[i] == menor) {
                System.out.print("<---menor");
            }
            System.out.println("");
        }
    }
}
