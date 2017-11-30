/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package electrodomestico;

import javax.swing.JOptionPane;

/**
 *
 * @author HAROLD
 */
public class Electrodomestico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               int datos;
               String marca="";
        
        
        
      datos=Integer.parseInt(JOptionPane.showInputDialog("ingrese datos"));
      
      
      marca=JOptionPane.showInputDialog("ingrese marca");
      
      Electrodomestico1 electro=new Electrodomestico1(datos,marca);
      electro.obtenermarca();
      electro.obtenerprecio();
      electro.apagar();
      electro.encender();
      
      
    
      Nevecon Neve=new Nevecon(20000,"sony",45);
      
      Neve.obtenerprecio();
      Neve.obtenerIVA();
        System.exit(0);
        
 
          
      }
    
}
