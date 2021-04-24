public class Asteroid {
    private String name;
    private String composition;
    public double distance_of_earth;
    protected double speed;

    //CONSTRUCTOR
    public Asteroid(String n, String c, double doe, double s ){

        this.name=n;
        this.composition=c;
        this.distance_of_earth=doe;
        this.speed=s;
    }
    //SET => PONER ASIGNAR
    //GET => OBTENER O TRAER
    //CAMBIAR EL NOMBRE DEL PLANETA

    public void setName (String nuevoNombre){
        this.name=nuevoNombre;
    }
    public String getName (){
        return this.name;
    }

    public void setComposition (String nuevaComposicion) {
        this.composition=nuevaComposicion;
    }
    public String getComposition (){
        return this.composition;
    }

    public void setDistance_of_earth (double nuevaDistancia){
        this.distance_of_earth=nuevaDistancia;
    }
    public double getDistance_of_earth (){
        return this.distance_of_earth;
    }

    public void setSpeed (double nuevaVelocidad){
        this.speed=nuevaVelocidad;
    }
    public double getSpeed (){
        return this.speed;
    }
}
