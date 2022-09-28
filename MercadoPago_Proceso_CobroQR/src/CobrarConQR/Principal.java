/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobrarConQR;

/**
 *
 * @author anton
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.setIdCuenta("1");
        cuenta.setNombre("Jose Antonio Sanchez Alanis");
        cuenta.setEmail("antoniosanchezalanis@gmail.com");
        
        CodigoQR codigo = new CodigoQR();
        codigo.setIdCodigo("1");
        codigo.setCodigo("joseanto321345QR1");
        codigo.setMonto(150.5f);
        
        CodigoCobro qr = new CodigoCobro();
        qr.crearQRCobro("1", cuenta, codigo);
        System.out.println("ID_QR_COBRO: " + qr.getQRCobro());
        System.out.println("Nombre:      " + qr.getCuenta().getNombre());
        System.out.println("Email:       " + qr.getCuenta().getEmail());
        System.out.println("Codigo:      " + qr.getCodigo().getCodigo());
        System.out.println("Monto:       " + qr.getCodigo().getMonto());
        
        
        
        
    }
    
}
