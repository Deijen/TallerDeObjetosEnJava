
package Modelos;

import java.util.Date;

/**
 * Clase que representa una persona con sus respectivos atributos. 
 *@author Diego Posada Martinez
 */
public class Person {
    /**
    *@Representa el nombre de la persona 
    */
    public String name;
    /**
    * Representa el primer apellido de la persona 
    */
    public String lastName1;
    /**
    *Representa el segundo apellido de la persona 
    */
    public String lastName2;
    /**
    *Representa el cumpleaños de la persona. Se hace uso de la clase Date 
    * importada del paquete "util"
    */
    public Date dateBirth; 
    /**
    *Representa la altura de la persona
    */
    public float heigth; 

    
    /**
    *Constructor por defecto. Crea una instancia de la clase Persona la cual no 
    * recibe parámetros
    */
    public Person() {
    }


    /**
     * Constructor de la clase Persona. Crea una instancia de la clase Persona.
     * @param name, nombre de la persona
     * @param lastName1, primer apellido de la persona 
     * @param lastName2, segundo apellido de la persona 
     * @param dateBirth, fecha de cumpleaños de la persona 
     * @param heigth, altura de la persona 
    */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float heigth) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.heigth = heigth;
    }

    
    /**
     * Guetter del atributo name. Nos permite obtener el atributo 
     * @return name
     * 
    */
    public String getName() {  
        return name;
    }

    /**
     * Setter del atributo name.Nos permite modificar el atributo 
     * @param name
    */
    public void setName(String name) { 
        this.name = name;
    }

    /*
    * Guetters y setters adicionales de los demás atributos de la clase Persona
    **/
    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getHeigth() {
        return heigth;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }
    
    
    
    
}
