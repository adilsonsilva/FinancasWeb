/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.financasWeb.util;

import br.com.financasWeb.modelo.persistence.categoria.CategoriaDAO;
import br.com.financasWeb.modelo.persistence.categoria.CategoriaDAOPersistence;
import br.com.financasWeb.modelo.persistence.generica.InterfaceGenerica;
import br.com.financasWeb.modelo.persistence.generica.PersistenceGenerica;
import br.com.financasWeb.modelo.persistence.lancamento.LancamentoDAO;
import br.com.financasWeb.modelo.persistence.lancamento.LancamentoDAOPersistence;
import br.com.financasWeb.modelo.persistence.usuario.UsuarioDAO;
import br.com.financasWeb.modelo.persistence.usuario.UsuarioDAOPersistence;

/**
 *
 * @author adilson
 */
public class DAOFactory {

      public static InterfaceGenerica<Class> criarDAO(Class classe) {
            PersistenceGenerica persistenceDAO = new PersistenceGenerica(classe);
            persistenceDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
            return persistenceDAO;
      }

      public static LancamentoDAO criarLancamentoDAO() {
            LancamentoDAOPersistence lancamentoDAO = new LancamentoDAOPersistence();
            lancamentoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
            return lancamentoDAO;
      }

      public static UsuarioDAO criarUsuarioDAO() {
            UsuarioDAOPersistence usuarioDAO = new UsuarioDAOPersistence();
            usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
            return usuarioDAO;
      }

      public static CategoriaDAO criarCategoriaDAO() {
            CategoriaDAOPersistence categoriaDAO = new CategoriaDAOPersistence();
            categoriaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
            return categoriaDAO;
      }
}
