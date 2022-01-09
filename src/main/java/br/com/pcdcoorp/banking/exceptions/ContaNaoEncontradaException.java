package br.com.pcdcoorp.banking.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**Classe responsável por gerenciar a exceção de conta inexistente.
 * 
 * @author Kerolin Ferreira de Oliveira, Leandro Dias Aucolumbre da Silva, Marcia Maria da Silva, Nahida Ali Abou Nouh e Paulo de Matos Santesso. 
 *
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ContaNaoEncontradaException extends RuntimeException {

	public ContaNaoEncontradaException(int conta) {
		super("A conta " + conta + " não foi encontrada.");
	}

}
