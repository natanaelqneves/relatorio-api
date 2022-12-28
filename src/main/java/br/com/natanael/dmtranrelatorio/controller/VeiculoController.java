package br.com.natanael.dmtranrelatorio.controller;

import br.com.natanael.dmtranrelatorio.modelo.Veiculo;
import br.com.natanael.dmtranrelatorio.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
    @Autowired
    private VeiculoRepository veiculoRepository;

    @PostMapping
    public Veiculo novoVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    @GetMapping("/{idVeiculo}")
    public Optional<Veiculo> pegarVeiculoPorId(@PathVariable Integer idVeiculo) {
        return veiculoRepository.findById(idVeiculo);
    }
}
