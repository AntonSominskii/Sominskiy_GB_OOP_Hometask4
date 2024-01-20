import java.util.List;

public interface IService<T> {
    void add(T item);
    void edit(int id, T item);
    List<T> getAll();
}