package com.property.bluecard.propertyrechargemeter.generator.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 
 * @TableName EEIM_YGD
 */
@Data
public class EeimYgd implements Serializable {
    /**
     * 
     */
//    @TableId(value = "user_id",type = IdType.AUTO)
    private String inUserNo;

    /**
     *
     */
    private String meterNum;

    /**
     *
     */
    private String paydate;

    /**
     *
     */
    private String mon;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String symbol;

    /**
     * 
     */
    private Integer monSn;

    /**
     * 
     */
    private String inSUuid;

    /**
     * 
     */
    private String inSRv;

    /**
     * 
     */
    private String inFUuid;

    /**
     * 
     */
    private String inCheckNo;

    /**
     * 
     */
    private String inInvoiceNo;

    /**
     * 
     */
    private String inChgOperatorId;

    /**
     * 
     */
    private BigDecimal inMoney;

    /**
     * 
     */
    private String inHandleMode;

    /**
     * 
     */
    private String inReceivedMode;

    /**
     * 
     */
    private String inBalancedMode;

    /**
     * 
     */
    private String inBalancedRemark;

    /**
     * 
     */
    private String inChargedType;

    /**
     * 
     */
    private String outChargedFlag;

    /**
     * 
     */
    private String businessAreaCode;

    /**
     * 
     */
    private String copyMeterSectNo;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        EeimYgd other = (EeimYgd) that;
        return (this.getInUserNo() == null ? other.getInUserNo() == null : this.getInUserNo().equals(other.getInUserNo()))
            && (this.getMeterNum() == null ? other.getMeterNum() == null : this.getMeterNum().equals(other.getMeterNum()))
            && (this.getPaydate() == null ? other.getPaydate() == null : this.getPaydate().equals(other.getPaydate()))
            && (this.getMon() == null ? other.getMon() == null : this.getMon().equals(other.getMon()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getSymbol() == null ? other.getSymbol() == null : this.getSymbol().equals(other.getSymbol()))
            && (this.getMonSn() == null ? other.getMonSn() == null : this.getMonSn().equals(other.getMonSn()))
            && (this.getInSUuid() == null ? other.getInSUuid() == null : this.getInSUuid().equals(other.getInSUuid()))
            && (this.getInSRv() == null ? other.getInSRv() == null : this.getInSRv().equals(other.getInSRv()))
            && (this.getInFUuid() == null ? other.getInFUuid() == null : this.getInFUuid().equals(other.getInFUuid()))
            && (this.getInCheckNo() == null ? other.getInCheckNo() == null : this.getInCheckNo().equals(other.getInCheckNo()))
            && (this.getInInvoiceNo() == null ? other.getInInvoiceNo() == null : this.getInInvoiceNo().equals(other.getInInvoiceNo()))
            && (this.getInChgOperatorId() == null ? other.getInChgOperatorId() == null : this.getInChgOperatorId().equals(other.getInChgOperatorId()))
            && (this.getInMoney() == null ? other.getInMoney() == null : this.getInMoney().equals(other.getInMoney()))
            && (this.getInHandleMode() == null ? other.getInHandleMode() == null : this.getInHandleMode().equals(other.getInHandleMode()))
            && (this.getInReceivedMode() == null ? other.getInReceivedMode() == null : this.getInReceivedMode().equals(other.getInReceivedMode()))
            && (this.getInBalancedMode() == null ? other.getInBalancedMode() == null : this.getInBalancedMode().equals(other.getInBalancedMode()))
            && (this.getInBalancedRemark() == null ? other.getInBalancedRemark() == null : this.getInBalancedRemark().equals(other.getInBalancedRemark()))
            && (this.getInChargedType() == null ? other.getInChargedType() == null : this.getInChargedType().equals(other.getInChargedType()))
            && (this.getOutChargedFlag() == null ? other.getOutChargedFlag() == null : this.getOutChargedFlag().equals(other.getOutChargedFlag()))
            && (this.getBusinessAreaCode() == null ? other.getBusinessAreaCode() == null : this.getBusinessAreaCode().equals(other.getBusinessAreaCode()))
            && (this.getCopyMeterSectNo() == null ? other.getCopyMeterSectNo() == null : this.getCopyMeterSectNo().equals(other.getCopyMeterSectNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInUserNo() == null) ? 0 : getInUserNo().hashCode());
        result = prime * result + ((getMeterNum() == null) ? 0 : getMeterNum().hashCode());
        result = prime * result + ((getPaydate() == null) ? 0 : getPaydate().hashCode());
        result = prime * result + ((getMon() == null) ? 0 : getMon().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getSymbol() == null) ? 0 : getSymbol().hashCode());
        result = prime * result + ((getMonSn() == null) ? 0 : getMonSn().hashCode());
        result = prime * result + ((getInSUuid() == null) ? 0 : getInSUuid().hashCode());
        result = prime * result + ((getInSRv() == null) ? 0 : getInSRv().hashCode());
        result = prime * result + ((getInFUuid() == null) ? 0 : getInFUuid().hashCode());
        result = prime * result + ((getInCheckNo() == null) ? 0 : getInCheckNo().hashCode());
        result = prime * result + ((getInInvoiceNo() == null) ? 0 : getInInvoiceNo().hashCode());
        result = prime * result + ((getInChgOperatorId() == null) ? 0 : getInChgOperatorId().hashCode());
        result = prime * result + ((getInMoney() == null) ? 0 : getInMoney().hashCode());
        result = prime * result + ((getInHandleMode() == null) ? 0 : getInHandleMode().hashCode());
        result = prime * result + ((getInReceivedMode() == null) ? 0 : getInReceivedMode().hashCode());
        result = prime * result + ((getInBalancedMode() == null) ? 0 : getInBalancedMode().hashCode());
        result = prime * result + ((getInBalancedRemark() == null) ? 0 : getInBalancedRemark().hashCode());
        result = prime * result + ((getInChargedType() == null) ? 0 : getInChargedType().hashCode());
        result = prime * result + ((getOutChargedFlag() == null) ? 0 : getOutChargedFlag().hashCode());
        result = prime * result + ((getBusinessAreaCode() == null) ? 0 : getBusinessAreaCode().hashCode());
        result = prime * result + ((getCopyMeterSectNo() == null) ? 0 : getCopyMeterSectNo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", inUserNo=").append(inUserNo);
        sb.append(", meterNum=").append(meterNum);
        sb.append(", paydate=").append(paydate);
        sb.append(", mon=").append(mon);
        sb.append(", userName=").append(userName);
        sb.append(", symbol=").append(symbol);
        sb.append(", monSn=").append(monSn);
        sb.append(", inSUuid=").append(inSUuid);
        sb.append(", inSRv=").append(inSRv);
        sb.append(", inFUuid=").append(inFUuid);
        sb.append(", inCheckNo=").append(inCheckNo);
        sb.append(", inInvoiceNo=").append(inInvoiceNo);
        sb.append(", inChgOperatorId=").append(inChgOperatorId);
        sb.append(", inMoney=").append(inMoney);
        sb.append(", inHandleMode=").append(inHandleMode);
        sb.append(", inReceivedMode=").append(inReceivedMode);
        sb.append(", inBalancedMode=").append(inBalancedMode);
        sb.append(", inBalancedRemark=").append(inBalancedRemark);
        sb.append(", inChargedType=").append(inChargedType);
        sb.append(", outChargedFlag=").append(outChargedFlag);
        sb.append(", businessAreaCode=").append(businessAreaCode);
        sb.append(", copyMeterSectNo=").append(copyMeterSectNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}