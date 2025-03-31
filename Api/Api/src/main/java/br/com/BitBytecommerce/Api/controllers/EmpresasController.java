package br.com.BitBytecommerce.Api.controllers;

import br.com.BitBytecommerce.Api.models.Empresas;
;
import br.com.BitBytecommerce.Api.repository.EmpresasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Empresas")
public class EmpresasController {


    @Autowired
    private EmpresasRepository empresasRepository;

    @GetMapping("/")
    public List<Empresas>acharTodosOsDados(){
        return empresasRepository.findAll();
    }

    @PostMapping(value = "/salvar", consumes = "application/json", produces = "application/json")
    public Empresas create(@RequestBody Empresas dados) {
      return empresasRepository.save(dados);
    }
}




