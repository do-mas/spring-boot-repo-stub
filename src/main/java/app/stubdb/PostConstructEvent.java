package app.stubdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PostConstructEvent {

    @Autowired
    private _StubService stubService;

    @PostConstruct
    private void postConstruct() {
        System.out.println("PostConstruct event triggered");
        stubService.createStubData(2);
    }

}
