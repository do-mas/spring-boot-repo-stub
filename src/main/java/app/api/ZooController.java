package app.api;

import app.repo.Animal;
import app.repo.AnimalRepository;
import app.repo.Room;
import app.repo.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("zoo")
public class ZooController {

    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("animals/without-room")
    public List<Animal> getAnimalWithoutRoom(@PathVariable(value = "id") Long id) {
        return null;
        // join where animal rooms are empty
    }

    @GetMapping
    public Room add(){
        Room r = new Room();
        r = roomRepository.save(r);
        Animal animal = new Animal();
        animal.setRoomId(r.getRoomId());
        animal = animalRepository.save(animal);
        r.setAnimals(Arrays.asList(animal));
        roomRepository.save(r);
Animal a1  = animalRepository.findOne(animal.getAnimalId());
        return roomRepository.findOne(r.getRoomId());
    }

    // request params for sorting
    @GetMapping("room/{roomId}/animals")
    public Room getRoom(@PathVariable(value = "id") Long id) {
        return roomRepository.findOne(id);
    }








}
