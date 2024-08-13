package utility;

import entities.BaseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DatabaseManager<T extends BaseEntity> implements ICRUD<T> {
	protected ArrayList<T> veriListesi = new ArrayList<>();
	
	@Override
	public Optional<T> save(T t) {
		if (veriListesi.add(t)) {
			return Optional.of(t);
		} else {
			return Optional.empty();
		}
	}
	
	@Override
	public Optional<List<T>> saveAll(List<T> t) {
		if (veriListesi.addAll(t)) {
			return Optional.of(t);
		} else {
			return Optional.empty();
		}
	}
	
	@Override
	public Optional<T> update(T t) {
		int index = veriListesi.indexOf(t);
		if(index>=0){
			return Optional.of(veriListesi.set(index,t));
		}
		return Optional.empty();
	}
	
	@Override
	public Optional<List<T>> findAll() {
		if(veriListesi.isEmpty()){
			return Optional.empty();
		}
		else{
			return Optional.of(veriListesi);
		}
	}
	
//	@Override
//	public T findByID(int id) {
//		for (T entity : veriListesi ){
//			if(entity.getId() == id){
//				return entity;
//			}
//		}
//		return null;
//	}
}