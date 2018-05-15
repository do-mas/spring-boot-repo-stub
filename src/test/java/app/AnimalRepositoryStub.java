package app;

import app.repo.Animal;
import app.repo.AnimalRepository;

public class AnimalRepositoryStub implements AnimalRepository {

    @Override
    public Animal findByDescriptionLike(String description) {
        return new Animal(2).setDescription("before " + description + " after");
    }

    @Override
    public Animal findOne(Integer serializable) {
        return new Animal(1);
    }

    @Override
    public Animal save(Animal entity) {
        return null;
    }

    @Override
    public Iterable save(Iterable entities) {
        return null;
    }

    @Override
    public boolean exists(Integer serializable) {
        return false;
    }

    @Override
    public Iterable<Animal> findAll() {
        return null;
    }

    @Override
    public Iterable<Animal> findAll(Iterable iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Integer serializable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void delete(Iterable entities) {

    }

    @Override
    public void delete(Animal entity) {

    }


}
