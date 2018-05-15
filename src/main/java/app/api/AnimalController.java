package app.api;

import app.repo.AnimalRepository;
import app.repo.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("animals")
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @PostMapping
    public Animal saveAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @DeleteMapping("{id}")
    public void deleteAnimal(@RequestParam(value = "id") Long id) {
        animalRepository.delete(id);
    }

    @PutMapping("{id}")
    public Animal updateAnimal(@PathVariable(value = "id") Long id, Animal animal) {
        return animalRepository.save(animal);
    }

    @GetMapping("{id}")
    public Animal getAnimal(@PathVariable(value = "id") Long id) {
        return animalRepository.findOne(id);
    }

    //TODO to body
    @PutMapping("{animalId}/change-room/form/{roomIdFom}/to/{roomIdTo}")
    public void changeRoom(Long animalId, Long roomIdFrom, Long roomIdTo) {
    }

    //TODO to body
    @PutMapping("{animalId}/set-favorite-room/{roomId}")
    public void setFavoriteRoom(Long animalId, Long roomIdTo) {
    }

    //TODO to body
    @PutMapping("{animalId}/remove-favorite-room/{roomId}")
    public void removeFavoriteRoom(Long animalId, Long roomIdFrom, Long roomIdTo) {
    }

    //TODO to body
    @GetMapping("{animalId}/favorite-rooms")
    public void removeFavoriteRoom(Long animalId) {
    }

}
