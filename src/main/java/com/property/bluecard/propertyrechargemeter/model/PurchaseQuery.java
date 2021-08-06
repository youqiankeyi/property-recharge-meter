package com.property.bluecard.propertyrechargemeter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseQuery {

    private String inUserNo;

    /**
     *
     */
    private String meterNum;

    /**
     *
     */
    private String mon;
}
