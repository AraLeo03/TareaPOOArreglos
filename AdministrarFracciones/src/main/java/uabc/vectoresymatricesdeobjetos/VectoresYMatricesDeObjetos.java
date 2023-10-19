/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uabc.vectoresymatricesdeobjetos;

/**
 *
 * @author Leonel Araujo
 */
public class VectoresYMatricesDeObjetos {

    public static void main(String[] args) {
        
        NumerosRacionales[][] matriz = new NumerosRacionales[3][3];
        
    ManipulacionFracciones.llenarMatrizFraciones(matriz);
        System.out.println(ManipulacionFracciones.mostrarMatrizFracciones(matriz));
    
        System.out.println(ManipulacionFracciones.mostrarMayoresAUno(ManipulacionFracciones.numerosMayoresAUno(matriz)));
    
        System.out.println(ManipulacionFracciones.vectorDenominadores(55,matriz));
    
    }
}
