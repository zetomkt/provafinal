package repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import model.PessoaFisica;
import model.PessoaJuridica;

@Repository
public class PessoaRepositorio {
	private List<PessoaFisica> PessoasFisicas;
	private List<PessoaJuridica> PessoasJuridicas;

	public PessoaRepositorio() {
		PessoasFisicas = new ArrayList<PessoaFisica>();
		PessoasJuridicas = new ArrayList<PessoaJuridica>();
	}

	public List<PessoaFisica> getPessoasFisicas() {
		return PessoasFisicas;
	}

	public void setPessoasFisicas(List<PessoaFisica> pessoasFisicas) {
		PessoasFisicas = pessoasFisicas;
	}

	public List<PessoaJuridica> getPessoasJuridicas() {
		return PessoasJuridicas;
	}

	public void setPessoasJuridicas(List<PessoaJuridica> pessoasJuridicas) {
		PessoasJuridicas = pessoasJuridicas;
	}

	public void CadastrarPessoaFisica(PessoaFisica pessoaFisica) {
		PessoasFisicas.add(pessoaFisica);
	}

	public void CadastrarPessoaJuridica(PessoaJuridica pessoaJuridica) {
		PessoasJuridicas.add(pessoaJuridica);
	}
}
