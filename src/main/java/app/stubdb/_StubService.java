package app.stubdb;

import app.TaskRepo;
import app.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class _StubService {

    @Value("${test.val:true}")
    private Boolean shouldUseStubDB;

    @Autowired
    private TaskRepo taskRepo;

    void createStubData(int id) {
        if (shouldUseStubDB) {
            taskRepo.save(new Task(id).setDescription("description number"));
            taskRepo.save(new Task(id + 5).setDescription("description number 2"));
        }
    }

}
