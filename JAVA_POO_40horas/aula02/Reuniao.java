package JAVA_POO_40horas.aula02;

public class Reuniao {

    //ATRIBUTOS

    String dia;
    String hora;
    String local;
    boolean statusReuniao;

    //METODOS

    void status() {
        System.out.println(this.dia);
        System.out.println(this.hora);
        System.out.println(this.local);
        executar();
    }

    void confirmar() {
        this.statusReuniao = true;
    }

    void desmarcar() {
        this.statusReuniao = false;
    }

    void executar() {
        if (statusReuniao == true){
            System.out.println("Reuniao confirmada");
        } else {
            System.out.println("Reuniao cancelada");
        }
    }
}
