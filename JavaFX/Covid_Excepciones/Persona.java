import java.util.Date;

public class Persona {
    private String nombre;
    private String curp;
    private String fecha;
    private String vacuna;

    public Persona(String nombre, String curp, String vacuna) {
        this.nombre = nombre;
        this.curp = curp;
        this.vacuna = vacuna;
        Date fechaDate=new Date();
        this.fecha=fechaDate.getDay()+"/"+fechaDate.getMonth()+"/"+fechaDate.getYear();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }
}
