package JAVA_Basico_40horas;

public class Vetor01 {
    public static void main(String[] args) {
        int n[] = {3,2,8,7,5,4};
        //Length (comprimento) é um atributo, ele mostra qtd de "casas" do vetor
        System.out.println("Total de casas de n = " + n.length);

        for(int c = 0; c <= 5; c++){
            System.out.println("Na posicao " + c + " temos o valor " + n[c]);
        }
    }
}
