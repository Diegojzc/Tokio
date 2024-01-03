package TokioSchool.domain;

public class Moto extends Vehiculo{

    private boolean cadenado;
    private double peso;

    public Moto(String numero_bastidor, String matricula, String modelo, String color,
                int kilometraje, boolean cadenado, double peso) {
        super(numero_bastidor, matricula, modelo, color, kilometraje);
        this.cadenado = cadenado;
        this.peso = peso;
    }

    public boolean isCadenado() {
        return cadenado;
    }

    public void setCadenado(boolean cadenado) {
        this.cadenado = cadenado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void eliminarCadenado(boolean b){
        cadenado= true;
        peso-=2;
    }
}
