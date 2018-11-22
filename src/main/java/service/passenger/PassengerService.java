package service.passenger;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import dao.passenger.IPassengerDAO;
import entities.Trip;
import entities.TripID;
import org.joda.time.DateTime;

import javax.money.MonetaryAmount;
import java.util.Iterator;
import java.util.List;

public class PassengerService implements IPassengerService {
    IPassengerDAO cars;
    public PassengerService(IPassengerDAO carsDAO) {this.cars=carsDAO;}

    /**
     * @param username
     * @param tripID
     * @return
     */
    @Override
    public Boolean requestCarPool(String username, String tripID) {
        /*Get Trip Details for Trip ID*/
        DBCursor tripDetails = cars.getTripDetails(tripID);
        /*Get Number of CoPassengers*/
        List number_copassengers = cars.numberOfCopassengers(tripID);

        Iterator<DBObject> fields = tripDetails.iterator();
        while(fields.hasNext()){
            /*Pre-Condition to Use Contract*/
            if(Integer.valueOf((String) fields.next().get("MaximumCopassengers")) > number_copassengers.size())
            {
                /*Insert new Copassenger */
                return cars.insertCoPassenger(username,tripID);
            }
        }
        return false;
    }

   /* *//**
     * @param origin
     * @param destination
     *//*
    @Override
    public void viewCarPools(String origin, String destination) {
        DBCursor availableCars = cars.viewAvailableCars(origin,destination);
        Iterator<DBObject> fields = availableCars.iterator();
        Trip trip = new Trip();
        while(fields.hasNext()){
            String trip_origin = (String) fields.next().get("origin");
            String trip_destination = (String) fields.next().get("origin");
            String availableSeats = (String) fields.next().get("MaximumCopassengers");
            String status = (String) fields.next().get("status");
            MonetaryAmount fare = (MonetaryAmount) fields.next().get("TotalEstimatedFare");
            DateTime dateTime = fields.next("date");
            *//*Available trips*//*
            if(trip_origin.equals(origin) && trip_destination.equals(destination) && Integer.parseInt(availableSeats)>0 && status.equals("SCHEDULED"))
            {
                trip.setTripID((TripID) fields.next().get("tripID"));
                trip.setOrigin(trip_origin);
                trip.setDestination(trip_destination);
                trip.setPoolFare(fare.divide(2.0));
                trip.setTravelTime(fields.next("travelTime").getClass());
            }
        }*/
    }
