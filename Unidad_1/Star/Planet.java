public class Planet {
    private String name;
    private double sun_distance;
    private String composition;
    private int orbit_days;
    public double mass;

    //CONSTRUCTOR
    public Planet(String nombre, double d, String c, int od, double m) {

        this.name = nombre;
        this.sun_distance = d;
        this.composition = c;
        this.orbit_days = od;
        this.mass = m;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSun_distance(double sun_distance) {
        this.sun_distance = sun_distance;
    }

    public double getSun_distance() {
        return sun_distance;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getComposition() {
        return composition;
    }

    public void setOrbit_days(int orbit_days) {
        this.orbit_days = orbit_days;
    }

    public int getOrbit_days() {
        return orbit_days;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }
}

