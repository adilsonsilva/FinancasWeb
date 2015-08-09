/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.financasWeb.modelo.persistence.generica;

import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author adilson
 */
public class PersistenceGenerica<T> implements InterfaceGenerica<T>{
      
      private Session session;
      private Class<T> classe;

      public PersistenceGenerica(Session session, Class classe) {
            this.session = session;
            this.classe = classe;
      }

      public PersistenceGenerica(Class classe) {
            this.classe = classe;
      }
      
      @Override
      public void salvar(T entidade) {
            this.session.save(entidade);
      }

      @Override
      public void deletar(T entidade) {
            this.session.delete(entidade);
      }

      @Override
      public void atualizar(T entidade) {
            this.session.update(entidade);
      }

      @Override
      public T pesquisarId(Integer codigo) {
            T entidade = (T) session.get(classe, codigo);
            return entidade;
      }

      @Override
      public List<T> listar() {
            return this.session.createCriteria(classe).list();
      }

      public void setSession(Session session) {
            this.session = session;
      }
      
}
