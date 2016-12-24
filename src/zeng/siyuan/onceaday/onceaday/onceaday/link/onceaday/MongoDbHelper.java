package zeng.siyuan.onceaday.onceaday.onceaday.link.onceaday;

import com.mongodb.*;

import java.net.UnknownHostException;

public class MongoDbHelper {
    private static MongoDbHelper instance;
    private DB database;

    private MongoDbHelper() throws UnknownHostException {
        MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017));
        database = mongoClient.getDB("test");
    }

    public static MongoDbHelper getInstance() throws UnknownHostException {
        if (instance == null) {
            instance = new MongoDbHelper();
        }

        return instance;
    }

    public DBObject findOne(final String _collectionName) {
        DBCollection collection = database.getCollection(_collectionName);

        return collection.findOne();
    }

    public DBObject findOne(final String _collectionName, final DBObject _object) {
        DBCollection collection = database.getCollection(_collectionName);

        return collection.findOne(_object);
    }

    public DBCursor findAll(final String _collectionName) {
        DBCollection collection = database.getCollection(_collectionName);

        return collection.find();
    }

    public long count(final String _collectionName) {
        DBCollection collection = database.getCollection(_collectionName);

        return collection.count();
    }

    public DBCursor findByCriteria(final String _collectionName, final DBObject _query) {
        DBCollection collection = database.getCollection(_collectionName);

        return collection.find(_query);
    }

    public void insertDocument(final String _collectionName, final DBObject _object) {
        DBCollection collection = database.getCollection(_collectionName);
        collection.insert(_object);
    }

    public void updateDocument(final String _collectionName, final DBObject _queryObject, final DBObject _updateObject) {
        DBCollection collection = database.getCollection(_collectionName);
        collection.update(_queryObject, _updateObject);
    }

    public void removeDocument(final String _collectionName, final DBObject _object) {
        DBCollection collection = database.getCollection(_collectionName);
        collection.remove(_object);
    }

    public void dropCollection(final String _collectionName) {
        DBCollection collection = database.getCollection(_collectionName);
        collection.drop();
    }
}
