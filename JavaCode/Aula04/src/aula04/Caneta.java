package aula04;
public class Caneta {
   public String modelo;
   private float ponta;

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

   public void status(){
    System.out.println("Caracteristicas da Caneta");
    System.out.println("Modelo: " +this.modelo);
    System.out.println("Ponta: " +this.ponta);
   }

}
