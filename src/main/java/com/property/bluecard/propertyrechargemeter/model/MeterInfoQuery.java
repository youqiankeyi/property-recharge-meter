package com.property.bluecard.propertyrechargemeter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MeterInfoQuery {

    /**
     *  数据查询限制1
     */
    private int pageNum;


    /**
     *  数据查询限制2
     */
    private int pageSize;
}
