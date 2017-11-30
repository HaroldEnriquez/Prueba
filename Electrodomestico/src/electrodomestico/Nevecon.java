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
public class Nevecon extends Electrodomestico1{

    private int dimensionCongelador;
    
    public Nevecon( int p,String m,int d){
        
        super(p,m);
        
        dimensionCongelador= d;
        
   
    }
   public int obtenerDimension(){
       
       return dimensionCongelador;
       
   } 
    public void obtenerIVA(){
        
            JOptionPane.showMessageDialog(null,"IVA:" +(precio*0.16));
    }

}