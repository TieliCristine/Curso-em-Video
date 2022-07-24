package aula06;

public class ControleRemoto {

    //ATRIBUTOS

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //CONSTRUTOR

    public void ControleRemoto(){
        volume = 50;
        ligado = false;
        tocando = false;
    }

    //METODOS

    public void ligar(){

    }
    public void dseligar(){

    }
    public void abrirMenu(){

    }
    public void fecharMenu(){

    }
    public void maisVolume(){

    }
    public void menosVolume(){

    }
    public void ligarMudo(){

    }
    public void desligarMudo(){

    }
    public void pause(){

    }
    public void play(){

    }

    //GETTERS AND SETTERS

    public int getVolume() {
        return volume;
    }
    public void setVolume(int v) {
        this.volume = v;
    }
    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean l) {
        this.ligado = l;
    }
    public boolean getTocando() {
        return tocando;
    }
    public void setTocando(boolean t) {
        this.tocando = t;
    }
}
