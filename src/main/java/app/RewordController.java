package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RewordController {

    @Autowired
    @Qualifier("reword")
    public RewordRepo rewordRepo;

    @RequestMapping("/reword/{id}")
    public Reword getReword(@PathVariable(value = "id") Integer id) {
        return rewordRepo.findOne(id);
    }

    @RequestMapping("/reword/search")
    public Reword searchReword(@RequestParam(value = "description") String description) {
        return rewordRepo.findByDescriptionLike(description);
    }
}
