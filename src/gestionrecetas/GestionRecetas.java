
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 *                      Este es nuestro MAIN !!!
 */
public class GestionRecetas{
    
    public static boolean procesar(String receta, String heladera){
     
        if(OrganizadorRecetas.buscarEnHeladera(receta, heladera))
            return true; 
    
    return false;    
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////       
    
    public static void main(String[] args){
    
       /* if(OrganizadorRecetas.buscarEnHeladera())
            System.out.println("Se encuentra todos los ingredientes y alcanzan para hacer la receta!");
                    else System.out.println("NO se encontraron todos los ingredientes o no alcanzan para hacer la receta!");*/
    }

}
