package com.property.bluecard.propertyrechargemeter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseQuery {

    /**
     *  用户编号
     */
    private String inUserNo;


    /**
     *  购电日期
     */
    private String paydate;
}
