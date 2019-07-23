package org.generation.brazil.angular_crud.pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    // CREATE

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/pessoas")
    public Pessoa save(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    // READ

    @GetMapping("/pessoas")
    public List<Pessoa> findAll(){
        return pessoaRepository.findAll();
    }

    @GetMapping("/pessoas/{id}")
    public Optional<Pessoa> findById(@PathVariable Long id) {
        return pessoaRepository.findById(id);
    }

    // UPDATE

    @PatchMapping("/pessoas/atualiza/{id}")
    public void updateNome(@PathVariable Long id, @RequestParam String nome){
        pessoaRepository.updateNome(nome, id);
    }

    // DELETE

    @DeleteMapping("/pessoas/{id}")
    public void delete(@PathVariable Long id){
        pessoaRepository.deleteById(id);
    }

}
