/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.financasWeb.modelo.regraNegocio;

import br.com.financasWeb.modelo.entidade.Usuario;
import br.com.financasWeb.modelo.persistence.generica.InterfaceGenerica;
import br.com.financasWeb.modelo.persistence.usuario.UsuarioDAO;
import br.com.financasWeb.util.DAOFactory;
import java.util.List;
/**
 *
 * @author adilson
 */
public class UsuarioRN {

      public UsuarioRN() {
            this.dao = DAOFactory.criarDAO(Usuario.class);
            this.usuarioDAO = DAOFactory.criarUsuarioDAO();
      }

      private InterfaceGenerica dao;
      private UsuarioDAO usuarioDAO;
      
      public void salvar(Usuario usuario) {
            if (usuario.getIdUsuario() == null || usuario.getIdUsuario() == 0) {
                  usuario.setAtivo(true);
                  this.dao.salvar(usuario);
            } else {
                  this.dao.atualizar(usuario);
            }
      }
      
      public List<Usuario> listar(){
            return this.dao.listar();
      }
      
      public Usuario pesquisaId(int id){
            return (Usuario) this.dao.pesquisarId(id);
      }
      
      public Usuario carregaUsuario(String email){
            return this.usuarioDAO.carregaUsuario(email);
      }
}
