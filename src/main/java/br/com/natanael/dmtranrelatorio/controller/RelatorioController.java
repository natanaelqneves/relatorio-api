package br.com.natanael.dmtranrelatorio.controller;

import br.com.natanael.dmtranrelatorio.modelo.Relatorio;
import br.com.natanael.dmtranrelatorio.repository.RelatorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/relatorio")
public class RelatorioController {

    @Autowired
    private RelatorioRepository relatorioRepository;

    @PostMapping
    public Relatorio novoRelatorio(Relatorio relatorio) {
        return relatorioRepository.save(relatorio);
    }

    @GetMapping("/{idRelatorio}")
    public Optional<Relatorio> pegarRelatorioPorId(@PathVariable Integer idRelatorio) {
        return relatorioRepository.findById(idRelatorio);
    }
}
