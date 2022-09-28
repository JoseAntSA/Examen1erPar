package CobrarConQR;

import java.util.*;

/**
 * 
 */
public class CodigoCobro {

    /**
     * Default constructor
     */
    public CodigoCobro() {
    }

    /**
     * 
     */
    private String idQRCobro;

    /**
     * 
     */
    private Cuenta cuenta;

    /**
     * 
     */
    private CodigoQR codigo;

    /**
     * @param idQRCobro 
     * @param cuenta 
     * @param codigo
     */
    public void setQRCobro(String idQRCobro, Cuenta cuenta, CodigoQR codigo) {
        this.idQRCobro = idQRCobro;
        this.cuenta = cuenta;
        this.codigo = codigo;
    }

    /**
     * @return
     */
    public String getQRCobro() {
        return idQRCobro;
    }
    
    /**
     * @return
     */
    public Cuenta getCuenta() {
        return cuenta;
    }
    
    /**
     * @return
     */
    public CodigoQR getCodigo() {
        return codigo;
    }

    /**
     * @param idQRCobro 
     * @param cuenta 
     * @param codigo 
     * @return
     */
    public CodigoCobro crearQRCobro(String idQRCobro, Cuenta cuenta, CodigoQR codigo) {
        this.setQRCobro(idQRCobro, cuenta, codigo);
        
        return this;
    }
}