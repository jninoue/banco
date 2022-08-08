package model;

import java.util.Date;

import helper.Utils;

public class Cliente {
	private static int contador = 101;
	
	private int codigo;
	private String nome, email, cpf;
	private Date dataNascimento, dataCadastro;
	
	
	
	
	public Cliente(String nome, String email, String cpf, Date dataNascimento) {
		this.codigo = Cliente.contador;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.dataCadastro = new Date();
		Cliente.contador += 1;
	}
	
	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
	
		return "Cliente: " + this.getCodigo() + " - " + this.getNome() +
				"\ne-mail: " + this.getEmail() + 
				"\nCPF: " + this.getCpf() +
				"\nData de Nascimento: " + Utils.dateParaString(this.getDataNascimento()) + 
				"\nData de Cadastro: " + Utils.dateParaString(this.getDataCadastro());
	}

}
