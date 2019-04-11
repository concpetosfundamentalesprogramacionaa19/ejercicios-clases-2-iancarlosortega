/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class MiEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        String pais;
        int nota1;
        int nota2;
        double promedio;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor inIgrese sus nombres");
        nombre = entrada.nextLine();
      
        System.out.println("Por favor ingrese sus apellidos");
        apellido = entrada.nextLine();
        
        System.out.println("Por favor ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Por favor ingrese su ciudad");
        ciudad = entrada.nextLine();
        
        System.out.println("Por favor ingrese su pais");
        pais = entrada.nextLine();
        
        System.out.println("Ingrese su nota 1");
        nota1 = entrada.nextInt();
        
        System.out.println("Ingrese su nota 2");
        nota2 = entrada.nextInt();
        
        promedio = (nota1+nota2)/2;
        
        System.out.printf("Sus nombres y apellidos: %s %s \nEdad: %s"
                + "\nCiudad: %s \nPais: %s \nNotas: %s %s \nPromedio: %s" ,
                nombre , apellido , edad , ciudad , pais , nota1 , nota2 ,
                promedio);
          
    }
    
}
