package model;
import java.util.ArrayList;

public class Bicicleteria  implements Vendible {
  ArrayList<Bicicleta> bicicletas= new ArrayList<Bicicleta>();

  public Bicicleteria(ArrayList<Bicicleta> bicicletas, float ganancias, int cantidadVentas) {
    bicicletas = new ArrayList<>();
    this.bicicletas = bicicletas;
    this.ganancias = ganancias;
    this.cantidadVentas = cantidadVentas;
  }

  public Bicicleteria() {
  }

  private float ganancias;
  private int cantidadVentas;

  public void agregarBicicleta(Bicicleta b) {
    if (bicicletas.size() < 1000) {
      bicicletas.add(b);
    } else {
      System.out.println("No se pueden registrar más de 1000 bicicletas al stock.");
    }

  }

  public void venderBicicleta(String NroSerie) throws ExcepcionBicicletaNoDisponible {
    Bicicleta biciVendi = null;
    for (Bicicleta bici : bicicletas) {
      biciVendi = null;
      bici.getNroSerie().equalsIgnoreCase(NroSerie);
      biciVendi = bici;
      float precioFinal = bici.calcularPrecioFinal();
      ganancias+=precioFinal;
      cantidadVentas++;
      bicicletas.remove(bici);
      System.out.println("Bicicleta " + bici.getModelo() + " con Nro de serie " + bici.getNroSerie() + " Vendida");
      break;

    }
    if (biciVendi == null) {
      throw new ExcepcionBicicletaNoDisponible("La bicicleta con numero de serie: " + NroSerie + "no esta disponible");
    }
  }

  public float getGanancias() {
    return ganancias;
  }

  public void setGanancias(float ganancias) {
    this.ganancias = ganancias;
  }

  public int getCantidadVentas() {
    return cantidadVentas;
  }

  public void setCantidadVentas(int cantidadVentas) {
    this.cantidadVentas = cantidadVentas;
  }

  public void mostrarBiclicletasDisponibles(){
    if (bicicletas.isEmpty()){
      System.out.println("Momentaneamente estamos reabasteciendo stock...");
    }
    else System.out.println("Bicicletas disponibles: ");
    for (Bicicleta bicis : bicicletas){
      System.out.println("Tipo: " + bicis.getTipo() + "\n Modelo " + bicis.getModelo() +  "\n Por un precio de " + bicis.getPrecio());
    }

  }


  @Override
  public float calcularPrecioFinal() {
    return 0;
  }
}
