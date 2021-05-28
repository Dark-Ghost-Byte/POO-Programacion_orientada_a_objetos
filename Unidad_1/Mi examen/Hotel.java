public class Hotel {
    private String nombre;
    public double ocupadas=0;
    public double disponibles;

    public Hotel(String nombre, double ocupadas, double disponibles){
        this.nombre=nombre;
        this.ocupadas=ocupadas;
        this.disponibles=disponibles;
    }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() {
        return nombre;
    }

    public void setOcupadas(double ocupadas) { this.ocupadas = ocupadas; }
    public double getOcupadas() { return ocupadas; }

    public void setDisponibles(double disponibles) { this.disponibles = disponibles; }
    public double getDisponibles() { return disponibles; }


    public void imprimirCapacidad(double ocupadas, double disponibles){
        System.out.println("Hay un total de 50 Disponibles");
        int capacidad=50;
    }



}
