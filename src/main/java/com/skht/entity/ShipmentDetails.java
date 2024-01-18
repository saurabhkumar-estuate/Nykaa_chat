package com.skht.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShipmentDetails {
    @Value(value = "")
    private String awbNo;
    @Value(value = "")
    private String courierName;
    @Value(value = "")
    private String estimatedDeliveryDate;
    @Value(value = "")
    private String latestEstimatedDeliveryDate;
    @Value(value = "")
    private String deliveredDate;
    @Value(value = "")
    private String clickpostUrl;
    @Value(value = "")
    private String shipmentStatus;
    @Value(value = "")
    private String transpoterStatus;

}
