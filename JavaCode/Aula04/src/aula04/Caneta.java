package aula04;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada; 

    public void status () {
        System.out.println("Caneta " +this.cor);
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Esta tampada? " +this.tampada);
        System.out.println("Tamanho da ponta: " +this.ponta);
        System.out.println("Carga: " +this.carga);
    }

    public void rabiscar ()  {
        if (this.tampada == true){
            System.out.println("ERRO! Impossivel rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar () {
        System.out.println("Caneta TAMPADA");
        this.tampada = true;
    }

    protected void destampar () {
        System.out.println("Caneta DESTAMPADA");
        this.tampada = false;
    }
}
