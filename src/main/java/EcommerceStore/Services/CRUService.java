package EcommerceStore.Services;
import java.util.List;
public interface CRUService<T> {
    T getById(int id);
    List<T> getAll();
    void create(T t);
    void update(T t);
}