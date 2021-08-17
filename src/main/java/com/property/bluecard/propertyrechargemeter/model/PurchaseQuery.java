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

    /**
     *  标志位
     *  标志位全部默认为0
     *  1---------接收数据成功
     *  2---------接收数据不成功
     */
    private String symbol;

}
