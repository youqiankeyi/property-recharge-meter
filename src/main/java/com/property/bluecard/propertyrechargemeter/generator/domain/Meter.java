package com.property.bluecard.propertyrechargemeter.generator.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName Meter
 */
@Data
public class Meter implements Serializable {
    /**
     * 
     */
    private Integer mId;

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer extentCode;

    /**
     * 
     */
    private Integer rtuId;

    /**
     * 
     */
    private Integer sectId;

    /**
     * 
     */
    private Integer subsectId;

    /**
     * 
     */
    private Integer tranId;

    /**
     * 
     */
    private String userId;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String userAddr;

    /**
     * 
     */
    private String userPhon;

    /**
     * 
     */
    private String userActn;

    /**
     * 
     */
    private Byte bankId;

    /**
     * 
     */
    private String meterNum;

    /**
     * 
     */
    private String assetofnum;

    /**
     * 
     */
    private String meterId;

    /**
     * 
     */
    private String cardId;

    /**
     * 
     */
    private String barcode;

    /**
     * 
     */
    private Float basemny;

    /**
     * 
     */
    private Byte mtypeid;

    /**
     * 
     */
    private Byte userType;

    /**
     * 
     */
    private Integer mult;

    /**
     * 
     */
    private Boolean stopFlag;

    /**
     * 
     */
    private Boolean started;

    /**
     * 
     */
    private Byte protocol;

    /**
     * 
     */
    private Byte dataType;

    /**
     * 
     */
    private String relayId;

    /**
     * 
     */
    private Integer boxNo;

    /**
     * 
     */
    private Integer lineNo;

    /**
     * 
     */
    private Byte phaseNo;

    /**
     * 
     */
    private Integer mmMode;

    /**
     * 
     */
    private Date regTime;

    /**
     * 
     */
    private Float original;

    /**
     * 
     */
    private Float orgF;

    /**
     * 
     */
    private Float orgJ;

    /**
     * 
     */
    private Float orgP;

    /**
     * 
     */
    private Float orgG;

    /**
     * 
     */
    private Byte onoff;

    /**
     * 
     */
    private Byte onoffnow;

    /**
     * 
     */
    private Float raterange1;

    /**
     * 
     */
    private Float raterange2;

    /**
     * 
     */
    private Integer mPwd;

    /**
     * 
     */
    private Byte mpwdLim;

    /**
     * 
     */
    private Short pledgeNum;

    /**
     * 
     */
    private Short pledgemny;

    /**
     * 
     */
    private BigDecimal alarmMoney;

    /**
     * 
     */
    private Double alarmPower;

    /**
     * 
     */
    private Double perPower;

    /**
     * 
     */
    private BigDecimal perMoney;

    /**
     * 
     */
    private Double remainpwr;

    /**
     * 
     */
    private BigDecimal remainmy;

    /**
     * 
     */
    private Integer payNum;

    /**
     * 
     */
    private Double ljbuypwr;

    /**
     * 
     */
    private BigDecimal ljbuymny;

    /**
     * 
     */
    private Double ljusepwr;

    /**
     * 
     */
    private Integer mLink;

    /**
     * 
     */
    private Integer mReside;

    /**
     * 
     */
    private Byte stamp;

    /**
     * 
     */
    private Boolean alarmed;

    /**
     * 0
     */
    private Byte alarmeday;

    /**
     * 
     */
    private Byte clearhis;

    /**
     * 
     */
    private Byte loadNum;

    /**
     * 
     */
    private Date loadTime;

    /**
     * 
     */
    private Boolean logout;

    /**
     * 
     */
    private Byte timecase;

    /**
     * 
     */
    private String baksting;

    /**
     * 
     */
    private Date bakdatetime;

    /**
     * 
     */
    private Float baksingle;

    /**
     * 
     */
    private Double bakdouble;

    /**
     * 
     */
    private Integer bakinteger;

    /**
     * 
     */
    private Boolean bakbool;

    /**
     * 
     */
    private Date starttime;

    /**
     * 
     */
    private Integer approval;

    /**
     * 
     */
    private Date approvaltime;

    /**
     * 
     */
    private String pulseAddr;

    /**
     * 
     */
    private BigDecimal alarmMoney2;

    /**
     * 
     */
    private Double alarmPower2;

    /**
     * 
     */
    private Integer phaseType;

    /**
     * 
     */
    private Double ladderljbuypwr;

    /**
     * 
     */
    private BigDecimal ladderljbuymny;

    /**
     * 
     */
    private Integer repaircardNum;

    /**
     * 
     */
    private Integer alstarthour;

    /**
     * 
     */
    private Integer alstartmin;

    /**
     * 
     */
    private Integer alendhour;

    /**
     * 
     */
    private Integer alendmin;

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
        Meter other = (Meter) that;
        return (this.getMId() == null ? other.getMId() == null : this.getMId().equals(other.getMId()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getExtentCode() == null ? other.getExtentCode() == null : this.getExtentCode().equals(other.getExtentCode()))
            && (this.getRtuId() == null ? other.getRtuId() == null : this.getRtuId().equals(other.getRtuId()))
            && (this.getSectId() == null ? other.getSectId() == null : this.getSectId().equals(other.getSectId()))
            && (this.getSubsectId() == null ? other.getSubsectId() == null : this.getSubsectId().equals(other.getSubsectId()))
            && (this.getTranId() == null ? other.getTranId() == null : this.getTranId().equals(other.getTranId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserAddr() == null ? other.getUserAddr() == null : this.getUserAddr().equals(other.getUserAddr()))
            && (this.getUserPhon() == null ? other.getUserPhon() == null : this.getUserPhon().equals(other.getUserPhon()))
            && (this.getUserActn() == null ? other.getUserActn() == null : this.getUserActn().equals(other.getUserActn()))
            && (this.getBankId() == null ? other.getBankId() == null : this.getBankId().equals(other.getBankId()))
            && (this.getMeterNum() == null ? other.getMeterNum() == null : this.getMeterNum().equals(other.getMeterNum()))
            && (this.getAssetofnum() == null ? other.getAssetofnum() == null : this.getAssetofnum().equals(other.getAssetofnum()))
            && (this.getMeterId() == null ? other.getMeterId() == null : this.getMeterId().equals(other.getMeterId()))
            && (this.getCardId() == null ? other.getCardId() == null : this.getCardId().equals(other.getCardId()))
            && (this.getBarcode() == null ? other.getBarcode() == null : this.getBarcode().equals(other.getBarcode()))
            && (this.getBasemny() == null ? other.getBasemny() == null : this.getBasemny().equals(other.getBasemny()))
            && (this.getMtypeid() == null ? other.getMtypeid() == null : this.getMtypeid().equals(other.getMtypeid()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getMult() == null ? other.getMult() == null : this.getMult().equals(other.getMult()))
            && (this.getStopFlag() == null ? other.getStopFlag() == null : this.getStopFlag().equals(other.getStopFlag()))
            && (this.getStarted() == null ? other.getStarted() == null : this.getStarted().equals(other.getStarted()))
            && (this.getProtocol() == null ? other.getProtocol() == null : this.getProtocol().equals(other.getProtocol()))
            && (this.getDataType() == null ? other.getDataType() == null : this.getDataType().equals(other.getDataType()))
            && (this.getRelayId() == null ? other.getRelayId() == null : this.getRelayId().equals(other.getRelayId()))
            && (this.getBoxNo() == null ? other.getBoxNo() == null : this.getBoxNo().equals(other.getBoxNo()))
            && (this.getLineNo() == null ? other.getLineNo() == null : this.getLineNo().equals(other.getLineNo()))
            && (this.getPhaseNo() == null ? other.getPhaseNo() == null : this.getPhaseNo().equals(other.getPhaseNo()))
            && (this.getMmMode() == null ? other.getMmMode() == null : this.getMmMode().equals(other.getMmMode()))
            && (this.getRegTime() == null ? other.getRegTime() == null : this.getRegTime().equals(other.getRegTime()))
            && (this.getOriginal() == null ? other.getOriginal() == null : this.getOriginal().equals(other.getOriginal()))
            && (this.getOrgF() == null ? other.getOrgF() == null : this.getOrgF().equals(other.getOrgF()))
            && (this.getOrgJ() == null ? other.getOrgJ() == null : this.getOrgJ().equals(other.getOrgJ()))
            && (this.getOrgP() == null ? other.getOrgP() == null : this.getOrgP().equals(other.getOrgP()))
            && (this.getOrgG() == null ? other.getOrgG() == null : this.getOrgG().equals(other.getOrgG()))
            && (this.getOnoff() == null ? other.getOnoff() == null : this.getOnoff().equals(other.getOnoff()))
            && (this.getOnoffnow() == null ? other.getOnoffnow() == null : this.getOnoffnow().equals(other.getOnoffnow()))
            && (this.getRaterange1() == null ? other.getRaterange1() == null : this.getRaterange1().equals(other.getRaterange1()))
            && (this.getRaterange2() == null ? other.getRaterange2() == null : this.getRaterange2().equals(other.getRaterange2()))
            && (this.getMPwd() == null ? other.getMPwd() == null : this.getMPwd().equals(other.getMPwd()))
            && (this.getMpwdLim() == null ? other.getMpwdLim() == null : this.getMpwdLim().equals(other.getMpwdLim()))
            && (this.getPledgeNum() == null ? other.getPledgeNum() == null : this.getPledgeNum().equals(other.getPledgeNum()))
            && (this.getPledgemny() == null ? other.getPledgemny() == null : this.getPledgemny().equals(other.getPledgemny()))
            && (this.getAlarmMoney() == null ? other.getAlarmMoney() == null : this.getAlarmMoney().equals(other.getAlarmMoney()))
            && (this.getAlarmPower() == null ? other.getAlarmPower() == null : this.getAlarmPower().equals(other.getAlarmPower()))
            && (this.getPerPower() == null ? other.getPerPower() == null : this.getPerPower().equals(other.getPerPower()))
            && (this.getPerMoney() == null ? other.getPerMoney() == null : this.getPerMoney().equals(other.getPerMoney()))
            && (this.getRemainpwr() == null ? other.getRemainpwr() == null : this.getRemainpwr().equals(other.getRemainpwr()))
            && (this.getRemainmy() == null ? other.getRemainmy() == null : this.getRemainmy().equals(other.getRemainmy()))
            && (this.getPayNum() == null ? other.getPayNum() == null : this.getPayNum().equals(other.getPayNum()))
            && (this.getLjbuypwr() == null ? other.getLjbuypwr() == null : this.getLjbuypwr().equals(other.getLjbuypwr()))
            && (this.getLjbuymny() == null ? other.getLjbuymny() == null : this.getLjbuymny().equals(other.getLjbuymny()))
            && (this.getLjusepwr() == null ? other.getLjusepwr() == null : this.getLjusepwr().equals(other.getLjusepwr()))
            && (this.getMLink() == null ? other.getMLink() == null : this.getMLink().equals(other.getMLink()))
            && (this.getMReside() == null ? other.getMReside() == null : this.getMReside().equals(other.getMReside()))
            && (this.getStamp() == null ? other.getStamp() == null : this.getStamp().equals(other.getStamp()))
            && (this.getAlarmed() == null ? other.getAlarmed() == null : this.getAlarmed().equals(other.getAlarmed()))
            && (this.getAlarmeday() == null ? other.getAlarmeday() == null : this.getAlarmeday().equals(other.getAlarmeday()))
            && (this.getClearhis() == null ? other.getClearhis() == null : this.getClearhis().equals(other.getClearhis()))
            && (this.getLoadNum() == null ? other.getLoadNum() == null : this.getLoadNum().equals(other.getLoadNum()))
            && (this.getLoadTime() == null ? other.getLoadTime() == null : this.getLoadTime().equals(other.getLoadTime()))
            && (this.getLogout() == null ? other.getLogout() == null : this.getLogout().equals(other.getLogout()))
            && (this.getTimecase() == null ? other.getTimecase() == null : this.getTimecase().equals(other.getTimecase()))
            && (this.getBaksting() == null ? other.getBaksting() == null : this.getBaksting().equals(other.getBaksting()))
            && (this.getBakdatetime() == null ? other.getBakdatetime() == null : this.getBakdatetime().equals(other.getBakdatetime()))
            && (this.getBaksingle() == null ? other.getBaksingle() == null : this.getBaksingle().equals(other.getBaksingle()))
            && (this.getBakdouble() == null ? other.getBakdouble() == null : this.getBakdouble().equals(other.getBakdouble()))
            && (this.getBakinteger() == null ? other.getBakinteger() == null : this.getBakinteger().equals(other.getBakinteger()))
            && (this.getBakbool() == null ? other.getBakbool() == null : this.getBakbool().equals(other.getBakbool()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getApproval() == null ? other.getApproval() == null : this.getApproval().equals(other.getApproval()))
            && (this.getApprovaltime() == null ? other.getApprovaltime() == null : this.getApprovaltime().equals(other.getApprovaltime()))
            && (this.getPulseAddr() == null ? other.getPulseAddr() == null : this.getPulseAddr().equals(other.getPulseAddr()))
            && (this.getAlarmMoney2() == null ? other.getAlarmMoney2() == null : this.getAlarmMoney2().equals(other.getAlarmMoney2()))
            && (this.getAlarmPower2() == null ? other.getAlarmPower2() == null : this.getAlarmPower2().equals(other.getAlarmPower2()))
            && (this.getPhaseType() == null ? other.getPhaseType() == null : this.getPhaseType().equals(other.getPhaseType()))
            && (this.getLadderljbuypwr() == null ? other.getLadderljbuypwr() == null : this.getLadderljbuypwr().equals(other.getLadderljbuypwr()))
            && (this.getLadderljbuymny() == null ? other.getLadderljbuymny() == null : this.getLadderljbuymny().equals(other.getLadderljbuymny()))
            && (this.getRepaircardNum() == null ? other.getRepaircardNum() == null : this.getRepaircardNum().equals(other.getRepaircardNum()))
            && (this.getAlstarthour() == null ? other.getAlstarthour() == null : this.getAlstarthour().equals(other.getAlstarthour()))
            && (this.getAlstartmin() == null ? other.getAlstartmin() == null : this.getAlstartmin().equals(other.getAlstartmin()))
            && (this.getAlendhour() == null ? other.getAlendhour() == null : this.getAlendhour().equals(other.getAlendhour()))
            && (this.getAlendmin() == null ? other.getAlendmin() == null : this.getAlendmin().equals(other.getAlendmin()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMId() == null) ? 0 : getMId().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getExtentCode() == null) ? 0 : getExtentCode().hashCode());
        result = prime * result + ((getRtuId() == null) ? 0 : getRtuId().hashCode());
        result = prime * result + ((getSectId() == null) ? 0 : getSectId().hashCode());
        result = prime * result + ((getSubsectId() == null) ? 0 : getSubsectId().hashCode());
        result = prime * result + ((getTranId() == null) ? 0 : getTranId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserAddr() == null) ? 0 : getUserAddr().hashCode());
        result = prime * result + ((getUserPhon() == null) ? 0 : getUserPhon().hashCode());
        result = prime * result + ((getUserActn() == null) ? 0 : getUserActn().hashCode());
        result = prime * result + ((getBankId() == null) ? 0 : getBankId().hashCode());
        result = prime * result + ((getMeterNum() == null) ? 0 : getMeterNum().hashCode());
        result = prime * result + ((getAssetofnum() == null) ? 0 : getAssetofnum().hashCode());
        result = prime * result + ((getMeterId() == null) ? 0 : getMeterId().hashCode());
        result = prime * result + ((getCardId() == null) ? 0 : getCardId().hashCode());
        result = prime * result + ((getBarcode() == null) ? 0 : getBarcode().hashCode());
        result = prime * result + ((getBasemny() == null) ? 0 : getBasemny().hashCode());
        result = prime * result + ((getMtypeid() == null) ? 0 : getMtypeid().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getMult() == null) ? 0 : getMult().hashCode());
        result = prime * result + ((getStopFlag() == null) ? 0 : getStopFlag().hashCode());
        result = prime * result + ((getStarted() == null) ? 0 : getStarted().hashCode());
        result = prime * result + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        result = prime * result + ((getDataType() == null) ? 0 : getDataType().hashCode());
        result = prime * result + ((getRelayId() == null) ? 0 : getRelayId().hashCode());
        result = prime * result + ((getBoxNo() == null) ? 0 : getBoxNo().hashCode());
        result = prime * result + ((getLineNo() == null) ? 0 : getLineNo().hashCode());
        result = prime * result + ((getPhaseNo() == null) ? 0 : getPhaseNo().hashCode());
        result = prime * result + ((getMmMode() == null) ? 0 : getMmMode().hashCode());
        result = prime * result + ((getRegTime() == null) ? 0 : getRegTime().hashCode());
        result = prime * result + ((getOriginal() == null) ? 0 : getOriginal().hashCode());
        result = prime * result + ((getOrgF() == null) ? 0 : getOrgF().hashCode());
        result = prime * result + ((getOrgJ() == null) ? 0 : getOrgJ().hashCode());
        result = prime * result + ((getOrgP() == null) ? 0 : getOrgP().hashCode());
        result = prime * result + ((getOrgG() == null) ? 0 : getOrgG().hashCode());
        result = prime * result + ((getOnoff() == null) ? 0 : getOnoff().hashCode());
        result = prime * result + ((getOnoffnow() == null) ? 0 : getOnoffnow().hashCode());
        result = prime * result + ((getRaterange1() == null) ? 0 : getRaterange1().hashCode());
        result = prime * result + ((getRaterange2() == null) ? 0 : getRaterange2().hashCode());
        result = prime * result + ((getMPwd() == null) ? 0 : getMPwd().hashCode());
        result = prime * result + ((getMpwdLim() == null) ? 0 : getMpwdLim().hashCode());
        result = prime * result + ((getPledgeNum() == null) ? 0 : getPledgeNum().hashCode());
        result = prime * result + ((getPledgemny() == null) ? 0 : getPledgemny().hashCode());
        result = prime * result + ((getAlarmMoney() == null) ? 0 : getAlarmMoney().hashCode());
        result = prime * result + ((getAlarmPower() == null) ? 0 : getAlarmPower().hashCode());
        result = prime * result + ((getPerPower() == null) ? 0 : getPerPower().hashCode());
        result = prime * result + ((getPerMoney() == null) ? 0 : getPerMoney().hashCode());
        result = prime * result + ((getRemainpwr() == null) ? 0 : getRemainpwr().hashCode());
        result = prime * result + ((getRemainmy() == null) ? 0 : getRemainmy().hashCode());
        result = prime * result + ((getPayNum() == null) ? 0 : getPayNum().hashCode());
        result = prime * result + ((getLjbuypwr() == null) ? 0 : getLjbuypwr().hashCode());
        result = prime * result + ((getLjbuymny() == null) ? 0 : getLjbuymny().hashCode());
        result = prime * result + ((getLjusepwr() == null) ? 0 : getLjusepwr().hashCode());
        result = prime * result + ((getMLink() == null) ? 0 : getMLink().hashCode());
        result = prime * result + ((getMReside() == null) ? 0 : getMReside().hashCode());
        result = prime * result + ((getStamp() == null) ? 0 : getStamp().hashCode());
        result = prime * result + ((getAlarmed() == null) ? 0 : getAlarmed().hashCode());
        result = prime * result + ((getAlarmeday() == null) ? 0 : getAlarmeday().hashCode());
        result = prime * result + ((getClearhis() == null) ? 0 : getClearhis().hashCode());
        result = prime * result + ((getLoadNum() == null) ? 0 : getLoadNum().hashCode());
        result = prime * result + ((getLoadTime() == null) ? 0 : getLoadTime().hashCode());
        result = prime * result + ((getLogout() == null) ? 0 : getLogout().hashCode());
        result = prime * result + ((getTimecase() == null) ? 0 : getTimecase().hashCode());
        result = prime * result + ((getBaksting() == null) ? 0 : getBaksting().hashCode());
        result = prime * result + ((getBakdatetime() == null) ? 0 : getBakdatetime().hashCode());
        result = prime * result + ((getBaksingle() == null) ? 0 : getBaksingle().hashCode());
        result = prime * result + ((getBakdouble() == null) ? 0 : getBakdouble().hashCode());
        result = prime * result + ((getBakinteger() == null) ? 0 : getBakinteger().hashCode());
        result = prime * result + ((getBakbool() == null) ? 0 : getBakbool().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getApproval() == null) ? 0 : getApproval().hashCode());
        result = prime * result + ((getApprovaltime() == null) ? 0 : getApprovaltime().hashCode());
        result = prime * result + ((getPulseAddr() == null) ? 0 : getPulseAddr().hashCode());
        result = prime * result + ((getAlarmMoney2() == null) ? 0 : getAlarmMoney2().hashCode());
        result = prime * result + ((getAlarmPower2() == null) ? 0 : getAlarmPower2().hashCode());
        result = prime * result + ((getPhaseType() == null) ? 0 : getPhaseType().hashCode());
        result = prime * result + ((getLadderljbuypwr() == null) ? 0 : getLadderljbuypwr().hashCode());
        result = prime * result + ((getLadderljbuymny() == null) ? 0 : getLadderljbuymny().hashCode());
        result = prime * result + ((getRepaircardNum() == null) ? 0 : getRepaircardNum().hashCode());
        result = prime * result + ((getAlstarthour() == null) ? 0 : getAlstarthour().hashCode());
        result = prime * result + ((getAlstartmin() == null) ? 0 : getAlstartmin().hashCode());
        result = prime * result + ((getAlendhour() == null) ? 0 : getAlendhour().hashCode());
        result = prime * result + ((getAlendmin() == null) ? 0 : getAlendmin().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mId=").append(mId);
        sb.append(", id=").append(id);
        sb.append(", extentCode=").append(extentCode);
        sb.append(", rtuId=").append(rtuId);
        sb.append(", sectId=").append(sectId);
        sb.append(", subsectId=").append(subsectId);
        sb.append(", tranId=").append(tranId);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userAddr=").append(userAddr);
        sb.append(", userPhon=").append(userPhon);
        sb.append(", userActn=").append(userActn);
        sb.append(", bankId=").append(bankId);
        sb.append(", meterNum=").append(meterNum);
        sb.append(", assetofnum=").append(assetofnum);
        sb.append(", meterId=").append(meterId);
        sb.append(", cardId=").append(cardId);
        sb.append(", barcode=").append(barcode);
        sb.append(", basemny=").append(basemny);
        sb.append(", mtypeid=").append(mtypeid);
        sb.append(", userType=").append(userType);
        sb.append(", mult=").append(mult);
        sb.append(", stopFlag=").append(stopFlag);
        sb.append(", started=").append(started);
        sb.append(", protocol=").append(protocol);
        sb.append(", dataType=").append(dataType);
        sb.append(", relayId=").append(relayId);
        sb.append(", boxNo=").append(boxNo);
        sb.append(", lineNo=").append(lineNo);
        sb.append(", phaseNo=").append(phaseNo);
        sb.append(", mmMode=").append(mmMode);
        sb.append(", regTime=").append(regTime);
        sb.append(", original=").append(original);
        sb.append(", orgF=").append(orgF);
        sb.append(", orgJ=").append(orgJ);
        sb.append(", orgP=").append(orgP);
        sb.append(", orgG=").append(orgG);
        sb.append(", onoff=").append(onoff);
        sb.append(", onoffnow=").append(onoffnow);
        sb.append(", raterange1=").append(raterange1);
        sb.append(", raterange2=").append(raterange2);
        sb.append(", mPwd=").append(mPwd);
        sb.append(", mpwdLim=").append(mpwdLim);
        sb.append(", pledgeNum=").append(pledgeNum);
        sb.append(", pledgemny=").append(pledgemny);
        sb.append(", alarmMoney=").append(alarmMoney);
        sb.append(", alarmPower=").append(alarmPower);
        sb.append(", perPower=").append(perPower);
        sb.append(", perMoney=").append(perMoney);
        sb.append(", remainpwr=").append(remainpwr);
        sb.append(", remainmy=").append(remainmy);
        sb.append(", payNum=").append(payNum);
        sb.append(", ljbuypwr=").append(ljbuypwr);
        sb.append(", ljbuymny=").append(ljbuymny);
        sb.append(", ljusepwr=").append(ljusepwr);
        sb.append(", mLink=").append(mLink);
        sb.append(", mReside=").append(mReside);
        sb.append(", stamp=").append(stamp);
        sb.append(", alarmed=").append(alarmed);
        sb.append(", alarmeday=").append(alarmeday);
        sb.append(", clearhis=").append(clearhis);
        sb.append(", loadNum=").append(loadNum);
        sb.append(", loadTime=").append(loadTime);
        sb.append(", logout=").append(logout);
        sb.append(", timecase=").append(timecase);
        sb.append(", baksting=").append(baksting);
        sb.append(", bakdatetime=").append(bakdatetime);
        sb.append(", baksingle=").append(baksingle);
        sb.append(", bakdouble=").append(bakdouble);
        sb.append(", bakinteger=").append(bakinteger);
        sb.append(", bakbool=").append(bakbool);
        sb.append(", starttime=").append(starttime);
        sb.append(", approval=").append(approval);
        sb.append(", approvaltime=").append(approvaltime);
        sb.append(", pulseAddr=").append(pulseAddr);
        sb.append(", alarmMoney2=").append(alarmMoney2);
        sb.append(", alarmPower2=").append(alarmPower2);
        sb.append(", phaseType=").append(phaseType);
        sb.append(", ladderljbuypwr=").append(ladderljbuypwr);
        sb.append(", ladderljbuymny=").append(ladderljbuymny);
        sb.append(", repaircardNum=").append(repaircardNum);
        sb.append(", alstarthour=").append(alstarthour);
        sb.append(", alstartmin=").append(alstartmin);
        sb.append(", alendhour=").append(alendhour);
        sb.append(", alendmin=").append(alendmin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}