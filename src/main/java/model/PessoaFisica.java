package model;

import java.util.Date;

public class PessoaFisica extends Pessoa {
	private int Rg;
	private int Cpf;
	private String Sexo;
	private Date DataNasc;
	
	public int getRg() {
		return Rg;
	}
	public void setRg(int rg) {
		Rg = rg;
	}
	public int getCpf() {
		return Cpf;
	}
	public void setCpf(int cpf) {
		Cpf = cpf;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public Date getDataNasc() {
		return DataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		DataNasc = dataNasc;
	}
	
	public void ValidarCpf() {
		
	}
	
}
