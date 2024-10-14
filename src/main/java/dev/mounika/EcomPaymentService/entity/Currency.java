package dev.mounika.EcomPaymentService.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Currency extends BaseModel{
    private String currencyname;
    private String currencyTag; // INR, USD, EUR
    private String country;

}
