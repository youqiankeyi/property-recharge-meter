package com.property.bluecard.propertyrechargemeter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseQuery {
    /**
     *  业务方关联流水号
     */
    private List<String> inFUuids;

}
