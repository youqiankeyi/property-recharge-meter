package com.property.bluecard.propertyrechargemeter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MeterInfoModel {

    /**
     *  表计唯一标识（用户编号）对应购电信息表 IN_USER_NO 字段
     */
    private Integer mId;

    /**
     *  营业所代码 对应购电信息表 BUSINESS_AREA_CODE 字段
     */
    private Integer extentCode;

    /**
     * 客户编码
     */
    private String userId;

    /**
     * 客户姓名
     */
    private String userName;

    /**
     * 地址
     */
    private String userAddr;

    /**
     * 客户电话
     */
    private String userPhon;

    /**
     * 表计编号
     */
    private String meterNum;

    /**
     * 卡号
     */
    private String cardId;

    /**
     *  停用标志（stop_flag）为true表示电表停用，数据不可用
     */
    private Boolean stopFlag;

    /**
     *  购电次数
     */
    private Integer payNum;

    /**
     *  开户标志（Started）为true表示电表已经开户，可以正常售电
     */
    private Boolean started;

    /**
     *  注销标志（Logout）为true表示用户已经注销，数据不可用
     */
    private Boolean logout;
}
