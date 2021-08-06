package com.property.bluecard.propertyrechargemeter.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.property.bluecard.propertyrechargemeter.common.JsonResult;
import com.property.bluecard.propertyrechargemeter.model.MeterInfoModel;
import com.property.bluecard.propertyrechargemeter.model.PurchaseQuery;
import com.property.bluecard.propertyrechargemeter.util.JacksonUtil;
import com.property.bluecard.propertyrechargemeter.generator.service.EeimYgdService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/meter")
@Slf4j
public class MeterHandleController {

    @Autowired
    EeimYgdService eeimYgdService;

    @GetMapping (value = "/getMeterInfo")
    public JsonResult<IPage<MeterInfoModel>> getMeterInfo()  {
        log.info("获取表计信息，入参:{}", JacksonUtil.fromObjectToJson(null));
        IPage<MeterInfoModel> infoModelIPage = new Page<>();
        boolean b = eeimYgdService.saveAndUpdate();
        log.info("获取表计信息，出参:{}", JacksonUtil.fromObjectToJson(b));
        return JsonResult.ok(infoModelIPage);
    }

    @PostMapping (value = "/savePurchaseInfo")
    public JsonResult savePurchaseInfo()  {
        log.info("存储购电详情，入参:{}", JacksonUtil.fromObjectToJson(null));
        boolean b = eeimYgdService.saveAndUpdate();
        log.info("存储购电详情，出参: {}", JacksonUtil.fromObjectToJson(b));
        return JsonResult.ok("222");
    }


    @GetMapping (value = "/queryPurchaseResult")
    public JsonResult queryPurchaseResult(@RequestBody PurchaseQuery query)  {
        log.info("查询购电充值结果，入参:{}", JacksonUtil.fromObjectToJson(null));
        boolean b = eeimYgdService.saveAndUpdate();
        log.info("查询购电充值结果，出参: {}", JacksonUtil.fromObjectToJson(b));
        return JsonResult.ok("333");
    }


}
