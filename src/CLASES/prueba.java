/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author raulc
 */
public class prueba {
    public static void main(String[] args) {
        controladorVehiculos cv = new controladorVehiculos();
        cv.ActualizarVehiculos();
        for (int i=0;i<cv.getVehiculos().size();i++) {
      
            System.out.println(cv.getVehiculos().get(i).getModelo());
        }
        
    }
}
