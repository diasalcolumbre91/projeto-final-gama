package br.com.pcdcoorp.banking.model;

import javax.persistence.*;

/**Modelo de conta que deverá ser obrigatoriamente preenchido (parcial ou totalmente) para gerenciamento de dados presentes no banco de dados.
 * 
 *  @author Kerolin Ferreira de Oliveira, Leandro Dias Aucolumbre da Silva, Marcia Maria da Silva, Nahida Ali Abou Nouh e Paulo de Matos Santesso.
 * 
 *
 */

@Entity
@Table(name = "tbl_contas")
public class Conta {

	/** Variáveis sincronizadas, por meio de anotação, com a tabela MySQL. Getters e Setters incluídos, responsáveis pela integração com o CrudRepository que, por sua vez, fará a comunicação com Hybernate e banco de dados.
	 * 
	 */

	@Id
	@Column(name = "id_con")
	private int numero;

	@Column(name = "conta")
	private int conta;


	@Column(name = "agencia")
	private int agencia;

	@Column(name = "tipodeconta")
	private int tipo;

	@Column(name = "saldo")
	private double saldo;

	@Column(name = "nome", length = 100)
	private String titular;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}


}
