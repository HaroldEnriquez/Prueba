/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

/**
 *
 * @author HAROLD
 */
public class Password1 {
  

    private final static int LONG_DEF=8;
    private int longitud;
    private String contraseña;
  
 
    public int getLongitud() {
        return longitud;
    }
  
  
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
  

    public String getContraseña() {
        return contraseña;
    }
  

    public String generaPassword (){
        String password="";
        String clave="0123456789AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789";
        char pass[]=clave.toCharArray() ;
        
        int rnd;
        longitud=15;
        for(int i=0;i<longitud;i++){
            rnd=(int)Math.floor(Math.random()*(pass.length));
            password+=pass[rnd];
        }
        
        return password;
    }
  
 
    public boolean esFuerte(String clave){
        int cuentanumeros=0;
        int cuentaminusculas=0;
        int cuentamayusculas=0;
        
        char pass[]=clave.toCharArray();

        for (int i=0;i<pass.length;i++){
                if (Character.isLowerCase(pass[i])){
                    cuentaminusculas+=1;
                }else{
                    if (Character.isUpperCase(pass[i])){
                        cuentamayusculas+=1;
                }else{ 
                     if(Character.isDigit(pass[i])){
                         cuentanumeros++;
                     }
                    }
                }
            }
           
            if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
            return true;
        }else{
            return false;
        }
    }
  

 
    public Password1 (){
        //this.longitud=longitud;
      
    }
}