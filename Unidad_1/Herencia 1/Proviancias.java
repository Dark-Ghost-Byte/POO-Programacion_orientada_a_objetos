public class Proviancias {
    private String idioma;
    protected String moneda;
    protected String presidente;

    public Proviancias(String idioma, String moneda, String presidente){
        this.idioma=idioma;
        this.moneda=moneda;
        this.presidente=presidente;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public String getIdioma() {
        return idioma;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    public String getMoneda() {
        return moneda;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }
    public String getPresidente() {
        return presidente;
    }
}
