
package Modelos;

/**
 * Representa un carro con su respectivo motor, ruedas, color y peso
 * @author Diego Posada Martinez
 */
public class Car { 
    /**
    * Representa el motor de un carro
    */
    private String motor; 
    /**
    *Representa el número de ruedas que tiene un carro
    */
    protected int wheels; 
    /**
    *Representa el color del carro
    */
    public String color; 
    /**
    * Representa el peso del carro 
    */
    public int weight;

    
    /**
    *Constructor por defecto. Crea una instancia de la clase Car la cual
    * no recibe parámetros
    */
    public Car() {
    }

    /**
    *Constructor de la clase Car. Crea una instancia de la clase Car. 
    * @param motor, valor en string para el motor del carro. 
    * @param wheels, valor entero del número de ruedas del carro.
    * @param color, valor en string del color del carro.
    * @param weight, valor entero del peso del auto.
    */
    public Car(String motor, int wheels, String color, int weight) {
        this.motor = motor;
        this.wheels = wheels;
        this.color = color;
        this.weight = weight;
    }

    
    /**
     * Guetter del atributo motor. Nos permite obtener el atributo 
     * @return motor
     * 
    */
    public String getMotor() {
        return motor;
    }

    
    /**
     * Setter del atributo motor.Nos permite modificar el atributo 
     
     * @param motor
    */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /*
    * Guetters y setters adicionales de los demás atributos de la clase Car
    **/
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    
    
    
}
