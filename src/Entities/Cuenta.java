/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mari
 */
@Entity
@Table(name = "cuenta")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "Cuenta.findAll", query = "SELECT c FROM Cuenta c"),
  @NamedQuery(name = "Cuenta.findByUsuario", query = "SELECT c FROM Cuenta c WHERE c.usuario = :usuario"),
  @NamedQuery(name = "Cuenta.findByClave", query = "SELECT c FROM Cuenta c WHERE c.clave = :clave")})
public class Cuenta implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "usuario")
  private String usuario;
  @Basic(optional = false)
  @Column(name = "clave")
  private String clave;

  public Cuenta() {
  }

  public Cuenta(String usuario) {
    this.usuario = usuario;
  }

  public Cuenta(String usuario, String clave) {
    this.usuario = usuario;
    this.clave = clave;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (usuario != null ? usuario.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof Cuenta)) {
      return false;
    }
    Cuenta other = (Cuenta) object;
    if ((this.usuario == null && other.usuario != null) || (this.usuario != null && !this.usuario.equals(other.usuario))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "serveriniciosesion.Cuenta[ usuario=" + usuario + " ]";
  }
  
}
