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
public class Electrodomestico1 {
    
protected int precio;
protected String marca;

public Electrodomestico1(int p,String m){
    
precio=p;
marca=m;

}
public void obtenerprecio(){
JOptionPane.showMessageDialog(null,"Precio "+precio);
}
public void obtenermarca(){
JOptionPane.showMessageDialog(null,"Marca "+marca);

}
public void apagar(){

            JOptionPane.showMessageDialog(null,"El electrodomestico se apagará");
}
public void encender(){
    
   JOptionPane.showMessageDialog(null,"El Electrodomestico se encendera");
}
}
