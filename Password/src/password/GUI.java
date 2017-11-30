/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package password;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;



public class GUI extends JFrame implements ActionListener{

    private Container ventana;
    private JLabel titulo;
    private JLabel titulo2;
    private JTextArea salida;
    private  JTextField entrada;
    private JScrollPane barras;
    private JButton consultar;
    private FlowLayout esquemaVentana;
    private JPanel ventanas;
    public String clave;
    private String user;
    private JButton registrar;
    GUI(){
    ventana=getContentPane();
    
    ventanas=new JPanel();
    ventanas.setBackground(new java.awt.Color(255,255,255));
    
    esquemaVentana= new FlowLayout();
    ventana.setLayout(esquemaVentana);
    
    titulo=new JLabel();
    titulo.setFont(new Font("Verdana",1,10));
    titulo.setForeground(new java.awt.Color(130,35,230));
    titulo.setText("Ingrese Login");
    titulo2=new JLabel();
    titulo2.setFont(new Font("Verdana",1,10));
    titulo2.setForeground(new java.awt.Color(130,35,230));
    titulo2.setText("Contraseña");
    ventana.add(titulo);
    entrada=new JTextField(12);
    ventana.add(entrada);
    
    ventana.add(titulo2);
    salida=new JTextArea(1,13);
    barras= new JScrollPane(salida);
    ventana.add(barras);
    consultar= new JButton("Consultar");
    consultar.addActionListener(this);
    registrar =new JButton("Registrar");
    registrar.addActionListener(this);
    ventana.add(consultar);
    ventana.add(registrar);
            
    ventana.add(ventanas);
    setTitle("callate chepe!!");
    //Point p=new pPoint(350,10);
    setResizable(true);
    setSize(300,180);
    setLocationRelativeTo(null);
    setVisible(true);
    
    }
    public void actionPerformed(ActionEvent e){
    
        if(e.getSource()==consultar){
            Password1 pass=new Password1();
            
            clave=pass.generaPassword();
            salida.setText(clave);
            
        }
        if (e.getSource()==registrar){
            user=entrada.getText();
            Conex conexion=new Conex(user, clave);
        }
    }
}
