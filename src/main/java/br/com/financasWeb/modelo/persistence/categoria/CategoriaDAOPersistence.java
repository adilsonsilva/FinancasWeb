/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.financasWeb.modelo.persistence.categoria;

import br.com.financasWeb.modelo.entidade.Categoria;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Query;
/**
 *
 * @author adilson
 */
public class CategoriaDAOPersistence implements CategoriaDAO{
      
      private Session session;

      public void setSession(Session session) {
            this.session = session;
      }
      
      @Override
      public List<Categoria> listarAtivos(){
            String hql = "select c from Categoria c where c.ativo = true";
            Query query = this.session.createQuery(hql);
            return query.list();
      }
}
