package aula05;


public class Conta {

    //ATRIBUTOS

    public int numConta;
    protected String tipo;        //"cc" para conta corrente e "cp" para poupança
    private String titular;
    private double saldo;
    private boolean status;       //Conta aberta ou fechada


    //CONSTRUTOR

    //Nova conta criada -> status falso && saldo = R$0,00

    public void Conta(int numConta, String tipoConta, String titular){
        this.setSaldo(0);
        this.setStatus(false);
    }


    //METODOS

    public void estadoAtual(){
        System.out.println("------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String t){  //Abrir cc ganha R$50,00 | cp ganha R$150,00
        System.out.println("------------------------------------------");
        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc"){
            this.setSaldo(50.00);
        } else {
            this.setSaldo(150.00);
        }
        System.out.println("Conta aberta com sucesso.");
    }
    public void fecharConta(){ //Verifica se há saldo ou débitos antes de fechar
        System.out.println("------------------------------------------");
        if (this.getSaldo() > 0){
            System.out.println("Conta com saldo, nao pode ser fechada.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta com debito, nao pode ser fechada");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }
    public void depositar(double v){   //Verifica antes status conta aberto
        System.out.println("------------------------------------------");
        if (this.getStatus() == true){
            this.setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getTitular());
        } else {
            System.out.println("Impossivel depositar, conta fechada.");
        }
    }
    public void sacar(double v){       //Verifica status conta aberto && saldo
        System.out.println("------------------------------------------");
        if (this.getStatus() == true){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getTitular());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar.");
        }
    }
    public void anuidade(){    //cc = R$12,00  &&  cp = R$20,00
        System.out.println("------------------------------------------");
        float v = 0;
        if (this.getTipo() == "cc"){
            v = 12.00f;
        } else if (this.getTipo() == "cp"){
            v = 20.00f;
        }
        if (this.getStatus() == true){
            if (this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getTitular());
                System.out.println("Saldo atual: " + this.getSaldo());
            } else {
                System.out.println("Saldo insuficiente para pagar anuidade.");
            }
        } else {
            System.out.println("Impossivel pagar anuidade, conta fechada.");
        }

    }



    //GETTERS AND SETTERS


    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
