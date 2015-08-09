/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.financasWeb.controle.managedBean;

import br.com.financasWeb.modelo.entidade.Categoria;
import br.com.financasWeb.modelo.entidade.Lancamento;
import br.com.financasWeb.modelo.entidade.TipoLancamento;
import br.com.financasWeb.modelo.regraNegocio.LancamentoRN;
import br.com.financasWeb.util.MensagemUtil;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;

/**
 *
 * @author adilson
 */
@ManagedBean(name = "lancamentoMB")
@ViewScoped
public class LancamentoMB implements Serializable {

      private Lancamento lancamento;
      private TipoLancamento[] tipoLancameneto;
      private Categoria categoria;
      private List<Categoria> categorias = new ArrayList<>();
      private TipoLancamento tipo;

      public void salvar() {
            try {
                  this.lancamento.setCategoria(categoria);
                  this.lancamento.setTipoLancamento(tipo);
                  LancamentoRN lancamentoRN = new LancamentoRN();
                  lancamentoRN.salvar(lancamento);
                                    
                  MensagemUtil.mensagem(FacesMessage.SEVERITY_INFO, "Sucesso: ", "Lançamento cadastro.");
                  
            } catch (Exception e) {
                  MensagemUtil.mensagem(FacesMessage.SEVERITY_ERROR, "Erro: ", e.getMessage());
            }
      }

      public Lancamento getLancamento() {
            return lancamento;
      }

      public void setLancamento(Lancamento lancamento) {
            this.lancamento = lancamento;
      }

      public TipoLancamento[] getTipoLancameneto() {
            return tipoLancameneto;
      }

      public Categoria getCategoria() {
            return categoria;
      }

      public void setCategoria(Categoria categoria) {
            this.categoria = categoria;
      }

      public List<Categoria> getCategorias() {
            return categorias;
      }

      public TipoLancamento getTipo() {
            return tipo;
      }

      public void setTipo(TipoLancamento tipo) {
            this.tipo = tipo;
      }
}
