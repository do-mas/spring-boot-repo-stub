package app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Qualifier("reword")
public interface RewordRepo extends CrudRepository<Reword, Integer> {

    @Query("select r from Reword r where r.description like %?1")
    Reword findByDescriptionLike(String description);

}
