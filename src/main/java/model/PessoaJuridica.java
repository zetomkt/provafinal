package model;

public class PessoaJuridica extends Pessoa {
	private int Cnpj;
	private String InscricaoEstadual;
	private String RazaoSocial;
	public int getCnpj() {
		return Cnpj;
	}
	public void setCnpj(int cnpj) {
		Cnpj = cnpj;
	}
	public String getInscricaoEstadual() {
		return InscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		InscricaoEstadual = inscricaoEstadual;
	}
	public String getRazaoSocial() {
		return RazaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}
	
	public String ValidarCpf() {
		return "validação";
	}
	
}
