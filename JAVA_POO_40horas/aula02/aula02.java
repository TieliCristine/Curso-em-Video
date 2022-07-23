package JAVA_POO_40horas.aula02;

public class aula02 {
    public static void main(String[] args) {

        Reuniao meet = new Reuniao();

        meet.dia = "01/08/2022";
        meet.hora = "13:00";
        meet.local = "online";

        meet.desmarcar();
        meet.status();


    }
}
