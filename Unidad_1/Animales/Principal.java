package Animales;

import java.awt.*;

public class Principal {
    public static void main(String[] args) {
        Animal animalGenerico=new Animal(Color.BLACK, 20);
        Ave piolin=new Ave(Color.YELLOW, 10, "Canario.");
        Perro jack=new Perro(Color.GRAY,3,"Pitbull.");

        animalGenerico.comer();
        piolin.volar();

    }
}
