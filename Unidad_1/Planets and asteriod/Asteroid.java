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
}
