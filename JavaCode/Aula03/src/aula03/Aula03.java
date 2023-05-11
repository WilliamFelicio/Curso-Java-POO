package aula03;
public class Aula03 {
    public static void main(String[] args) {
        Caneta c1=new Caneta();
        c1.modelo="Bic";      //public//
        c1.cor="Azul";        //public//
        //c1.ponta=0.7f;      //private//
        c1.carga=25;          //protected//
        //c1.tampada=true;   //private//
        
        c1.status();          //public;//
        c1.tampar();          //public;//
        c1.rabiscar();        //public//
        c1.destampar();       //protected//
        c1.rabiscar();
    }
}

