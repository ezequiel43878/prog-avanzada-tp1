
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 *       ((( ACA ABRIMOS LOS ARCHIVOS Y LOS PASAMOS A LAS MATRICES )))
 * 
 */
public class ServicioRecetas{
 
    
    public static String[][] receta(String receta){
        
        String[][] matrizReceta = new String[10][2];
        
        try{	
        
		File f = new File(receta);
                Scanner sc = new Scanner(f);           
                
                for (int i=0;i<matrizReceta.length;i++){
                    
                    if (sc.hasNextLine()){ 
                    
                        String linea = sc.nextLine();
                        String[] parte = linea.split(";");
                    
                        matrizReceta[i][0] = parte[0]; 
                        matrizReceta[i][1] = parte[1];
                        
                            }
                    }
                
                /* Para recorrer la matriz de Receta y ver si se almaceno bien los valores.
                for (int i=0;i<matrizReceta.length;++i)
                    for (int j=0;j<matrizReceta[i].length;++j)
                        System.out.println("Posicion receta ["+i+"]["+j+"] "+matrizReceta[i][j]); 
                */
                                    
            }catch (FileNotFoundException ex) {
			System.out.println("El archivo no puede ser abierto/leido"+" " +ex.getMessage());
                                               }
        
       return matrizReceta; 
       }
        
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static String[][] heladera(String heladera){
        
        String[][] matrizHeladera = new String[10][2];
        
      try{	
             
		File f = new File(heladera);
                Scanner sc = new Scanner(f);           
                
                for (int i=0;i<matrizHeladera.length /*&& (sc.hasNextLine())*/;i++){
                    
                    if (sc.hasNextLine()){ 
                    
                        String linea = sc.nextLine();
                        String[] parte = linea.split(";");
                    
                        matrizHeladera[i][0] = parte[0];
                        matrizHeladera[i][1] = parte[1];
     
                            }
                    }
                
                /* Para recorrer la matriz de la Heladera y ver si se almaceno bien los valores.
                for (int i=0;i<matrizHeladera.length;++i)
                    for (int j=0;j<matrizHeladera[i].length;++j)
                        System.out.println("Posicion heladera ["+i+"]["+j+"] "+matrizHeladera[i][j]); 
                */
                                  
            }catch (FileNotFoundException ex) {
			System.out.println("El archivo no puede ser abierto/leido"+" " +ex.getMessage());
                                               }   
    
    return matrizHeladera; 
    }  

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static void main(String[] args) throws FileNotFoundException{
            
      
        }
}      
