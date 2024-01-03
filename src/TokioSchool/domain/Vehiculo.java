package TokioSchool.domain;

public abstract class  Vehiculo {
    private String numero_bastidor;
    private String matricula;
    private String modelo;
    protected String color;
    protected int kilometraje;

    public Vehiculo(){}

    public Vehiculo(String numero_bastidor, String matricula, String modelo, String color, int kilometraje) {
        this.numero_bastidor = numero_bastidor;
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    public String getNumero_bastidor() {
        return numero_bastidor;
    }

    public void setNumero_bastidor(String numero_bastidor) {
        this.numero_bastidor = numero_bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometraje() {
        return kilometraje;
    }
    public void setKilometraje(int kilometraje){
        this.kilometraje = kilometraje;
    }

    public void pintar(String nuevoColor){
        color = nuevoColor;
    }
}
