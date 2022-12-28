package br.com.natanael.dmtranrelatorio.repository;

import br.com.natanael.dmtranrelatorio.modelo.Pessoa;
import br.com.natanael.dmtranrelatorio.modelo.Veiculo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface VeiculoRepository extends CrudRepository<Veiculo, Integer>, PagingAndSortingRepository<Veiculo, Integer> {

    public Veiculo findByPlacaVeiculoIsContaining(@Param("placaVeiculo") String placaVeiculo);

}
