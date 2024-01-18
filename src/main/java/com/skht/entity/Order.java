package com.skht.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Integer orderId;
    private String orderName;
    @Value(value = "")
    private String orderStatus;
    @Value(value = "")
    private Integer refundAmount;

}
