package br.com.natanael.dmtranrelatorio.controller;

import br.com.natanael.dmtranrelatorio.modelo.Relatorio;
import br.com.natanael.dmtranrelatorio.modelo.Veiculo;
import br.com.natanael.dmtranrelatorio.repository.RelatorioRepository;
import br.com.natanael.dmtranrelatorio.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/relatorio")
public class RelatorioController {

    @Autowired
    private RelatorioRepository relatorioRepository;

    @Autowired
    private VeiculoRepository veiculoRepository;

    @PostMapping
    public Relatorio novoRelatorio(Relatorio relatorio) {
        Veiculo veic = veiculoRepository.findByPlacaVeiculoIsContaining(relatorio.getPlacaVeiculo());
        veic.setKmRodado(veic.getKmRodado() + relatorio.getKmRodadoNoServico());
        veic.setAvariado(relatorio.isAvariadoNoServico());
        veic.setDetalheDaAvaria(relatorio.getDetalheDaAvariaNoServico());
        veiculoRepository.save(veic);
        return relatorioRepository.save(relatorio);
    }

    @GetMapping("/{idRelatorio}")
    public Optional<Relatorio> pegarRelatorioPorId(@PathVariable Integer idRelatorio) {
        return relatorioRepository.findById(idRelatorio);
    }

}
