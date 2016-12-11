package mongodb.dto;

import org.bson.Document;

import java.util.Iterator;

public interface ICrud<T> {

	void create(T obj);
	Iterator<Document> read(T obj);
	void update(T obj);
	void delete(T obj);

}
