package model;

public abstract class Bicicleta implements Vendible {

  protected String nroSerie;
  protected String modelo;
  protected int anio;
  protected float precio;

  public Bicicleta(String nroSerie, String modelo, int anio, float precio) {
    this.nroSerie = nroSerie;
    this.modelo = modelo;
    this.anio = anio;
    this.precio = precio;
  }

  public Bicicleta() {
  }

  public String getNroSerie() {
    return nroSerie;
  }

  public void setNroSerie(String nroSerie) {
    this.nroSerie = nroSerie;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAnio() {
    return anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }

  public abstract String getTipo();

}
