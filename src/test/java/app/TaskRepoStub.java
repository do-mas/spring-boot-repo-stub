package app;

public class TaskRepoStub implements TaskRepo {

    @Override
    public Task findByDescriptionLike(String description) {
        return new Task(2).setDescription("before " + description + " after");
    }

    @Override
    public Task findOne(Integer serializable) {
        return new Task(1);
    }

    @Override
    public Task save(Task entity) {
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
    public Iterable<Task> findAll() {
        return null;
    }

    @Override
    public Iterable<Task> findAll(Iterable iterable) {
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
    public void delete(Task entity) {

    }


}
