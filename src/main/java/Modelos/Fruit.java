
package Modelos;

import java.util.ArrayList;

/**
 *Representa una fruta con sus respectivos colores, nombre y peso
 * @author Diego Posada Martinez
 */
public class Fruit { 
    /**
    * Representa el nobmre de la fruta 
    */
    public String name; 
    /**
    *Representa el peso promedio de la fruta
    */
    private float averageWeigth;
    /**
    *Debido a que una fruta puede tener diversos colores, el atributo colors 
    * usa la clase ArrayList( importada del paquete util) para almacenar los 
    * diversos colores que pueda tener una fruta
    */
    public ArrayList<String> colors; 

    
    /**
    *Constructor por defecto. Crea una instancia de la clase Fruit la cual no 
    * recibe parámetros
    */
    public Fruit() {
    } 

    
    /**
     * Constructor de la clase Fruit. Crea una instancia de la clase Fruit
     * 
     * @param name, nombre de la fruta
     * @param averageWeigth, peso de la fruta
     * @param colors, colores de la fruta 
    */
    public Fruit(String name, float averageWeigth, ArrayList<String> colors) {
        this.name = name;
        this.averageWeigth = averageWeigth;
        this.colors = colors;
    }
    
    
    /**
     * Guetter del atributo Name .Nos permite obtener el atributo
     * @return name
    */
    public String getName() {
        return name;
    }

    /**
     * Setter del atributo Name .Nos permite modificar el atributo
     * @param name
    */
    public void setName(String name) {
        this.name = name;
    }

    /*
    * Guetters y setters adicionales de los demás atributos de la clase Fruit
    **/
    public float getAverageWeigth() {
        return averageWeigth;
    }

    public void setAverageWeigth(float averageWeigth) {
        this.averageWeigth = averageWeigth;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
    
    
}
