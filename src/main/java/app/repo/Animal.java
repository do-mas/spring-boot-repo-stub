package app.repo;

import javax.persistence.*;

@Entity
public class Animal {

    @Id
    @GeneratedValue
    private Long animalId;
    private String description;
    @Column(name="room_id")
    private Long roomId;

    public Long getAnimalId() {
        return animalId;
    }

    public Animal setAnimalId(Long animalId) {
        this.animalId = animalId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Animal setDescription(String description) {
        this.description = description;
        return this;
    }

    public Long getRoomId() {
        return roomId;
    }

    public Animal setRoomId(Long roomId) {
        this.roomId = roomId;
        return this;
    }
}

