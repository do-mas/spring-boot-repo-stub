package app.db;

import app.Reword;
import app.RewordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class DBStubSetup {

    @Value("${stub.db:true}")
    public Boolean shouldUseStubDB;

    @Autowired
    private RewordRepo rewordRepo;

    @PostConstruct
    private void persistStubsToDB(){
        if (shouldUseStubDB) createStubData();
    }

    private void createStubData() {

        Reword rewordToSave1 = new Reword(1).setDescription("description number 1");
        Reword rewordToSave2 = new Reword(2).setDescription("description number 2");

        rewordRepo.save(Arrays.asList(rewordToSave1, rewordToSave2));

    }

}
