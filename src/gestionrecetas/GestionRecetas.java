import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author George --------> Este es nuestro MAIN !!!
 */
public class GestionRecetas {

    public static void main(String[] args){
    
        OrganizadorRecetas.buscarEnHeladera();
        
    }

}

/*
public class GestionRecetas {

    public static void main(String[] args) throws IOException {    
            
        if (leerReceta()){
            System.out.println("Todos los ingrediente de la receta estan en la heladera!");
        } else System.out.println("Algun ingrediente de la receta NO estan en la heladera!");
        
    } 

    private static boolean leerReceta(){
        try{	
        String archivo = "receta.txt";
        File f = new File(archivo);
                Scanner sc = new Scanner(f);
                
                while (sc.hasNextLine()){                  
                    String lineaDeReceta = sc.nextLine();
                            
                    if(buscarEnHeladera(lineaDeReceta)){
                    }else return false;   
                }                  
            }catch (FileNotFoundException ex) {
            System.out.println("El archivo no puede ser abierto/leido"+" " +ex.getMessage());
        }
    return true;                            
    }

    private static boolean buscarEnHeladera(String ingReceta){
        try{	
        String archivo = "heladera.txt";
                File f = new File(archivo);
        Scanner sc = new Scanner(f);
                                        
                while (sc.hasNextLine()){                  
                    String estanteHeladera = sc.nextLine();
                    
                        if ((ingReceta).equals (estanteHeladera)) { 
                        return true;}
                                    }
            }catch (FileNotFoundException ex) {
            System.out.println("El archivo no puede ser abierto/leido"+" " +ex.getMessage());
            }
    return false; 
    }  
}
*/
