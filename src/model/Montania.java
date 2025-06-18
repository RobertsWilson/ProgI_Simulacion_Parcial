package model;

public class Montania extends Bicicleta implements Vendible{

  public Montania(String nroSerie, String modelo, int anio, float precio) {
    super(nroSerie, modelo, anio, precio);
  }

  public Montania() {
  }

  @Override
  public String getTipo() {
    return "Montaña";
  }

  @Override
  public float calcularPrecioFinal() {
    return 0;
  }
}
