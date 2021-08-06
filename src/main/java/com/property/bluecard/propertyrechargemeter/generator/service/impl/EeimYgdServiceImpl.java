package com.property.bluecard.propertyrechargemeter.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.property.bluecard.propertyrechargemeter.generator.domain.EeimYgd;
import com.property.bluecard.propertyrechargemeter.generator.mapper.EeimYgdMapper;
import com.property.bluecard.propertyrechargemeter.generator.service.EeimYgdService;
import org.springframework.stereotype.Service;

/**
*
*/
@Service
public class EeimYgdServiceImpl extends ServiceImpl<EeimYgdMapper, EeimYgd>
implements EeimYgdService {

    @Override
    public boolean saveAndUpdate() {
        EeimYgd eeimYgd = new EeimYgd();
        eeimYgd.setUserName("1111");
        eeimYgd.setInUserNo("add");
        eeimYgd.setMeterNum("223");
        eeimYgd.setPaydate("2021-02-19");
        boolean save = this.save(eeimYgd);
        return save;
    }
}
