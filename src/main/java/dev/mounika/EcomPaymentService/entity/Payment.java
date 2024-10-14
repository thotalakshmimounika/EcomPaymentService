package dev.mounika.EcomPaymentService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Payment extends BaseModel{
    private double amount;
    private UUID userid;
    private UUID orderid;
    private String transactionid;
    @Enumerated(EnumType.STRING)
    private  PaymentStatus paymentstatus;
    @OneToOne
    private Currency currency;


}
