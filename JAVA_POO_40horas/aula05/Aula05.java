package aula05;

public class Aula05 {
    public static void main(String[] args) {

        Conta p1 = new Conta();

        p1.setNumConta(111);
        p1.setTitular("Jubileu");
        p1.abrirConta("cc");
        p1.estadoAtual();

        p1.depositar(300);
        p1.sacar(150);
        p1.anuidade();
        p1.sacar(188);
        p1.fecharConta();
        p1.estadoAtual();

        Conta p2 = new Conta();

        p2.setNumConta(222);
        p2.setTitular("Creuza");
        p2.abrirConta("cp");
        p2.estadoAtual();

        p2.depositar(500);
        p2.sacar(1000);
        p2.anuidade();
    }
}
