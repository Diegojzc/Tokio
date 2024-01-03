package TokioSchool;

import TokioSchool.domain.Coche;
import TokioSchool.domain.Mecanico;
import TokioSchool.domain.Moto;

public class Principal {
    public static void main(String[]args){

        Mecanico mecanico =new Mecanico("Diego","Zapata","djavi91@","moto");
        Coche coche = new Coche("342344","3243545",
                "hyunday tuccson","blanco",1200,215);
        Moto moto = new Moto("73464574","434595","bmw zx",
                "negro",12250,false,450);

        coche.añadirkm(200);
        coche.pintar("azul");
        moto.eliminarCadenado(false);

        System.out.println(coche.getKilometraje());
        System.out.println(coche.getColor());
        System.out.println(moto.isCadenado());
        System.out.println(moto.getPeso());
    }
}
