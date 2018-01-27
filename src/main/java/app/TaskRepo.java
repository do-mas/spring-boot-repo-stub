package app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Qualifier("taskq")
public interface TaskRepo extends CrudRepository<Task, Integer> {

    @Query("select r from Task r where r.description like %?1")
    Task findByDescriptionLike(String description);

}
