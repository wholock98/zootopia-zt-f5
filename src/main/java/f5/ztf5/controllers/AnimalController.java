package f5.ztf5.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import f5.ztf5.models.Animal;
import f5.ztf5.services.AnimalService;

@RestController
// @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/animales")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<Animal> getAnimals() {
       return animalService.getAnimals();
    }

    @PostMapping
    void addAnimal(@RequestBody Animal animal) {
        animalService.addAnimal(animal);
    }

    @DeleteMapping("/{id}")
    void deleteAnimal(@PathVariable("id") Long id){
        animalService.deleteAnimal(id);
    }
    

}
