package com.property.bluecard.propertyrechargemeter.generator.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.property.bluecard.propertyrechargemeter.generator.domain.Meter;
import com.property.bluecard.propertyrechargemeter.generator.mapper.MeterMapper;
import com.property.bluecard.propertyrechargemeter.generator.service.MeterService;
import com.property.bluecard.propertyrechargemeter.model.MeterInfoModel;
import com.property.bluecard.propertyrechargemeter.model.MeterInfoQuery;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
*
*/
@Service
public class MeterServiceImpl extends ServiceImpl<MeterMapper, Meter>
implements MeterService{

    @Override
    public IPage<MeterInfoModel> getMeterInfoModelList(MeterInfoQuery meterInfoQuery) {
        IPage<Meter> pageQuery = new Page(meterInfoQuery.getPageNum(),meterInfoQuery.getPageSize());
        IPage<MeterInfoModel> page = this.page(pageQuery).convert(m -> {
            MeterInfoModel meterInfoModel = new MeterInfoModel();
            BeanUtils.copyProperties(m, meterInfoModel);
            return meterInfoModel;
        });

        return page;
    }

}
