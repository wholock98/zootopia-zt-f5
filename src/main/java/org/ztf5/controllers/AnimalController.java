package org.ztf5.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.ztf5.services.AnimalService;
import org.ztf5.models.Animal;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/animales")
    public List<Animal> getAnimals() {
       return animalService.getAnimals();
    }

    @PostMapping("/animales")
    void addAnimal(@RequestBody Animal animal) {
        animalService.addAnimal(animal);
    }

    @DeleteMapping("/animales/{id}")
    void deleteAnimal(@PathVariable("id") Long id){
        animalService.deleteAnimal(id);
    }
    

}
