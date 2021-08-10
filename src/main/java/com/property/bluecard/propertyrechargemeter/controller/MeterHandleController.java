package com.property.bluecard.propertyrechargemeter.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.property.bluecard.propertyrechargemeter.common.JsonResult;
import com.property.bluecard.propertyrechargemeter.generator.service.EeimYgdService;
import com.property.bluecard.propertyrechargemeter.generator.service.MeterService;
import com.property.bluecard.propertyrechargemeter.model.MeterInfoModel;
import com.property.bluecard.propertyrechargemeter.model.MeterInfoQuery;
import com.property.bluecard.propertyrechargemeter.model.PurchaseInfoModel;
import com.property.bluecard.propertyrechargemeter.model.PurchaseQuery;
import com.property.bluecard.propertyrechargemeter.util.JacksonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/meter")
@Slf4j
public class MeterHandleController {

    @Autowired
    EeimYgdService eeimYgdService;

    @Autowired
    MeterService meterService;

    @PostMapping (value = "/getMeterInfo")
    public JsonResult<List<MeterInfoModel>> getMeterInfo(@RequestBody MeterInfoQuery meterInfoQuery)  {
        log.info("获取表计信息，入参:{}", JacksonUtil.fromObjectToJson(meterInfoQuery));
        IPage<MeterInfoModel> meterInfoModelList = meterService.getMeterInfoModelList(meterInfoQuery);
        List<MeterInfoModel> page = meterInfoModelList.getRecords();
        long pages = meterInfoModelList.getPages();
        log.info("获取表计信息，出参:{}", JacksonUtil.fromObjectToJson(page));
        return JsonResult.ok(page, pages);
    }

    @PostMapping (value = "/savePurchaseInfo")
    public JsonResult<Boolean> savePurchaseInfo(@RequestBody PurchaseInfoModel purchaseInfoModel)  {
        log.info("存储购电详情，入参:{}", JacksonUtil.fromObjectToJson(purchaseInfoModel));
        boolean b = eeimYgdService.savePurchaseInfo(purchaseInfoModel);
        log.info("存储购电详情，出参: {}", JacksonUtil.fromObjectToJson(b));
        return JsonResult.ok(b);
    }


    @PostMapping (value = "/queryPurchaseResult")
    public JsonResult<List<PurchaseInfoModel>> queryPurchaseResult(@RequestBody PurchaseQuery purchaseQuery)  {
        log.info("查询购电充值结果，入参:{}", JacksonUtil.fromObjectToJson(null));
        List<PurchaseInfoModel> list = eeimYgdService.queryPurchaseResult(purchaseQuery);
        log.info("查询购电充值结果，出参: {}", JacksonUtil.fromObjectToJson(list));
        return JsonResult.ok(list);
    }


}
