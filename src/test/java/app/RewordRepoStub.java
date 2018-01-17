package app;

public class RewordRepoStub implements RewordRepo {

    @Override
    public Reword findByDescriptionLike(String description) {
        return new Reword(2).setDescription("before " + description + " after");
    }

    @Override
    public Reword findOne(Integer serializable) {
        return new Reword(1);
    }

    @Override
    public Reword save(Reword entity) {
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
    public Iterable<Reword> findAll() {
        return null;
    }

    @Override
    public Iterable<Reword> findAll(Iterable iterable) {
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
    public void delete(Reword entity) {

    }


}
