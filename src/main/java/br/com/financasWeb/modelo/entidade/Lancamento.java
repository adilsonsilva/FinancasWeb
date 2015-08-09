/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.financasWeb.modelo.entidade;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author adilson
 */

@Entity
public class Lancamento implements Serializable{
      
      @Id
      @SequenceGenerator(name="GEN_LANCAMENTO", sequenceName="GEN_LANCAMENTO")
      @GeneratedValue(generator = "GEN_LANCAMENTO", strategy = GenerationType.AUTO)
      @Column(name="ID_LANCAMENTO")
      private Integer idLancamento;
      
      @Enumerated(EnumType.STRING)
      @Column(name = "TIPO_LANCAMENTO", columnDefinition = "char(1)")
      private TipoLancamento tipoLancamento;
      
      @Column(name = "VALOR", precision = 14, scale = 2)
      private BigDecimal valor;
      
      @Column(name="DESCRICAO", length = 300)
      private String descricao;
      
      @Temporal(TemporalType.TIMESTAMP)
      @Column(name = "DATA_LANCAMENTO")
      private Date dataLancamento;
      
      @Enumerated(EnumType.STRING)
      @Column(name = "STATUS", columnDefinition = "char(1)")
      private Status status;
      
      @Temporal(TemporalType.TIMESTAMP)
      @Column(name = "DATA_RECEBIMENTO_PAGAMENTO")
      private Date dataRecebimentoPagamento;
      
      @ManyToOne
      private Usuario usuario;
      
      @OneToOne
      private Categoria categoria;

      public Integer getIdLancamento() {
            return idLancamento;
      }

      public void setIdLancamento(Integer idLancamento) {
            this.idLancamento = idLancamento;
      }

      public TipoLancamento getTipoLancamento() {
            return tipoLancamento;
      }

      public void setTipoLancamento(TipoLancamento tipoLancamento) {
            this.tipoLancamento = tipoLancamento;
      }

      public BigDecimal getValor() {
            return valor;
      }

      public void setValor(BigDecimal valor) {
            this.valor = valor;
      }

      public String getDescricao() {
            return descricao;
      }

      public void setDescricao(String descricao) {
            this.descricao = descricao;
      }

      public Date getDataLancamento() {
            return dataLancamento;
      }

      public void setDataLancamento(Date dataLancamento) {
            this.dataLancamento = dataLancamento;
      }

      public Status getStatus() {
            return status;
      }

      public void setStatus(Status status) {
            this.status = status;
      }

      public Date getDataRecebimentoPagamento() {
            return dataRecebimentoPagamento;
      }

      public void setDataRecebimentoPagamento(Date dataRecebimentoPagamento) {
            this.dataRecebimentoPagamento = dataRecebimentoPagamento;
      }

      public Usuario getUsuario() {
            return usuario;
      }

      public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
      }

      public Categoria getCategoria() {
            return categoria;
      }

      public void setCategoria(Categoria categoria) {
            this.categoria = categoria;
      }

      @Override
      public int hashCode() {
            int hash = 5;
            hash = 61 * hash + Objects.hashCode(this.idLancamento);
            hash = 61 * hash + Objects.hashCode(this.tipoLancamento);
            hash = 61 * hash + Objects.hashCode(this.valor);
            hash = 61 * hash + Objects.hashCode(this.descricao);
            hash = 61 * hash + Objects.hashCode(this.dataLancamento);
            hash = 61 * hash + Objects.hashCode(this.status);
            hash = 61 * hash + Objects.hashCode(this.dataRecebimentoPagamento);
            hash = 61 * hash + Objects.hashCode(this.usuario);
            hash = 61 * hash + Objects.hashCode(this.categoria);
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
            final Lancamento other = (Lancamento) obj;
            if (!Objects.equals(this.idLancamento, other.idLancamento)) {
                  return false;
            }
            if (this.tipoLancamento != other.tipoLancamento) {
                  return false;
            }
            if (!Objects.equals(this.valor, other.valor)) {
                  return false;
            }
            if (!Objects.equals(this.descricao, other.descricao)) {
                  return false;
            }
            if (!Objects.equals(this.dataLancamento, other.dataLancamento)) {
                  return false;
            }
            if (this.status != other.status) {
                  return false;
            }
            if (!Objects.equals(this.dataRecebimentoPagamento, other.dataRecebimentoPagamento)) {
                  return false;
            }
            if (!Objects.equals(this.usuario, other.usuario)) {
                  return false;
            }
            if (!Objects.equals(this.categoria, other.categoria)) {
                  return false;
            }
            return true;
      }
      
      

}
