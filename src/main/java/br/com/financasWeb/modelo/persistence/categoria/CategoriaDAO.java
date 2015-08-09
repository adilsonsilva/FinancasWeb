/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.financasWeb.modelo.persistence.categoria;

import br.com.financasWeb.modelo.entidade.Categoria;
import java.util.List;

/**
 *
 * @author adilson
 */
public interface CategoriaDAO {
      public List<Categoria> listarAtivos();
}
