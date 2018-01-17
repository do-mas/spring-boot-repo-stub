package app;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reword {

    @Id
    private int id;
    private String description;

    public Reword() {
    }

    public Reword(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public Reword setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getId() {
        return id;
    }

    public Reword setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reword reword = (Reword) o;

        if (id != reword.id) return false;
        return description != null ? description.equals(reword.description) : reword.description == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}

