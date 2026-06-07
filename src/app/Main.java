package app;

import model.Direccion;
import model.GuiaTuristico;

public class Main {

    public static void main(String[] args) {

        Direccion d1 = new Direccion("Av. Los Lagos 100", "Llanquihue");
        Direccion d2 = new Direccion("Calle Puerto 250", "Puerto Montt");
        Direccion d3 = new Direccion("Ruta 5 Sur Km 1000", "Valdivia");

        GuiaTuristico g1 = new GuiaTuristico(
                "Patricia Paredes",
                "10.784.987-k",
                d1,
                "Tours Gastronómicos"
        );

        GuiaTuristico g2 = new GuiaTuristico(
                "Javier Rusque",
                "18.776.936-7",
                d2,
                "Excursiones Culturales"
        );

        GuiaTuristico g3 = new GuiaTuristico(
                "Roberto Carlos",
                "15.562.777-6",
                d3,
                "Paseos Lacustres"
        );

        System.out.println("=== GUÍA 1 ===");
        System.out.println(g1);

        System.out.println("\n=== GUÍA 2 ===");
        System.out.println(g2);

        System.out.println("\n=== GUÍA 3 ===");
        System.out.println(g3);
    }
}
