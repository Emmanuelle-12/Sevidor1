/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.rmi.registry.Registry;
import javax.swing.JOptionPane;


public class Servidor {
    public static void main(String[] args) {
     try{
         Registry r = java.rmi.registry.LocateRegistry.createRegistry(5001);
         r.rebind("Calculadora", new rmi());
         JOptionPane.showMessageDialog(null,"Servidor Conectado");
         
         
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"Servidor no conectado" + e);
     }
    }
    
}
