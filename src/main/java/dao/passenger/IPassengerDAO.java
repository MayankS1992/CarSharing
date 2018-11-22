package dao.passenger;

import com.mongodb.DBCursor;

import java.util.List;

public interface IPassengerDAO {
    /**
     * Gets the Details of the Trip for the given ID.
     * @param tripID
     * @return
     */
    DBCursor getTripDetails(String tripID);

    /**
     * Get the List of Copassengers
     * @param tripID
     * @return
     */
    List numberOfCopassengers(String tripID);

    /**
     * Insert a coPassenger for a given tripID
     * @param username
     * @param tripID
     * @return
     */
    Boolean insertCoPassenger(String username, String tripID);

    /**
     *
     * @param origin
     * @param destination
     * @return
     */
    DBCursor viewAvailableCars(String origin, String destination);
}
