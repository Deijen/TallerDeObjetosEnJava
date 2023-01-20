
package Modelos;

/**
 * Representa un sable de luz con sus respectivos atributos, siendo estos 
 * dueño del sable de luz, color, modelo y si el dueño es un Jedi o un Sith
 * @author Diego Posada Martinez
 */
public class Lightsaber {
    /**
    * Representa el nombre del dueño del sable de luz
    */
    public String owner; 
    /**
    * Representa el color que tendrá el sable de luz 
    */
    public String color; 
    /**
    Representa el modelo del sable de luz
    */
    protected String model; 
    /**
    *Indica si el dueño del sable de luz es un Jedi o un Sith
    */
    private boolean itsJediOrSith; 

    
    /**
    * Constructor por defecto. Crea una instancia de la clase Ligthsaber. No 
    * recibe parámetros
    */
    public Lightsaber() {
    } 

    /**
    * Constructor de la clase LigthSaber. Crea una instancia de la clase 
    * LightSaber
    * @param owner, dueño del sable de luz
    * @param color, color del sable de luz
    * @param model, modelo del sable de luz
    * @param itsJediOrSith, valor booleano que permite saber si el dueño del 
    * sable de luz es un Jedi o un Sith
    */
    public Lightsaber(String owner, String color, String model, boolean itsJediOrSith) {
        this.owner = owner;
        this.color = color;
        this.model = model;
        this.itsJediOrSith = itsJediOrSith;
    }
    
    
    /**
     * Guetter del atributo owner. Nos permite obtener el atributo 
     * @return owner
     * 
    */
    public String getOwner() {
        return owner;
    }

    /**
     * Setter del atributo owner. Nos permite modificar el atributo 
     * @param owner 
     * 
    */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /*
    * Guetters y setters adicionales de los demás atributos de la clase 
    Lightsaber
    **/
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isItsJediOrSith() {
        return itsJediOrSith;
    }

    public void setItsJediOrSith(boolean itsJediOrSith) {
        this.itsJediOrSith = itsJediOrSith;
    }
    
    
}
