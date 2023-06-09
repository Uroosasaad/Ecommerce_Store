package Dao;
import java.util.List;

public interface DAOInterface<T> {
    T getById(int id);
    List<T> getAll();
    void create(T t);
    void update(T t, String[] params);
    void delete(T t);

}
