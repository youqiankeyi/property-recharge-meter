package com.property.bluecard.propertyrechargemeter.generator.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @TableName EEIM_YGD
 */
@TableName(value ="EEIM_YGD")
@Data
public class EeimYgd implements Serializable {

    /**
     *  用户编号
     */
    @TableId
    private String inUserNo;

    /**
     * 营业所编号
     */
    private String businessAreaCode;

    /**
     *  购电日期
     */
    private String paydate;

    /**
     *  月份
     */
    private String mon;

    /**
     *  客户姓名
     */
    private String userName;

    /**
     *  表号
     */
    private String meterNum;

    /**
     *  购电金额
     */
    private BigDecimal paymoney;

    /**
     *  购电次数
     */
    private Integer payNum;

    /**
     *  标志位
     *  标志位全部默认为0
     *  1---------接收数据成功
     *  2---------接收数据不成功
     */
    private String symbol;


    /**
     *  非必填，系统内的流水号，方便对账用
     *  售电方保证前台产生的实收的uuid（in_f_uuid）唯一
     */
    private String inFUuid;

}