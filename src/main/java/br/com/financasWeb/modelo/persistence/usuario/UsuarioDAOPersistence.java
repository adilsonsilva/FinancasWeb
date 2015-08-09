/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.financasWeb.modelo.persistence.usuario;

import br.com.financasWeb.modelo.entidade.Usuario;
import org.hibernate.Session;
import org.hibernate.Query;
/**
 *
 * @author adilson
 */
public class UsuarioDAOPersistence implements UsuarioDAO{
      
      private Session session;
      
      public void setSession(Session session){
            this.session = session;
      }
      
      public Usuario carregaUsuario(String email){
            String hql = "select u from Usuario u where u.email =:email";
            Query query = this.session.createQuery("email");
            query.setParameter("email", email);
            return (Usuario) query.uniqueResult(); 
      }
      
}
