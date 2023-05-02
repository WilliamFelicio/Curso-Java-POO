package aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1=new Caneta();
        c1.modelo = "Manuel Gomes";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 80;
        c1.status();
        //tampando caneta e pedindo pra rabiscar
        c1.tampar();
        c1.rabiscar();
        //destampando caneta e pedindo pra rabiscar
        c1.destampar();
        c1.rabiscar();
        //Instanciando uma nova Caneta
        Caneta c2=new Caneta();
        c2.modelo = "GitHub";
        c2.cor = "Preta";
        c2.ponta = 2.0f;
        c2.status();
        c2.tampar();
    }
}

