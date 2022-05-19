import java.util.List;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author George
 */
public class Receta {
    private String nombre;
    List<String> ingredientes;

    public Receta(String nombre, List<String> ingredientes){
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String GetInfo(){
        return this.nombre;
    }
}
