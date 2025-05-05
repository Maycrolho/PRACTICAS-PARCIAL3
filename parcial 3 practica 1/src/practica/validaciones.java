/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Marco Antonio
 */
public class validaciones {
    
    
    public boolean validarnombre(String nombre){
     boolean r = false;
     int c = 0;
        for (int i = 0; i < nombre.length(); i++) {
            if((nombre.codePointAt(i)>= 65 && nombre.codePointAt(i)<=90)
                ||(nombre.codePointAt(i)>= 97 && nombre.codePointAt(i)<=122)
                 ||(nombre.codePointAt(i)==32)){
            c++;
        }     
        }
        if(c == nombre.length()){
        r = true;
        }else {
         r = false;
        }
        try {
            
        } catch (Exception e) {
        
       }
    return true;
    }
     public boolean validaredad(String edad){
          boolean r = false;
        try {
           int a = Integer.parseInt(edad);
           r = true;
        } catch (Exception e) {
        
       }
    
    
    return true;
   
        
    }
 public boolean validaraltura(String altura){
      boolean r = false;
        try {
             int a = Integer.parseInt(altura);
           r = true;
            
        } catch (Exception e) {
        
       }
    
    
    return true;
 }
}
    

