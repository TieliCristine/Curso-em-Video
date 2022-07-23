package JAVA_POO_40horas.aula01;

public class Aula01 {
    public static void main(String[] args) {

        Livro livro1 = new Livro();

        livro1.titulo = "O Homem Lunatico";
        livro1.autor = "Ze Zezinho";
        livro1.qtdPag = 258;
        livro1.aberto = true;


        Livro livro2 = new Livro();

        livro2.titulo = "Viagem interestelar";
        livro2.autor = "James T. Kurk";
        livro2.qtdPag = 752;
        livro2.aberto = false;


        livro1.status();
        livro2.status();

        livro1.fechar();
        livro2.abrir();

        livro1.status();
        livro2.status();
    }
}
