/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveriniciosesion;

import validaciones.IniciarSesionInterface;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Mari
 */
public class ServerInicioSesion {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
       try {
      IniciarSesion is = new IniciarSesion();
      IniciarSesionInterface stub = (IniciarSesionInterface) UnicastRemoteObject.exportObject(is, 0);
      Registry registry = LocateRegistry.getRegistry();
      registry.bind("Inicio sesión", stub);
      System.out.println("Servidor listo");
    } catch (Exception e) {
      System.out.println("Exception: " + e.getMessage());
    }
   }
   

}
