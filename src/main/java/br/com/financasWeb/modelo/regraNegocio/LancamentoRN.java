/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.financasWeb.modelo.regraNegocio;

import br.com.financasWeb.modelo.entidade.Lancamento;
import br.com.financasWeb.modelo.persistence.generica.InterfaceGenerica;
import br.com.financasWeb.modelo.persistence.lancamento.LancamentoDAO;
import br.com.financasWeb.util.DAOFactory;
import java.util.List;
import java.util.Date;
/**
 *
 * @author adilson
 */
public class LancamentoRN {
      
      private InterfaceGenerica dao;
      private LancamentoDAO lancamentoDAO;
      
      public LancamentoRN(){
            this.dao = DAOFactory.criarDAO(Lancamento.class);
            this.lancamentoDAO = DAOFactory.criarLancamentoDAO();
      }
      
      public void salvar(Lancamento lancamento){
            if(lancamento.getIdLancamento() == null || lancamento.getIdLancamento() == 0){
                  lancamento.setDataLancamento(new Date());
                  this.dao.salvar(lancamento);
            }else{
                  this.dao.atualizar(lancamento);
            }
      }
      
      public void deletar(Lancamento lancamento){
            this.dao.deletar(lancamento);
      }
      
      public List<Lancamento> getLancamentos(int idUsuario){
            return this.lancamentoDAO.getLancamentos(idUsuario);
      }
      
      
}
