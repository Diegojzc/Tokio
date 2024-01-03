package TokioSchool.domain;

public class Coche extends Vehiculo{

    private int capacidad_maletero;

     public Coche(){}

    public Coche(String numero_bastidor, String matricula, String modelo, String color, int kilometraje,
                 int capacidad_maletero) {
        super(numero_bastidor, matricula, modelo, color, kilometraje);
        this.capacidad_maletero = capacidad_maletero;
    }

    public int getCapacidad_maletero() {
        return capacidad_maletero;
    }

    public void setCapacidad_maletero(int
                                              capacidad_maletero) {
        this.capacidad_maletero = capacidad_maletero;
    }
    public void añadirkm(double kilometros){
         this.kilometraje += kilometros;
    }


}
