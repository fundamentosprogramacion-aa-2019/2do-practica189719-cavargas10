/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodeconstructores;

/**
 *
 * @author cavargas10
 */
public class Principal {
    
    public static void main(String[] args) {
    
        Entrenador entrenador1 = new Entrenador("Rene", 35, "Tenis");
        Entrenador entrenador2 = new Entrenador();
        
        // entrenador1.establecerNombre("Carlos");
        // entrenador1.establecerEdad(35);
        
        System.out.printf("Nombre %s - Edad %d\n", entrenador1.obtenerNombre(), 
                entrenador1.obtenerEdad());
        
        System.out.printf("Nombre %s - Edad %d\n", entrenador2.obtenerNombre(), 
                entrenador2.obtenerEdad());
        
        // proceso de cambio de valores
        entrenador1.establecerNombre("Rolando");
        
        System.out.printf("Entrenador 1: Nombre %s - Edad %d \n", 
                entrenador1.obtenerNombre(), entrenador1.obtenerEdad());
    }
}
