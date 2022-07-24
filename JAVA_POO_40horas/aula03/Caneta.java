package aula03;

public class Caneta {

    //ATRIBUTOS

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    //METODOS

    public void status(){
        System.out.println(this.modelo);
        System.out.println(this.cor);
        System.out.println(this.ponta);
        System.out.println(this.carga);
        System.out.println(this.tampada);
    }

    protected void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! Nao posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

}
