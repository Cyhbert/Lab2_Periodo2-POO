
package Entidades;

public class Educativo extends Edificio{

      public Educativo(String numEntradas, String NumSalidas, String numVentanas, String estiloDiseño) {
            super.setNumEntradas(numEntradas);
            super.setNumSalidas(NumSalidas);
            super.setVentanasTotales(numVentanas);
            super.setEstiloDiseño(estiloDiseño);
            
      }
      
      @Override
      public double calcularPrecio(double cantPisos) {
            return super.calcularPrecio(cantPisos); //To change body of generated methods, choose Tools | Templates.
      }
      
}
