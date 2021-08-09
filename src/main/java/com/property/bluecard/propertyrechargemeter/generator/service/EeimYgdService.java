package com.property.bluecard.propertyrechargemeter.generator.service;

import com.property.bluecard.propertyrechargemeter.generator.domain.EeimYgd;
import com.baomidou.mybatisplus.extension.service.IService;
import com.property.bluecard.propertyrechargemeter.model.PurchaseInfoModel;
import com.property.bluecard.propertyrechargemeter.model.PurchaseQuery;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 *
 */
public interface EeimYgdService extends IService<EeimYgd> {

    /**
     * 存储购电信息
     * @param purchaseInfoModel
     * @return
     */
    Boolean savePurchaseInfo(PurchaseInfoModel purchaseInfoModel);

    /**
     * 查询购电配置结果
     * @param purchaseQuery
     * @return
     */
    List<PurchaseInfoModel> queryPurchaseResult(PurchaseQuery purchaseQuery);
}
