/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.financasWeb.modelo.entidade;

/**
 *
 * @author adilson
 */
public enum TipoLancamento {
      
      DEBITO("Débito"), 
      CREDITO("Crédito");
      
      private String descricao;
      
      private TipoLancamento(String descricao){
            this.descricao = descricao;
      }

      public String getDescricao() {
            return descricao;
      }
      
}
