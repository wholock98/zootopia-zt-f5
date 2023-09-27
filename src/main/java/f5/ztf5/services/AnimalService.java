package f5.ztf5.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import f5.ztf5.models.Animal;
import f5.ztf5.repositories.AnimalRepository;

@Service
public class AnimalService {

    @Autowired
    AnimalRepository animalRepository;

    public List<Animal> getAnimals(){
        return (List<Animal>) animalRepository.findAll();
    }
    public void addAnimal(Animal animal){
        animalRepository.save(animal);
    }

    public void deleteAnimal(Long id){
        animalRepository.deleteById(id);
    }
    
}
