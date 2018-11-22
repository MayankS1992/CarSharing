package dao.login;

import com.mongodb.*;
import entities.User;

public class LoginDAO implements ILoginDAO {
    DB database;

    public LoginDAO(DB db) {
        database = db;
    }

    public DBCursor getUserDetails(User user) {

        DBCollection col = database.getCollection("users");
        DBObject query = new BasicDBObject();
        query.put("email", user.getEmail());
        DBCursor cursor = col.find();
        cursor.close();
        return cursor;

    }

    @Override
    public boolean registerUser(User user) {

        DBCollection col = database.getCollection("users");
        BasicDBObjectBuilder documentBuilder = BasicDBObjectBuilder.start()
                .add("admin", false)
                .add("email", user.getEmail())
                .add("name",user.getFullName())
                .add("username",user.getUsername())
                .add("password",user.getPassword());
        col.insert(documentBuilder.get());
        return true;
    }
}
