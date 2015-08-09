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
public enum Status {
      
      PAGO("Pago"), 
      ABERTO("Aberto");
      
      private String descricao;
      
      private Status(String descricao){
            this.descricao = descricao;
      }
}
