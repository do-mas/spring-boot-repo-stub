package app;

import app.repo.AnimalRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

@Configuration
@Import(Application.class)
public class TestContext {

    @Primary
    @Bean(name = "taskq")
    public AnimalRepository taskRepo() {
        return new AnimalRepositoryStub();
    }
}
