package br.com.pcdcoorp.banking.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.pcdcoorp.banking.model.Conta;

/**Realiza comunicação com o banco de dados por intermédio do Hybernate e CrudRepository
 * .
 * @author Kerolin Ferreira de Oliveira, Leandro Dias Aucolumbre da Silva, Marcia Maria da Silva, Nahida Ali Abou Nouh e Paulo de Matos Santesso.
 *
 */

public interface ContaDao          extends CrudRepository<Conta,Integer>{

}
