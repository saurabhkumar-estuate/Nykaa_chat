package com.skht.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetails {
    @Value(value = "")
    private Integer customerId;
    @Value(value = "")
    private String customerName;
    @Value(value = "")
    private String priveLevel;
    @Value(value = "")
    private String orderNo;
    @Value(value = "")
    private String orderStatus;
    @Value(value = "")
    private String paymentType;
    @Value(value = "")
    private String paymentStatus;
    @Value(value = "")
    private String privacyPolicyPageLink;
    @Value(value = "")
    private String cancellationPolicyPageLink;
    @Value(value = "")
    private String shippingPolicyPageLink;
    @Value(value = "")
    private String myOrderPageLink;
    @Value(value = "")
    private String loginPageLink;
    @Value(value = "")
    private List<Items> items;
/*
    @Value(value = "")
    private List<Refunds> refunds;
*/
    @Value(value = "false")
    private boolean priveUser;
    @Value(value = "false")
    private boolean addressEditable;
}
