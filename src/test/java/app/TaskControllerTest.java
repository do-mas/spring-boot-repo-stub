package app;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestContext.class)
public class TaskControllerTest {

    @Autowired
    public TaskController taskController;

    @Test
    public void testGetRework() {
        Task task = taskController.getReword(1);
        Assert.assertEquals(task, new Task(1));
    }

    @Test
    public void testSearchRework() {
        Task task = taskController.searchReword("text");
        Assert.assertEquals(task, new Task(2).setDescription("before text after"));
    }
}
