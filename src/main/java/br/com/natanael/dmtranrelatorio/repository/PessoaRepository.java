package br.com.natanael.dmtranrelatorio.repository;

import br.com.natanael.dmtranrelatorio.modelo.Pessoa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer>, PagingAndSortingRepository<Pessoa, Integer> {

    public Pessoa findByNomeIsContaining(@Param("nome") String nome);

    public Pessoa findByMatriculaIsContaining(@Param("matricula") String matricula);
}
