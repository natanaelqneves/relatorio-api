package br.com.natanael.dmtranrelatorio.repository;

import br.com.natanael.dmtranrelatorio.modelo.Relatorio;
import br.com.natanael.dmtranrelatorio.modelo.Veiculo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface RelatorioRepository extends CrudRepository<Relatorio, Integer>, PagingAndSortingRepository<Relatorio, Integer> {

    public Veiculo findAllByNomeMotoristaIsContaining(@Param("nomeMotorista") String nomeMotorista);

}
