package com.property.bluecard.propertyrechargemeter.controller;

import com.property.bluecard.propertyrechargemeter.common.JsonResult;
import com.property.bluecard.propertyrechargemeter.util.JacksonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/meter")
@Slf4j
public class MeterHandleController {

    @GetMapping(value = "/getMeterInfo")
    public JsonResult getMeterInfo()  {
        log.info("model.json:{}", JacksonUtil.fromObjectToJson(null));

        log.info("id: {}", JacksonUtil.fromObjectToJson("id"));
        return JsonResult.ok("id");
    }
}
