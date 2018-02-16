package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    @Qualifier("taskq")
    public TaskRepo taskRepo;

    @RequestMapping("/tasks/{id}")
    public Task getReword(@PathVariable(value = "id") Integer id) {
        return taskRepo.findOne(id);
    }

    @RequestMapping("/tasks/add/{id}")
    public Task addTask(@PathVariable(value = "id") Integer id) {
        return taskRepo.save(new Task(id).setDescription("description of " + id));
    }

    @RequestMapping("/tasks")
    public Iterable<Task> getRewords() {
        return taskRepo.findAll();
    }

    @RequestMapping("/tasks/search")
    public Task searchReword(@RequestParam(value = "description") String description) {
        return taskRepo.findByDescriptionLike(description);
    }
}
