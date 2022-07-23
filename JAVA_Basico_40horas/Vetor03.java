package JAVA_Basico_40horas;

import java.util.Arrays;

public class Vetor03 {
    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 9, -4.5};

        //Para organizar os valores para mostrar do menor ao maior usa:
        Arrays.sort(v);

        for (double valor: v) {
            System.out.println(valor);
        }
    }
}
