package utility;

import java.util.List;
import java.util.Optional;

public interface ICRUD<T> {
	Optional<T> save(T t);
	Optional<List<T>> saveAll(List<T> t);
	Optional<T> update(T t);
	Optional<List<T>> findAll();
//	T findByID(int id);
}