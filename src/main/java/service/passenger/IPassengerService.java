package service.passenger;

public interface IPassengerService {
    /**
     *
     * @param username
     * @param tripID
     * @return
     */
    Boolean requestCarPool(String username, String tripID);

    /**
     *
     * @param origin
     * @param destination
     */
   // void viewCarPools(String origin, String destination);
}
