package app;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestContext.class)
public class RewordControllerTest {

    @Autowired
    public RewordController rewordController;

    @Test
    public void testGetRework() {
        Reword reword = rewordController.getReword(1);
        Assert.assertEquals(reword, new Reword(1));
    }

    @Test
    public void testSearchRework() {
        Reword reword = rewordController.searchReword("text");
        Assert.assertEquals(reword, new Reword(2).setDescription("before text after"));
    }
}
