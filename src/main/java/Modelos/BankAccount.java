
package Modelos;

/**
 *Representa una cuenta de banco con su respectivo número de cuenta y si la 
 * cuenta está activada o no.
 * @author Diego Posada Martinez 
 * 
 */
public class BankAccount {
    /**
    *Representa un número de cuenta 
    */
    private int accountNumber; 
    /**
    * Indica si la cuenta se encuentra activa o no
    */
    protected boolean activated; 

    
    /**
    *Constructor por defecto. Crea una instancia de la clase BankAccount la cual
    * no recibe parámetros
    */
    public BankAccount() {
    }

    /**
     * Constructor de la clase BankAccount. Crea una instancia de la clase 
     * BankAccount.
     * @param accountNumber, numero de la cuenta
     * @param activated, valor booleano de la cuenta (si está activada o no)
    */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    /**
     * Guetter del atributo accountNumber. Nos permite obtener el atributo 
     * @return accountNumber
     * 
    */
    public int getAccountNumber() {
        return accountNumber;
    }
    

    /**
     * Setter del atributo accountNumber.Nos permite modificar el atributo
     * @param accountNumber
    */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Guetter del atributo isActivated. Nos permite obtener el atributo 
     * @return activated
     * 
    */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Setter del atributo activated. Nos permite modificar el atributo 
     * @param activated
     * 
    */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
    
    
}
