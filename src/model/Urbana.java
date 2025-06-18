package model;

public class Urbana extends Bicicleta implements Vendible{
  public Urbana(String nroSerie, String modelo, int anio, float precio) {
    super(nroSerie, modelo, anio, precio);
  }

  public Urbana() {
  }

  @Override
  public String getTipo() {
    return "Urbana";
  }

  @Override
  public float calcularPrecioFinal() {
    return 0;
  }
}
