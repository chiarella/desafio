package br.com.chiarella.desafios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.chiarella.desafios.domain.Funcionario;

@Repository
public interface DesafioRepository extends JpaRepository<Funcionario, Long> {

}
