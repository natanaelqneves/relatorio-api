package br.com.natanael.dmtranrelatorio.controller;

import br.com.natanael.dmtranrelatorio.modelo.Pessoa;
import br.com.natanael.dmtranrelatorio.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping
    public Pessoa novaPessoa(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    @GetMapping("/{idPessoa}")
    public Optional<Pessoa> pegarPessoaPorId(@PathVariable Integer idPessoa){
        return pessoaRepository.findById(idPessoa);
    }
}
