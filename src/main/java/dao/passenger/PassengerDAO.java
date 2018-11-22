package dao.passenger;

import com.mongodb.*;
import dao.daoUtility.IMongoDatabaseUtility;

import java.util.List;

public class PassengerDAO implements IPassengerDAO {
    DB database;
    IMongoDatabaseUtility utility;
    public PassengerDAO(DB db) {database = db;}

    /**
     * Gets the Details of the Trip for the given ID.
     *
     * @param tripID
     * @return
     */
    @Override
    public DBCursor getTripDetails(String tripID) {
        DBCursor cursor = utility.cursor(database,"travel","tripID","tripID");
        return cursor;
    }

    @Override
    public List numberOfCopassengers(String tripID) {
        List distinctFields = utility.distinctFields(database,"travel","copassengers.username");
        return distinctFields;
    }

    /**
     * Insert a coPassenger for a given tripID
     *
     * @param username
     * @param tripID
     * @return
     */
    @Override
    public Boolean insertCoPassenger(String username, String tripID) {
        DBCollection col = database.getCollection("travel");
        BasicDBObjectBuilder documentBuilder = BasicDBObjectBuilder.start()
                .add("copassengers.username", username)
                .add("fare","50");
        col.insert(documentBuilder.get());
        return true;
    }

    /**
     * @param origin
     * @param destination
     * @return
     */
    @Override
    public DBCursor viewAvailableCars(String origin, String destination) {
        return null;
    }
}
