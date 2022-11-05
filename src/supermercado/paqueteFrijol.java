
package supermercado;


public class paqueteFrijol implements producto{                // creamos la clase paquetearroz en el cual implementa la interface producto
    
    private String nombre;                                     // creamos un atributo nombre
    private int posicionpasillo,posicionestante;                // creamos dos atributos de tipo entero en el cual nos dara informacion de la posicion en la que este el frijol
    
    
    
    public paqueteFrijol(){}                                    // se creaun constructor vacio

    @Override
    public void setNombre(String n) {                           //Se sobre escribe el metodo de dar nombre el cual resive un String el cual le asignara un valor al atributo nombre
        this.nombre=n;
    }

    @Override
    public String getNombre() {                               //Sobre escribimos el metodo obtener nombre lo que ara es devolvernos el nommbre   
       return nombre;
    }

    @Override
    public void mover(int pasillo, int estante) {            // Sobre escribimos el metodo mover el cual resive los parametros entero pasillo y entero estante y a la ves se le asiganan sus posiciones
    
        this.posicionestante=estante;
        this.posicionpasillo=pasillo;
    }

    @Override
    public void getPosicion() {                              // Se sobre escribe el metodo obtener posicion el cual presentara por consola la posicion de el pasillo y en el estante en la que esta el frijol
        System.out.println("paquete de frijol en el estante = "+this.posicionestante);
        System.out.println("paquete de frijol en el pasillo = "+this.posicionpasillo);
    }

    @Override
    public producto clonar() {                                         // Y se sobre escribe el metodo clonar el cual nos devuelve un obj de tipo producto es desir todas las clases que implementen la interface producto podran ser devueltas con el metodo clonar la cual es encargada de crear una copia exacta del obgeto ya creado
     
        producto productos = new paqueteFrijol();                      // crea un producto de tipo paqueteFrijol
        productos.setNombre(this.nombre);                              //le asigna el nombre que ya tiene el obj creado
        productos.mover(this.posicionestante,this.posicionpasillo);    //Y le da la posiciones del obj original
        
        return productos;                                              // Luego devuelve el producto
        
        
    }
    
}
