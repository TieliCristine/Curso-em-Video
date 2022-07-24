package aula06;

public class Controlador extends ControleRemoto {

    public void ligar() {
        this.setLigado(true);
    }

    public void dseligar(){
        this.setLigado(false);
    }
    public void abrirMenu(){
        System.out.println(this.getLigado());
        System.out.println(this.getVolume());
        int i;
        for (i=0; i < getVolume(); i++){
            System.out.println("|");
        }
        System.out.println(getTocando());
    }
    public void fecharMenu(){
        System.out.println("Fechando menu");
        System.out.println("Menu fechado");
    }
    public void maisVolume(){
        if (this.getLigado() == true){
            this.setVolume(this.getVolume() + 1);
            System.out.println("Volume: " + this.getVolume());
        }
    }
    public void menosVolume(){
        if (this.getLigado() == true){
            this.setVolume(this.getVolume() - 1);
            System.out.println("Volume: " + this.getVolume());
        }
    }
    public void ligarMudo(){
        if (this.getLigado() == true){
            if (this.getVolume() > 0){
                this.setVolume(0);
                System.out.println("Mudo");
            }
        } else {
            System.out.println("Aparelho desligado.");
        }
    }
    public void desligarMudo(){
        if (this.getLigado() == true){
            if (this.getVolume() == 0){
                this.setVolume(50);
                System.out.println("Volume: " + this.getVolume());
            }
        } else {
            System.out.println("Aparelho desligado.");
        }
    }
    public void play(){
        if (this.getLigado() == true){
            if (this.getTocando() == false){
                this.setTocando(true);
                System.out.println("Play");
                System.out.println("Tocando");
            }
        } else {
            System.out.println("Aparelho desligado");
        }
    }
    public void pause(){
        if (this.getLigado() == true){
            if (this.getTocando() == true){
                this.setTocando(false);
                System.out.println("Pause");
            }
        } else {
            System.out.println("Aparelho desligado");
        }
    }
}
