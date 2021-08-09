package com.property.bluecard.propertyrechargemeter.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.property.bluecard.propertyrechargemeter.generator.domain.Meter;
import com.property.bluecard.propertyrechargemeter.model.MeterInfoModel;
import com.property.bluecard.propertyrechargemeter.model.MeterInfoQuery;

import java.util.List;

/**
*
*/
public interface MeterService extends IService<Meter> {

    /**
     * 获取表计信息总条数
     * @return
     */
    int getTotalMeter();

    /**
     * 获取表计信息
     * @param meterInfoQuery
     * @return
     */
    List<MeterInfoModel> getMeterInfoModelList(MeterInfoQuery meterInfoQuery);


}
