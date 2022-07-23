package JAVA_Basico_40horas;

import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for(int valor: vet){
            System.out.print(valor + " ");
        }
        //Para encontrar em qual posição do vetor o valor está:
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("Encontrei o valor na posicao " + p);
    }
}
