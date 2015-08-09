/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.financasWeb.modelo.persistence.generica;

import java.util.List;

/**
 *
 * @author adilson
 */
public interface InterfaceGenerica<T> {
  
      public void salvar(T entidade);
      public void deletar(T entidade);
      public void atualizar(T entidade);
      public T pesquisarId(Integer codigo);
      public List<T> listar();
      
      
}
