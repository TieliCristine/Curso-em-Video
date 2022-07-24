package aula01;

public class Livro {

    //ATRIBUTOS

    String titulo;
    String autor;
    double qtdPag;
    boolean aberto;

    //METODOS

    void status() {
        System.out.println(this.titulo);
        System.out.println(this.autor);
        System.out.println(this.qtdPag);
        folhear();
    }

    void abrir() {
        this.aberto = true;
    }

    void fechar() {
        this.aberto = false;
    }

    void folhear() {
        if (aberto == true) {
            System.out.println("Livro aberto, folheando as paginas.");
        } else {
            System.out.println("Livro fechado, nao posso folhear!");
        }
    }
}
