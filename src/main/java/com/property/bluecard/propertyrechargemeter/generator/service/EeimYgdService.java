package com.property.bluecard.propertyrechargemeter.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.property.bluecard.propertyrechargemeter.generator.domain.EeimYgd;

/**
*
*/
public interface EeimYgdService extends IService<EeimYgd> {

    boolean saveAndUpdate();
}
