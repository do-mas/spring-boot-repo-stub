package app;

import app.api.AnimalController;
import app.repo.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestContext.class)
@TestPropertySource(locations="classpath:application.properties")
public class TaskControllerTest {

    @Autowired
    public AnimalController taskController;

    @Test
    public void testGetRework() {
        Animal animal = taskController.getReword(1);
        Assert.assertEquals(animal, new Animal(1));
    }

    @Test
    public void testSearchRework() {
        Animal animal = taskController.searchReword("text");
        Assert.assertEquals(animal, new Animal(2).setDescription("before text after"));
    }
}
