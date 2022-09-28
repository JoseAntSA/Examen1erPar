package CobrarConQR;

import java.util.*;

/**
 * 
 */
public class Cuenta {

    /**
     * Default constructor
     */
    public Cuenta() {
    }

    /**
     * 
     */
    private String idCuenta;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String email;


    /**
     * @param idCuenta
     */
    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    /**
     * @return
     */
    public String getIdCuenta() {
        return idCuenta;
    }

    /**
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return
     */
    public String getEmail() {
        return email;
    }

}