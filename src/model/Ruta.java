package model;

public class Ruta extends Bicicleta implements Vendible{
  public Ruta(String nroSerie, String modelo, int anio, float precio) {
    super(nroSerie, modelo, anio, precio);
  }

  public Ruta() {
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
    return "Ruta";
  }

  @Override
  public float calcularPrecioFinal() {
    if (anio < 2025){
      return (float)(precio*0.90);
    }
    return (float) (precio * 1.21);
  }
}

