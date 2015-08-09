/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.financasWeb.modelo.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.Objects;

/**
 *
 * @author adilson
 */
@Entity
public class Categoria implements Serializable{
      
      @Id
      @SequenceGenerator(name = "GEN_CATEGORIA", sequenceName = "GEN_CATEGORIA")
      @GeneratedValue(generator = "GEN_CATEGORIA", strategy = GenerationType.AUTO)
      @Column(name = "ID_CATEGORIA")
      private Integer idCategoria;
      
      @Column(name="NOME", length = 30)
      private String nome;
      
      @Column(name="DESCRICAO", length = 300)
      private String descricao;
      
      @Column(name = "ATIVO", columnDefinition = "boolean default true")
      private boolean ativo;   

      public Integer getIdCategoria() {
            return idCategoria;
      }

      public void setIdCategoria(Integer idCategoria) {
            this.idCategoria = idCategoria;
      }

      public String getNome() {
            return nome;
      }

      public void setNome(String nome) {
            this.nome = nome;
      }

      public String getDescricao() {
            return descricao;
      }

      public void setDescricao(String descricao) {
            this.descricao = descricao;
      }

      public boolean isAtivo() {
            return ativo;
      }

      public void setAtivo(boolean ativo) {
            this.ativo = ativo;
      }


      @Override
      public int hashCode() {
            int hash = 3;
            hash = 59 * hash + Objects.hashCode(this.idCategoria);
            hash = 59 * hash + Objects.hashCode(this.nome);
            hash = 59 * hash + Objects.hashCode(this.descricao);
            hash = 59 * hash + (this.ativo ? 1 : 0);
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
            final Categoria other = (Categoria) obj;
            if (!Objects.equals(this.idCategoria, other.idCategoria)) {
                  return false;
            }
            if (!Objects.equals(this.nome, other.nome)) {
                  return false;
            }
            if (!Objects.equals(this.descricao, other.descricao)) {
                  return false;
            }
            if (this.ativo != other.ativo) {
                  return false;
            }
            return true;
      }
      
}
