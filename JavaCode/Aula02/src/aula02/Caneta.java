package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada; 

    void status () {
        System.out.println("Caneta " +this.cor);
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Esta tampada? " +this.tampada);
        System.out.println("Tamanho da ponta: " +this.ponta);
        System.out.println("Carga: " +this.carga);
    }

    void rabiscar ()  {
        if (this.tampada == true){
            System.out.println("ERRO! Impossivel rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }

    void tampar () {
        System.out.println("Caneta TAMPADA");
        this.tampada = true;
    }

    void destampar () {
        System.out.println("Caneta DESTAMPADA");
        this.tampada = false;
    }
}
