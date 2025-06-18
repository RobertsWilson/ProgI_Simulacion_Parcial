package model;

public class Ruta extends Bicicleta implements Vendible{
  public Ruta(String nroSerie, String modelo, int anio, float precio) {
    super(nroSerie, modelo, anio, precio);
  }

  public Ruta() {
  }

  @Override
  public String getTipo() {
    return "Ruta";
  }

  @Override
  public float calcularPrecioFinal() {
    return 0;
  }
}
