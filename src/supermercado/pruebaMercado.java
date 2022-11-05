/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.Scanner;


public class pruebaMercado {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in); // se llama el metodo scanner para capturar por teclado
        int option,estantes,pasillos;          // se crea 3 variables de tipo entera en cual "option" servira para darle la opcion al usuario dentro de las dos, la otra "estante" servira para guardar la nueva localisacion del estante que desea guardar y lo mismo para con pasillo
       
        
        paqueteArroz Arroz = new paqueteArroz();      // Se crea un nuevo obj de tipo paqueteArroz
        paqueteFrijol Frijol = new paqueteFrijol();   // Se crea un nuevo obj de tipo paqueteFijol
        producto productos;                           //  Se crea un atributo tipo productos
        
        
        Arroz.setNombre("Mi Arroz");                  //al arroz se le da el nombre de Mi Arroz 
        Arroz.mover(9, 14);                           //se mueve a la posiciones por defecto
        
        
        Frijol.setNombre("Mi frijol");               //al Frijol se le da el nombre de Mi Friol
        Frijol.mover(12, 15);                       //se mueve a la posiciones por defecto
        
        
        System.out.println("Estos son los productos originales = ");
        System.out.println("Arroz = "+Arroz.getNombre());                                   //y se mestra por pantalla su respectivos nombre con sus valores
        System.out.println("Frijol = "+Frijol.getNombre());
        System.out.println("Estas son las posiciones originales del arroz y el frijol = ");
        Arroz.getPosicion();
        Frijol.getPosicion();
        
        
        
        
        System.out.println("Digite la accion que desea hacer"); // Se solicita al usuario que coloque por teclado cual de las dos opciones desea comenzar
        System.out.println("1 = Arroz,  2= Frijol");           
        option = leer.nextInt();
        
        if(option==1){                                         //si la opcion es igual a 1 este tomara a Arroz y lo clonara         
            
            productos=Arroz.clonar();
        }else{
            productos=Frijol.clonar();                        //si no tomara a Frijol y lo clonara
        }
        
        
        
        productos.setNombre(productos.getNombre()+"clonado");   // aqui le agregamos la palabra clonado al nombre del obj que se clono
        System.out.println("Digite el nuevo estante = ");       // se le pide al usuario la posicion del nuevo estante y la capturamos
        estantes=leer.nextInt();
        System.out.println("Digite el nuevo pasillo = ");        // se le pide al usuario la posicion del nuevo pasillo y la capturamos 
        pasillos=leer.nextInt();
        
        productos.mover(pasillos, estantes);                    // y la figura clonada se mueve a las nuevas posiciones
        
        
        System.out.println("Este es el producto clonado = ");
        System.out.println(productos.getNombre());
        System.out.println("Esta es la posicion del clon");
        
        productos.getPosicion();
        
        System.out.println("Estos son los productos originales");
        System.out.println("Arroz = "+Arroz.getNombre());                      // y para comparar su cambio volvemos a llamar la informacion del obj original
        System.out.println("Frijol = "+Frijol.getNombre());
        System.out.println("Estas son las posiciones originales = ");
        
        Arroz.getPosicion();
        Frijol.getPosicion();
        
    }
    
}
