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
    
        if(OrganizadorRecetas.buscarEnHeladera())
            System.out.println("Se encuentra todos los ingredientes y alcanzan para hacer la receta!");
                    else System.out.println("NO se encontraron todos los ingredientes o no alcanzan para hacer la receta!");
    }
}

