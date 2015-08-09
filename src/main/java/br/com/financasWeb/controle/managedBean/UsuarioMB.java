/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.financasWeb.controle.managedBean;

import br.com.financasWeb.modelo.entidade.Usuario;
import br.com.financasWeb.modelo.regraNegocio.UsuarioRN;
import br.com.financasWeb.util.MensagemUtil;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;

/**
 *
 * @author adilson
 */
@ManagedBean(name = "usuarioMB")
@ViewScoped
public class UsuarioMB implements Serializable {

      private Usuario usuario = new Usuario();
      private String confirmaSenha;
      
      public String registrar(){            
            if(confirmaSenha.equals(this.usuario.getSenha())){
                  UsuarioRN usuarioRN = new UsuarioRN();
                  this.usuario.setPermissao("ROLE_USUARIO");
                  usuarioRN.salvar(this.usuario);
                  return "/restrito/listaLancamento";
            }     
            MensagemUtil.mensagem(FacesMessage.SEVERITY_WARN, "Aviso: ", "Senha diferente da confirmação.");
            return null;
      }
      
      public Usuario getUsuario() {
            return usuario;
      }

      public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
      }

      public String getConfirmaSenha() {
            return confirmaSenha;
      }

      public void setConfirmaSenha(String confirmaSenha) {
            this.confirmaSenha = confirmaSenha;
      }
      
      
}
