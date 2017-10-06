/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validaciones;

import Entities.Cuenta;
import java.rmi.RemoteException;

/**
 *
 * @author Mari
 */
public interface IniciarSesionInterface {
  public String validarCuenta(Cuenta cuentaAValidar) throws RemoteException;  
  public String validarUsuario() throws RemoteException;
  public String validarClave() throws RemoteException; 
}
