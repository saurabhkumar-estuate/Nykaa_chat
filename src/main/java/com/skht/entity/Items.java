package com.skht.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Items {

    @Value(value = "")
    private String itemName;
    @Value(value = "")
    private String itemStatus;
    @Value(value = "")
    private String itemSku;
    @Value(value = "")
    private String itemImage;
    @Value(value = "")
    private String promisedItemDeliveryDate;
    @Value(value = "")
    private String cancelItemLink;
    @Value(value = "")
    private String replaceScreenUrl;
    @Value(value = "")
    private String returnScreenUrl;
    @Value(value = "")
    private Integer refundAmount;
    @Value(value = "")
    private Integer totalRefundAmount;
    @Value(value = "")
    private String returnStatus;
    @Value(value = "")
    private String refundType;
    @Value(value = "")
    private String returnReason;
    @Value(value = "")
    private String returnCreatedBy;
    @Value(value = "")
    private String returnCreateTimestamp;
    @Value(value = "")
    private String approvedBy;
    @Value(value = "")
    private String approvedOn;
    @Value(value = "")
    private String rejectedBy;
    @Value(value = "")
    private String rejectedOn;
    @Value(value = "")
    private Integer retainedAmount;
    @Value(value = "")
    private LocalDate currentDate;
    private List<ShipmentDetails> shipmentDetails;
    @Value(value = "false")
    private boolean itemCancellable;
    @Value(value = "false")
    private boolean itemReplaceable;
    @Value(value = "false")
    private boolean itemReturnable;
    @Value(value = "false")
    private boolean cancellationUserInitiated;

}
