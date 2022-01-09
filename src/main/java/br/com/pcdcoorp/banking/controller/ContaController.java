package br.com.pcdcoorp.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.pcdcoorp.banking.dao.ContaDao;
import br.com.pcdcoorp.banking.model.Conta;
import br.com.pcdcoorp.banking.exceptions.ContaNaoEncontradaException;


/** Responsável pelos controladores dos endpoints /contas e /contas/{numero}.
 * 
 * @author Kerolin Ferreira de Oliveira, Leandro Dias Alcolumbre da Silva, Marcia Maria da Silva, Nahida Ali Abou Nouh e Paulo de Matos Santesso.
 *
 */

@RestController
public class ContaController {

	@Autowired
	private ContaDao dao;

	/** Método que recupera dados de todas contas cadastradas no banco de dados MYSQl.
	 * 
	 * @return Retorna lista de objetos com os dados detalhados.
	 */

	@GetMapping("/contas")
	public List<Conta> recuperarTodas() {
		return (List<Conta>) dao.findAll();
	}

	/** Recupera dados de uma conta específica, relacionada com a chave primária no banco de dados.
	 *  
	 * @param numero
	 * @return Retorna objeto com valores (se houver). Inexistindo a chave primária, lança exceção, com status 404.
	 */

	@GetMapping("/contas/{numero}")
	public Conta recuperarPeloNumero(@PathVariable int numero) {
		return dao.findById(numero).orElseThrow(() -> new ContaNaoEncontradaException(numero));

	}

}
