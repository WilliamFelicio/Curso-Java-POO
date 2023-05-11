package aula04;
public class Caneta {
   public String modelo;
   private float ponta;
   private String cor;
   private boolean tampada;

   //método Construct
   public Caneta(){
    this.cor="Azul";
    this.tampar();
   }
   //fim//

   public String getModelo(){
        return this.modelo;
   }

   public void setModelo(String model){
    this.modelo=model;
   }

   public float getPonta(){
    return this.ponta;
   }

   public void setPonta(float pont){
    this.ponta=pont;
   }

   public void tampar(){
        this.tampada=true;
   }

   public void destampar(){
        this.tampada=false;
   }

   public void status(){
    System.out.println("Caracteristicas da Caneta");
    System.out.println("Modelo: " +this.modelo);
    System.out.println("Ponta: " +this.ponta);
    System.out.println("Cor: " +this.cor);
    System.out.println("Tampada: " +this.tampada);
   }

}
