package model;

public abstract class Pessoa {
	private String Nome;
	private String Endereco;
	private int Cep;
	private String Cidade;
	private String Estado;
	private boolean IsCpf;
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public int getCep() {
		return Cep;
	}
	public void setCep(int cep) {
		Cep = cep;
	}
	
	public void IncluirNovoCliente() {
		
	}
	
	public void AtualizarCliente() {
		
	}
	public boolean isIsCpf() {
		return IsCpf;
	}
	public void setIsCpf(boolean isCpf) {
		IsCpf = isCpf;
	}
}
