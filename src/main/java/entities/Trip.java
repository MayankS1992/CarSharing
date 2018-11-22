package entities;

import lombok.Data;
import org.joda.time.DateTime;
import sun.security.x509.UniqueIdentity;

import javax.money.MonetaryAmount;
import java.text.DateFormat;
import java.util.List;

@Data
public class Trip {
    //Booking ID
    TripID tripID;
    //Trip Origin
    String origin;
    //Trip Destination
    String destination;
    //Start Time
    DateTime travelTime;
    //User ID
    String username;
    //CoPassenger Details List
    List<CoPassenger> coPassengers;
    //Trip Status
    TripStatus status;

    MonetaryAmount tripExpenditure;

    MonetaryAmount poolFare;

    int availableSeats;

    private enum TripStatus {SCHEDULED,STARTED,COMPLETED,CANCELLED}
    }
