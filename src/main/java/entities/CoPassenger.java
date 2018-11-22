package entities;

import lombok.Data;

import javax.money.MonetaryAmount;

@Data
public class CoPassenger {
    String userID;
    MonetaryAmount fare;
}
