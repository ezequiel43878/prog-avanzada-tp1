import javax.print.attribute.standard.PrinterIsAcceptingJobs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author George
 */
public class ServicioRecetas{
 
    
    public static String[][] receta(){
        
        String[][] matrizReceta = new String[10][2];
        try{	
                String archivo = "receta.txt";
		File f = new File(archivo);
                Scanner sc = new Scanner(f);           
                
                for (int i=0;i<matrizReceta.length;i++){
                    
                    if (sc.hasNextLine()){ 
                    
                        String linea = sc.nextLine();
                        String[] parte = linea.split(";");
                    
                            for (int j=0;j<matrizReceta[i].length;j++){
                               
                                if (j==0)
                                    matrizReceta[i][j] = parte[0];
                                else
                                    matrizReceta[i][j] = parte[1];
                            }
                    }
                }
                /*
                for (int i=0;i<matrix.length;++i)
                    for (int j=0;j<matrix[i].length && (matrix[i][j] != null);++j)
                        System.out.println("Posicion ["+i+"]["+j+"] "+matrix[i][j]); 
                */
                                    
            }catch (FileNotFoundException ex) {
			System.out.println("El archivo no puede ser abierto/leido"+" " +ex.getMessage());
                                               }
        
       return matrizReceta; 
       }
        
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static String[][] heladera(){
        
        String[][] matrizHeladera = new String[10][2];
      try{	
                
		String archivo = "heladera.txt";
		File f = new File(archivo);
                Scanner sc = new Scanner(f);           
                
                for (int i=0;i<matrizHeladera.length && (sc.hasNextLine());i++){
                    
                    if (sc.hasNextLine()){ 
                    
                        String linea = sc.nextLine();
                        String[] parte = linea.split(";");
                    
                            for (int j=0;j<matrizHeladera[i].length;j++){
                               
                                if (j==0)
                                    matrizHeladera[i][j] = parte[0];
                                else
                                    matrizHeladera[i][j] = parte[1];
                             
                            }
                    }
                }
                /*
                for (int i=0;i<matrix.length;++i)
                    for (int j=0;j<matrix[i].length && (matrix[i][j] != null);++j)
                        System.out.println("Posicion ["+i+"]["+j+"] "+matrix[i][j]);
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
