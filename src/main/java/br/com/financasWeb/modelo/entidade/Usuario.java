/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.financasWeb.modelo.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import javax.persistence.GenerationType;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
/**
 *
 * @author adilson
 */

@Entity
public class Usuario implements Serializable {
      
      @Id
      @SequenceGenerator(name = "GEN_USUARIO", sequenceName = "GEN_USUARIO")
      @GeneratedValue(strategy = GenerationType.AUTO, generator = "GEN_USUARIO")
      @Column(name = "ID_USUARIO")
      private Integer idUsuario;

      @Column(name="NOME", length = 50)
      private String nome;
      
      @Column(name = "SENHA", length = 15)
      private String senha;
      
      @Column(name = "EMAIL", length = 50)
      private String email;
      
      @Column(name = "ATIVO", columnDefinition = "boolean default true")
      private boolean ativo;
      
      @Column(name = "PERMISSAO", length = 20)
      private String permissao;
      
      @OneToMany(targetEntity = Lancamento.class, fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
      private List<Lancamento> lancamentos;

      public Integer getIdUsuario() {
            return idUsuario;
      }

      public void setIdUsuario(Integer idUsuario) {
            this.idUsuario = idUsuario;
      }

      public String getNome() {
            return nome;
      }

      public void setNome(String nome) {
            this.nome = nome;
      }

      public String getSenha() {
            return senha;
      }

      public void setSenha(String senha) {
            this.senha = senha;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public boolean isAtivo() {
            return ativo;
      }

      public void setAtivo(boolean ativo) {
            this.ativo = ativo;
      }

      public String getPermissao() {
            return permissao;
      }

      public void setPermissao(String permissao) {
            this.permissao = permissao;
      }

      public List<Lancamento> getLancamentos() {
            return lancamentos;
      }

      public void setLancamentos(List<Lancamento> lancamentos) {
            this.lancamentos = lancamentos;
      }

      @Override
      public int hashCode() {
            int hash = 3;
            hash = 37 * hash + Objects.hashCode(this.idUsuario);
            hash = 37 * hash + Objects.hashCode(this.nome);
            hash = 37 * hash + Objects.hashCode(this.senha);
            hash = 37 * hash + Objects.hashCode(this.email);
            hash = 37 * hash + (this.ativo ? 1 : 0);
            hash = 37 * hash + Objects.hashCode(this.permissao);
            hash = 37 * hash + Objects.hashCode(this.lancamentos);
            return hash;
      }

      @Override
      public boolean equals(Object obj) {
            if (obj == null) {
                  return false;
            }
            if (getClass() != obj.getClass()) {
                  return false;
            }
            final Usuario other = (Usuario) obj;
            if (!Objects.equals(this.idUsuario, other.idUsuario)) {
                  return false;
            }
            if (!Objects.equals(this.nome, other.nome)) {
                  return false;
            }
            if (!Objects.equals(this.senha, other.senha)) {
                  return false;
            }
            if (!Objects.equals(this.email, other.email)) {
                  return false;
            }
            if (this.ativo != other.ativo) {
                  return false;
            }
            if (!Objects.equals(this.permissao, other.permissao)) {
                  return false;
            }
            if (!Objects.equals(this.lancamentos, other.lancamentos)) {
                  return false;
            }
            return true;
      }
}
