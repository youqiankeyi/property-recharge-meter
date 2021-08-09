package com.property.bluecard.propertyrechargemeter.controller;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping (value = "/getTotalMeterInfo")
    public JsonResult getTotalMeterInfo()  {
        log.info("获取表计条数，入参:{}", JacksonUtil.fromObjectToJson(null));
        List<MeterInfoModel> list = new ArrayList<>();
        int totalMeter = meterService.getTotalMeter();
        log.info("获取表计条数，出参:{}", JacksonUtil.fromObjectToJson(totalMeter));
        return JsonResult.ok(totalMeter);
    }

    @PostMapping (value = "/getMeterInfo")
    public JsonResult<List<MeterInfoModel>> getMeterInfo(@RequestBody MeterInfoQuery meterInfoQuery)  {
        log.info("获取表计信息，入参:{}", JacksonUtil.fromObjectToJson(meterInfoQuery));
        List<MeterInfoModel> list = meterService.getMeterInfoModelList(meterInfoQuery);
        log.info("获取表计信息，出参:{}", JacksonUtil.fromObjectToJson(list));
        return JsonResult.ok(list);
    }

    @PostMapping (value = "/savePurchaseInfo")
    public JsonResult savePurchaseInfo(@RequestBody PurchaseInfoModel purchaseInfoModel)  {
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
