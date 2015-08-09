/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.financasWeb.modelo.persistence.lancamento;

import br.com.financasWeb.modelo.entidade.Lancamento;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author adilson
 */
public class LancamentoDAOPersistence implements LancamentoDAO {

      private Session session;

      public void setSession(Session session) {
            this.session = session;
      }

      @Override
      public List<Lancamento> getLancamentos(int idUsuario) {
            String hql = "select l from Lancamento l "
                    + "inner join l.usuario u "
                    + "where u.idUsuario =:id";
            Query query = this.session.createQuery(hql);
            query.setParameter("id", idUsuario);
            return query.list();
      }
}
