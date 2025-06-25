import model.*;

import java.util.ArrayList;

public class Main{
  public static void main(String[] args) {


    Bicicleteria Carlos = new Bicicleteria();
    Bicicleta b1 = new Montania("AB00285242", "Mountain bike Olmo Wish", 2024, 810877);
    Bicicleta b2 = new Urbana("AA00258741", "Belmondo Urban Rodado 700c", 2025, 661800);
    Bicicleta b3 = new Montania("AC0077442", "Mtb Overtech Q6 R29 Aluminio", 2025, 788999);

    Carlos.agregarBicicleta(b1);
    Carlos.agregarBicicleta(b2);
    Carlos.agregarBicicleta(b3);

    Carlos.mostrarBiclicletasDisponibles();

    try{
      Carlos.venderBicicleta(b1.getNroSerie());
    } catch (ExcepcionBicicletaNoDisponible e) {
      System.out.println("Error: " + e.getMessage());
    }
    System.out.println("Ganancias totales $" + Carlos.getGanancias());


  }
}