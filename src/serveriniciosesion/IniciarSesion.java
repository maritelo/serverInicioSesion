/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveriniciosesion;

import validaciones.IniciarSesionInterface;
import Entities.Cuenta;
import java.rmi.RemoteException;

/**
 *
 * @author Mari
 */
public class IniciarSesion implements IniciarSesionInterface {
  private Cuenta cuenta;

  @Override
  public String validarCuenta(Cuenta cuentaAValidar) throws RemoteException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String validarUsuario() throws RemoteException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public String validarClave() throws RemoteException {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  

}
