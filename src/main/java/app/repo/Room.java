package app.repo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Room {

    @Id
    @GeneratedValue
    @Column(name = "room_id")
    private Long roomId;
    private String description;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "room_id")
    private List<Animal> animals;

    public Long getRoomId() {
        return roomId;
    }

    public Room setRoomId(Long roomId) {
        this.roomId = roomId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Room setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public Room setAnimals(List<Animal> animals) {
        this.animals = animals;
        return this;
    }
}

