
package Modelos;

/**
 * Clase que representa una consola de videojuegos con sus respectivos 
 * atributos, siendo estos un software, las partes de la consola, el color, el 
 * número de juegos en memoria y la memoria de la consola (o capacidad de 
 * almacenamiento)
 * @author Diego Posada Martinez
 */
public class VideoGameConsole { 
    /**
    * Representa el software de una consola 
    */
    protected String software;
    /**
    * Representa el número de partes que tiene una consola
    */
    private int parts; 
    /**
    * Representa el color de la consola
    */
    public String color; 
    /**
    * Representa el número de juegos que tiene la consola
    */
    public int numberOfGames; 
    /**
    * Representa la memoria de la consola
    */
    private int memory; 

    
    /**
    * Constructor por defecto. Permite crear una instancia de la clase 
    * VideoGameConsole. No recibe parámetros
    */
    public VideoGameConsole() {
    }

    /**
    *Constructor de la clase VideoGameConsole. Permite crear una instancia de la
    * clase persona. 
    * @param software, software de la consola 
    * @param parts, partes de la consola
    * @param color, color de la consola
    * @param numberOfGames, número de juegos de la consola 
    * @param memory, memoria de la consola
    */
    public VideoGameConsole(String software, int parts, String color, int numberOfGames, int memory) {
        this.software = software;
        this.parts = parts;
        this.color = color;
        this.numberOfGames = numberOfGames;
        this.memory = memory;
    }

    /**
    * Guetter del atributo software.Permite obtener el atributo 
    * @return software
    */
    public String getSoftware() {
        return software;
    }

    /**
    * Setter del atributo software.Permite modificar el atributo
    * @param software
    */
    public void setSoftware(String software) {
        this.software = software;
    }

    /*
    * Guetters y setters adicionales de los demás atributos de la clase 
    * VideoGameConsole
    **/
    public int getParts() {
        return parts;
    }

    public void setParts(int parts) {
        this.parts = parts;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
    
    
    
    
    
    
}
