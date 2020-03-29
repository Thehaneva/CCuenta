/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ccuenta;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CCuenta cuentaUno;
        double saldoActual;
        
        cuentaUno = new CCuenta("Juan López","1000-2365-85-123456789",2500,0);
        operacionesCuenta(cuentaUno, 11); 
        saldoActual = cuentaUno.estado();
        System.out.println("El saldo actual es"+ saldoActual );
    }

    /**
     *
     * @param cuentaUno the value of cuentaUno
     * @param cantidad the value of cantidad
     */
    public static void operacionesCuenta(CCuenta cuentaUno, float cantidad) {
        try
        {
            cuentaUno.retirar(2300);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
        
        try
        {
            System.out.println("Ingreso en cuenta");
            cuentaUno.ingresar(695);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
    }

}
