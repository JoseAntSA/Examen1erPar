package CobrarConQR;

import java.util.*;

/**
 * 
 */
public class CodigoQR {

    /**
     * Default constructor
     */
    public CodigoQR() {
    }

    /**
     * 
     */
    private String idCodigo;

    /**
     * 
     */
    private String codigo;

    /**
     * 
     */
    private float monto;


    /**
     * @param idCodigo
     */
    public void setIdCodigo(String idCodigo) {
        this.idCodigo = idCodigo;
    }

    /**
     * @return
     */
    public String getIdCodigo() {
        return idCodigo;
    }

    /**
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param monto
     */
    public void setMonto(float monto) {
        this.monto = monto;
    }

    /**
     * @return
     */
    public float getMonto() {
        // TODO implement here
        return monto;
    }

}