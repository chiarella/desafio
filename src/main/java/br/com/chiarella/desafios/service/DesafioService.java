package br.com.chiarella.desafios.service;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.chiarella.desafios.domain.Funcionario;
import br.com.chiarella.desafios.repository.DesafioRepository;

@Service
@Transactional
public class DesafioService {

	@Autowired
	private DesafioRepository desafioRepository;

	public Funcionario buscaPorId(Long id) {
		Optional<Funcionario> optf = desafioRepository.findById(id);
		return optf.get();

	}

	public List<Funcionario> buscaTodos() {
		return desafioRepository.findAll();
	}

	public Double somaSalario() {
		return desafioRepository.findAll().stream().mapToDouble(f -> f.getSalario()).sum();
	}

	public Double salarioPorId(Long id) {
		Optional<Funcionario> optf = desafioRepository.findById(id);
		return optf.get().getSalario();
	}

	public void delete(Long id) {
		desafioRepository.deleteById(id);
	}

	public Funcionario create(Funcionario funcionario) {
		return desafioRepository.save(funcionario);
	}

	public String reajusteSalarial(Long id) {
		DecimalFormat df = new DecimalFormat("###,##0.00");

		Optional<Funcionario> optf = desafioRepository.findById(id);
		System.out.println("");
		System.out.println(
				"Salario atual: " + df.format(optf.get().getSalario()) + " do funcionario: " + optf.get().getNome());
		System.out.println("");

		// Salario atual
		Double salarioAtual = optf.get().getSalario();

		// Taxa de reajuste de salario 6%
		Double taxaReajuste = 6.0;
		Double reajustado = ((salarioAtual * taxaReajuste) / 100) + salarioAtual;


		if (reajustado % 2 == 0) {
			System.out.println("Salário reajustado com a taxa de " + taxaReajuste + "% + 1 se for par: " + df.format(reajustado + 1));
			return "Salário reajustado com a taxa de " + taxaReajuste + "% + 1 se for par: " + df.format(reajustado + 1);
		} else {
			//caso não for par
			System.out.println("OBS: Caso o numero for quebrado = valores após a , (virgula) não caracteriza PAR OU IMPAR: ");
			System.out.println("Salário reajustado com a taxa de " + taxaReajuste + "%: " + df.format(reajustado + 1));
			
			return "Salario + o reajuste: " + df.format(reajustado) + " Atenção: Caso o numero for quebrado = valores após a , (virgula) não caracteriza PAR OU IMPAR: ";
		}

	}
}







