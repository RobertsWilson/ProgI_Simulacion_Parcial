package model;
import java.util.ArrayList;

public class Bicicleteria  implements Vendible {
  ArrayList<Bicicleteria> bicicletas= new ArrayList<Bicicleteria>();

  public Bicicleteria(ArrayList<Bicicleteria> bicicletas, float ganancias, int cantidadVentas) {
    this.bicicletas = bicicletas;
    this.ganancias = ganancias;
    this.cantidadVentas = cantidadVentas;
  }

  public Bicicleteria() {
  }

  private float ganancias;
  private int cantidadVentas;

  public void agregarBicicleta(Bicicleteria b) {
    if (bicicletas.size() < 1000) {
      bicicletas.add(b);
    } else {
      System.out.println("No se pueden registrar más de 1000 bicicletas al stock.");
    }

  }

  public void venderBicicleta(String NroSerie){

  }

  public void mostrarBiclicletasDisponibles(){

  }


  @Override
  public float calcularPrecioFinal() {
    return 0;
  }
}
