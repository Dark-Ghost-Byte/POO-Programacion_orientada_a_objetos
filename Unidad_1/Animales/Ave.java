package Animales;

import java.awt.*;

public class Ave extends Animal{
    //extends hacer la herencia
    private String tipo;

    //Constructor
    public Ave(Color color, double peso, String tipo){
        super(color, peso);//Llamar al constructor de la super clase
        this.tipo=tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void volar(){
        System.out.println("Ando volando.");
    }

}//Llave class
