/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author George    ---->>>   ((( ACA COMPARAMOS LA RECETA CON LA HELADERA )))
 */

public class OrganizadorRecetas {
    
     public static boolean buscarEnHeladera(){
                                  
        int entro=0;
        int i;
        int cant=0;
        
        String[][] matrizReceta = new String[10][2];
        String[][] matrizHeladera = new String[10][2];
        
        matrizReceta = ServicioRecetas.receta();
        matrizHeladera = ServicioRecetas.heladera();
        
        
         /* Para recorrer las matrices de Receta y Heladera que se trajeron de la clase ServicioRecetas.
        
         for (int a=0;a<matrizReceta.length;a++)
            for (int b=0;(b<matrizReceta[a].length) && (matrizReceta[a][b] != null);b++)
                System.out.println(matrizReceta[a][b]);
        
         for (int a=0;a<matrizHeladera.length;a++)
            for (int b=0;b<(matrizHeladera[a].length) && (matrizHeladera[a][b] != null);b++)
                System.out.println(matrizHeladera[a][b]);
        */
        
        for (i=0;i<(matrizReceta.length);i++){
              
            for(int x=0;x<(matrizHeladera.length);x++)
                
                if ((matrizReceta[i][1] != null) && ((matrizReceta[i][1]).equals (matrizHeladera[x][1])) && ((Float.valueOf(matrizHeladera[x][0])) >= (Float.valueOf(matrizReceta[i][0])))){
                    
                    entro=entro+1;
                                  
                    } 
                }
   
    for (i=0;i<(matrizReceta.length);i++)
        if(matrizReceta[i][1] != null)
            cant=cant+1;
   
    if (entro == cant) 
        return true;
        else 
        return false;
      
}
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
     
public static void main(String[] args) throws IOException {
        
    }

}
