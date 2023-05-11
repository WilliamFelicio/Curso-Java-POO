package aula04;
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta ();
        c1.setModelo("BIC");
        c1.setPonta(0.8f);
        System.out.println("Caracteristicas da Caneta");
        System.out.println(c1.getModelo());
        System.out.println(c1.getPonta());
    
    //outra forma
        Caneta c2= new Caneta ();
        c2.modelo="Compactor";
     // c2.ponta= 0.5f; Não é possivel alterar porque o atributo ponta é privado
        c2.setPonta(0.2f);
        c2.status();
        
        Caneta c3=new Caneta();
        c3.destampar();
        c3.status();
    }
}

