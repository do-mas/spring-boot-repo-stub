package app.api;

import app.repo.Animal;
import app.repo.Room;
import app.repo.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rooms")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @PostMapping
    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }

    @DeleteMapping("{id}")
    public void deleteRoom(@RequestParam(value = "id") Long id) {
        roomRepository.delete(id);
    }

    @PutMapping("{id}")
    public Room updateRoom(@PathVariable(value = "id") Long id, Room room) {
        return roomRepository.save(room);
    }

    @GetMapping("{id}")
    public Room getRoom(@PathVariable(value = "id") Long id) {
        return roomRepository.findOne(id);
    }

    @PutMapping("{roomId}/place-animal/{animalId}")
    public void updateRoom(Long roomId, Long animalId) {
    }







}
