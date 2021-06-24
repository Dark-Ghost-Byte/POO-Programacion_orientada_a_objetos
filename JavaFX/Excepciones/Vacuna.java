public class Vacuna {
    private String nombre;
    private String marcaVacuna;
    private int n_Dosis;

    public Vacuna(String nombre, String marcaVacuna, int n_Dosis) {
        this.nombre = nombre;
        this.marcaVacuna = marcaVacuna;
        this.n_Dosis = n_Dosis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarcaVacuna() {
        return marcaVacuna;
    }

    public void setMarcaVacuna(String marcaVacuna) {
        this.marcaVacuna = marcaVacuna;
    }

    public int getN_Dosis() {
        return n_Dosis;
    }

    public void setN_Dosis(int n_Dosis) {
        this.n_Dosis = n_Dosis;
    }
}
