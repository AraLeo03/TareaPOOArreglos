/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.vectoresymatricesdeobjetos;

import java.util.Random;

/**
 *
 * @author Leonel Araujo
 */
public class ManipulacionFracciones {

    public static void llenarMatrizFraciones(NumerosRacionales[][] matrizFracciones) {
        Random rmd = new Random();

        for (int i = 0; i < matrizFracciones.length; i++) {
            for (int j = 0; j < matrizFracciones[i].length; j++) {
                matrizFracciones[i][j] = new NumerosRacionales(rmd.nextInt(100) + 1, rmd.nextInt(100) + 1);
            }
        }
    }

    public static  String mostrarMatrizFracciones(NumerosRacionales[][] matrizFracciones) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < matrizFracciones.length; i++) {
            for (int j = 0; j < matrizFracciones[i].length; j++) {
                sb.append(matrizFracciones[i][j] + "\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    
    public static NumerosRacionales[] numerosMayoresAUno(NumerosRacionales[][] matrizFracciones){
        int tamañoVector=tamañoVector(matrizFracciones);
        
        NumerosRacionales[] mayoresAUno = new NumerosRacionales[tamañoVector];
        
        int contador=0;
        for (int i = 0; i < matrizFracciones.length; i++) {
            for (int j = 0; j < matrizFracciones[i].length; j++) {
                if (matrizFracciones[i][j].getNumerador()/matrizFracciones[i][j].getDenominador()>=1) {
                    mayoresAUno[contador]=matrizFracciones[i][j];
                    contador++;
                }
            }
        }
        return mayoresAUno;
    }
    
    public static int tamañoVector(NumerosRacionales[][] matrizFracciones){
        int tamañoVector = 0;
        for (int i = 0; i < matrizFracciones.length; i++) {
            tamañoVector=tamañoVector+matrizFracciones[i].length;
        }
        return tamañoVector;
    }
    
    public static String mostrarMayoresAUno(NumerosRacionales[] mayoresAUno){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mayoresAUno.length; i++) {
            if (mayoresAUno[i]!=null) {
                 sb.append(mayoresAUno[i] + "\t");
            }
               
        }
        return sb.toString();
    }
    
    public static String vectorDenominadores(int denominador, NumerosRacionales[][] matrizFracciones){
       int tamañoVector=tamañoVector(matrizFracciones);
        
        NumerosRacionales[] vectorDenominador = new NumerosRacionales[tamañoVector];
        
        int contador=0;
        for (int i = 0; i < matrizFracciones.length; i++) {
            for (int j = 0; j < matrizFracciones[i].length; j++) {
                if (matrizFracciones[i][j].getDenominador()==denominador) {
                    vectorDenominador[contador]=matrizFracciones[i][j];
                    contador++;
                }
            }
        }
        return mostrarMayoresAUno(vectorDenominador);
    }
}
