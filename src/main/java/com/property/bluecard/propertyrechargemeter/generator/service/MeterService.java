package com.property.bluecard.propertyrechargemeter.generator.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.property.bluecard.propertyrechargemeter.generator.domain.Meter;
import com.property.bluecard.propertyrechargemeter.model.MeterInfoModel;
import com.property.bluecard.propertyrechargemeter.model.MeterInfoQuery;

/**
*
*/
public interface MeterService extends IService<Meter> {


    /**
     * 获取表计信息
     * @param meterInfoQuery
     * @return
     */
    IPage<MeterInfoModel> getMeterInfoModelList(MeterInfoQuery meterInfoQuery);


}
