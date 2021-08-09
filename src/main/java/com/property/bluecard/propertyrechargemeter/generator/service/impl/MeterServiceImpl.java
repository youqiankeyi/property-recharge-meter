package com.property.bluecard.propertyrechargemeter.generator.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
import java.util.stream.Collectors;

/**
*
*/
@Service
public class MeterServiceImpl extends ServiceImpl<MeterMapper, Meter>
implements MeterService{


    @Override
    public int getTotalMeter() {
        return this.count();
    }

    @Override
    public List<MeterInfoModel> getMeterInfoModelList(MeterInfoQuery meterInfoQuery) {
        List<MeterInfoModel> meterInfoModels = new ArrayList<>();
        QueryWrapper<Meter> queryWrapper = new QueryWrapper<>();
        queryWrapper.last("limit " + meterInfoQuery.getLimitFirst() + "," + meterInfoQuery.getLimitSecond());
        List<Meter> list = this.list(queryWrapper);
        if(!CollectionUtils.isEmpty(list)){
            list.forEach(m -> {
                MeterInfoModel meterInfoModel = new MeterInfoModel();
                BeanUtils.copyProperties(m, meterInfoModel);
                meterInfoModels.add(meterInfoModel);
            });

        }
        return meterInfoModels;
    }

}
