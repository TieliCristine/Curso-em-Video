package aula06;

public class ControleRemoto implements Controlador {

    //ATRIBUTOS

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //CONSTRUTOR

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //MÉTODOS ABSTRACT

    public void ligar() {
        this.setLigado(true);
    }
    public void desligar(){
        this.setLigado(false);
    }
    public void abrirMenu(){
        System.out.println("-----------MENU-----------");
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println();
        System.out.println("--------------------------");
    }
    public void fecharMenu(){
        System.out.println("Fechando menu");
        System.out.println("Menu fechado");
    }
    public void maisVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
            System.out.println("Volume: " + this.getVolume());
        }
    }
    public void menosVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
            System.out.println("Volume: " + this.getVolume());
        }
    }
    public void ligarMudo(){
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
            System.out.println("Mudo");
        }
    }
    public void desligarMudo(){
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
            System.out.println("Volume: " + this.getVolume());
        }
    }
    public void play(){
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
            System.out.println("Play");System.out.println("Tocando");
        }
    }
    public void pause(){
        if (this.getLigado() && this.getTocando()){
                this.setTocando(false);
                System.out.println("Pause");
            }
        }



    //GETTERS AND SETTERS

    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private boolean getLigado() {
        return ligado;
    }
    private void setLigado(boolean l) {
        this.ligado = l;
    }
    private boolean getTocando() {
        return tocando;
    }
    private void setTocando(boolean t) {
        this.tocando = t;
    }
}
