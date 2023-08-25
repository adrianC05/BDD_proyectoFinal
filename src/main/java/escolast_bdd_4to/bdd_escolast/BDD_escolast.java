/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package escolast_bdd_4to.bdd_escolast;

import interfaz.interfaz;
import interfaz.menu;

/**
 *
 * @author Adrian Carrion
 */
public class BDD_escolast {

    public static void main(String[] args) {
        Cconexion objetoConexion = new Cconexion();
        objetoConexion.estblecerConexion();
        /*
        interfaz inter = new interfaz();
        inter.setVisible(true);
        */
        
        menu m = new menu();
        m.setVisible(true);
    }
}
