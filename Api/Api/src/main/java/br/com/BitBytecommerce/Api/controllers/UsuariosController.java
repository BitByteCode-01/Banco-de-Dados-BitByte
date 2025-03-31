package br.com.BitBytecommerce.Api.controllers;
import br.com.BitBytecommerce.Api.models.Usuarios;
import br.com.BitBytecommerce.Api.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@CrossOrigin  //define aqui as requisições em cors de diferemtes origens
@RequestMapping("/usuario")
public class UsuariosController {

    @Autowired
    private UsuariosRepository usuarioRepository;

    @GetMapping("/")
    public List<Usuarios>encontrarTodosOsRegistros(){
        return usuarioRepository.findAll();
    }

//ENDPOINT PARA A CRIAÇÃO DE NOVOS REGISTROS


    @PostMapping(value = "/salvar", consumes = "application/json", produces = "application/json")
    public Usuarios create(@RequestBody Usuarios dados) {
        return usuarioRepository.save(dados);
    }
}
