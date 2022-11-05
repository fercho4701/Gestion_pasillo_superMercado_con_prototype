/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 *
 * @author Admin
 */





// se crea la interface producto en el cual todas las clases que implementen esta interface.
//aran uso de cada uno de estos metodos como los es setNombre, getNombre, mover(int pasillo, int estante), getPosicion, clonar
public interface producto {

    public void setNombre(String n);
    public String getNombre();
    public void mover(int pasillo, int estante);
    public void getPosicion();
    public producto clonar();
    
}
