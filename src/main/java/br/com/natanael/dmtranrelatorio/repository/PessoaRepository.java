package br.com.natanael.dmtranrelatorio.repository;

import br.com.natanael.dmtranrelatorio.modelo.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {
}
