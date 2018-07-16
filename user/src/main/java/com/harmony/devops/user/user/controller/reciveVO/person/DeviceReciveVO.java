package com.harmony.devops.user.user.controller.reciveVO.person;

import com.zhengtou.cf.common.pojo.PeakBaseVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 设备信息
 * @author 葛文镇
 */
@ApiModel(discriminator = "郑投-设备信息vo")
public class DeviceReciveVO extends PeakBaseVo {
    public DeviceReciveVO() {
    }

    @ApiModelProperty(value="运营商类型",name="carrierType")
    private String carrierType;
    @ApiModelProperty(value="设备指纹",name="fingerprinting")
    private String fingerprinting;
    @ApiModelProperty(value="设备类型",name="deviceType")
    private String deviceType;
    @ApiModelProperty(value="设备IP地址",name="deviceIp")
    private String deviceIp;
    @ApiModelProperty(value="地理位置GPS",name="location")
    private String location;
    @ApiModelProperty(value="wifi ssid名称",name="wifiSsid")
    private String wifiSsid;
    @ApiModelProperty(value="苹果手机越狱",name="iphoeBreakout")
    private String iphoeBreakout;

    public String getCarrierType() {
        return carrierType;
    }

    public void setCarrierType(String carrierType) {
        this.carrierType = carrierType;
    }

    public String getFingerprinting() {
        return fingerprinting;
    }

    public void setFingerprinting(String fingerprinting) {
        this.fingerprinting = fingerprinting;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWifiSsid() {
        return wifiSsid;
    }

    public void setWifiSsid(String wifiSsid) {
        this.wifiSsid = wifiSsid;
    }

    public String getIphoeBreakout() {
        return iphoeBreakout;
    }

    public void setIphoeBreakout(String iphoeBreakout) {
        this.iphoeBreakout = iphoeBreakout;
    }
}