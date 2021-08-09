package com.property.bluecard.propertyrechargemeter.generator.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.property.bluecard.propertyrechargemeter.generator.domain.EeimYgd;
import com.property.bluecard.propertyrechargemeter.generator.mapper.EeimYgdMapper;
import com.property.bluecard.propertyrechargemeter.generator.service.EeimYgdService;
import com.property.bluecard.propertyrechargemeter.model.PurchaseInfoModel;
import com.property.bluecard.propertyrechargemeter.model.PurchaseQuery;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Service
public class EeimYgdServiceImpl extends ServiceImpl<EeimYgdMapper, EeimYgd>
    implements EeimYgdService{

    @Override
    public Boolean savePurchaseInfo(PurchaseInfoModel purchaseInfoModel) {
        if(null == purchaseInfoModel){
            return false;
        }
        EeimYgd eeimYgd = new EeimYgd();
        BeanUtils.copyProperties(purchaseInfoModel, eeimYgd);
        return this.save(eeimYgd);
    }

    @Override
    public List<PurchaseInfoModel> queryPurchaseResult(PurchaseQuery purchaseQuery) {
        List<PurchaseInfoModel> purchaseInfoModels = new ArrayList<>();
        QueryWrapper<EeimYgd> queryWrapper = new QueryWrapper<>();
        if(StringUtils.isNotBlank(purchaseQuery.getInUserNo())){
            queryWrapper.eq("IN_USER_NO", purchaseQuery.getInUserNo());
        }
        if(StringUtils.isNotBlank(purchaseQuery.getPaydate())){
            queryWrapper.eq("PAYDATE", purchaseQuery.getPaydate());
        }
        List<EeimYgd> list = this.list(queryWrapper);
        if(!CollectionUtils.isEmpty(list)){
            list.forEach(p -> {
                PurchaseInfoModel purchaseInfoModel = new PurchaseInfoModel();
                BeanUtils.copyProperties(p, purchaseInfoModel);
                purchaseInfoModels.add(purchaseInfoModel);
            });

        }
        return purchaseInfoModels;
    }
}




