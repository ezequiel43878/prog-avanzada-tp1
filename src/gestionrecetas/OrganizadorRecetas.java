/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author George
 */

public class OrganizadorRecetas {
    
     public static void buscarEnHeladera(){
                                  
        String[][] matrizReceta = new String[10][2];
        String[][] matrizHeladera = new String[10][2];
        
        matrizReceta = ServicioRecetas.receta();
        matrizHeladera = ServicioRecetas.heladera();
       
         
        for (int i=0;i<10/*matrizReceta[i].length*/;i++)
              
            for(int x=0;x<10/*matrizHeladera[x].length*/;x++)
                
                if ((matrizReceta[i][1]).equals (matrizHeladera[x][1])) 
                    
                    if ((Float.valueOf(matrizHeladera[x][0])) >= (Float.valueOf(matrizReceta[i][0])))
                      
                      System.out.println("Existe "+matrizReceta[i][1]+" y alcanza para hacer la receta!");
                    
                    else System.out.println("NO existe "+matrizReceta[i][1]+" o NO alcanza para hacer la receta!");
        
    }            
            
   
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
     
    public static void main(String[] args) throws IOException {
        
        
}

}
