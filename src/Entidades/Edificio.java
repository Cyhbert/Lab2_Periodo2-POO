package Entidades;

public abstract class Edificio {

      private String numEntradas, numSalidas, ventanasTotales, estiloDiseño;
      private int numPisos;
      private boolean tieneAtico, tieneAsotea;
      private double costoConstruccion;
      
      
      //Interfaces
        public double calcularPrecio(double cantPisos){
              return cantPisos * 2000;
        }
      
      //Metodos Get

      public String getNumEntradas() {
            return numEntradas;
      }

      public String getNumSalidas() {
            return numSalidas;
      }

      public String getVentanasTotales() {
            return ventanasTotales;
      }

      public String getEstiloDiseño() {
            return estiloDiseño;
      }

      public int getNumPisos() {
            return numPisos;
      }

      public boolean isTieneAtico() {
            return tieneAtico;
      }

      public boolean isTieneAsotea() {
            return tieneAsotea;
      }

      public double getCostoConstruccion() {
            return costoConstruccion;
      }
      
      //Metodos Set

      public void setNumEntradas(String numEntradas) {
            this.numEntradas = numEntradas;
      }

      public void setNumSalidas(String numSalidas) {
            this.numSalidas = numSalidas;
      }

      public void setVentanasTotales(String ventanasTotales) {
            this.ventanasTotales = ventanasTotales;
      }

      public void setEstiloDiseño(String estiloDiseño) {
            this.estiloDiseño = estiloDiseño;
      }

      public void setNumPisos(int numPisos) {
            this.numPisos = numPisos;
      }

      public void setTieneAtico(boolean tieneAtico) {
            this.tieneAtico = tieneAtico;
      }

      public void setTieneAsotea(boolean tieneAsotea) {
            this.tieneAsotea = tieneAsotea;
      }

      public void setCostoConstruccion(double costoConstruccion) {
            this.costoConstruccion = costoConstruccion;
      }
      
}
