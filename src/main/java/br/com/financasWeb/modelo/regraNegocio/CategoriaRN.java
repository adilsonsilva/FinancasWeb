/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.financasWeb.modelo.regraNegocio;

import br.com.financasWeb.modelo.entidade.Categoria;
import br.com.financasWeb.modelo.persistence.categoria.CategoriaDAO;
import br.com.financasWeb.modelo.persistence.generica.InterfaceGenerica;
import br.com.financasWeb.util.DAOFactory;
import java.util.List;
/**
 *
 * @author adilson
 */
public class CategoriaRN {
      
      private InterfaceGenerica dao;
      private CategoriaDAO daoCategoria;
      
      public CategoriaRN(){
            this.dao = DAOFactory.criarDAO(Categoria.class);
            this.daoCategoria = DAOFactory.criarCategoriaDAO();
      }
      
      public void salvar(Categoria categoria){
            if(categoria.getIdCategoria() == null || categoria.getIdCategoria() == 0){
                  categoria.setAtivo(true);
                  this.dao.salvar(categoria);
            }else{
                  this.dao.atualizar(categoria);
            }
      }
      
      public void deletar(Categoria categoria){
            this.dao.deletar(categoria);
      }
      
      public List<Categoria> listar(){
            return this.dao.listar();
      }
      
      public List<Categoria> listarAtivos(){
            return this.daoCategoria.listarAtivos();
      }
}
