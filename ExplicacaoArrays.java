
package aula9;

/*
                         O QUE SÃO ARRAYS?

* Estrutura de dados que consistem em itens de dados do mesmo tipo relacionado
* Permanecem com o mesmo tamanho depois de criados
* É um objeto, daí ser considerado tipo po referencia
*/

public class ExplicacaoArrays {
    public static void main(String[] args) {
        /*criação de um vetor do tipo int, 
        criando um objeto com o mesmo valor declarado,
        informando o tamanho de espaço do vetor*/
        
        //int c[] = new int [12];
        
        //equivalente a:
        
        //int d[];
        //d = new int [12];
        
        //=======================================================
        
        //Criando array d forma direta juntamente com os valores do vetor
        
       // int[] meuArray ={13,46,90,130};
        
        //Criando array de forma indireta
        
        //tamanho do vetor |
        int n = 10;
        
        //declarando e alocação para o vetor "v"
        int[] v = new int [n];
        
        //processando os "n" elementos do vetor "v"
        for(int i = 0; i<n; i++){
            //na i-ésima posição, armazena o valor de i
            v[i] = i;
        }
        
        System.out.println(n);
        
        
    }
}

