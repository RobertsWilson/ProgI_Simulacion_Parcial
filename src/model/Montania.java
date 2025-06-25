package model;

public class Montania extends Bicicleta implements Vendible{

  public Montania(String nroSerie, String modelo, int anio, float precio) {
    super(nroSerie, modelo, anio, precio);
  }

  public Montania() {
  }

  @Override
  public float getPrecio() {
    return super.getPrecio();
  }

  @Override
  public void setPrecio(float precio) {
    super.setPrecio(precio);
  }

  @Override
  public String getTipo() {
    return "Montaña";
  }


  @Override
  public float calcularPrecioFinal() {
    if (anio < 2025){
      return (float)(precio*0.90);
    }
    return (float) (precio * 1.21);
  }
}
