package br.senac.rn.clinica.controller;

import br.senac.rn.clinica.model.Animal;
import br.senac.rn.clinica.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("animais")
public class AnimalController {

    @Autowired
    private AnimalRepository repository;

    @GetMapping
    public List<Animal> listaTodos() {
        return repository.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Animal animal) {
        repository.save(animal);
    }

}
