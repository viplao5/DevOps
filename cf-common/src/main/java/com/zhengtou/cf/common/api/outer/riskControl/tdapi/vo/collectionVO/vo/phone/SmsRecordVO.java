package com.zhengtou.cf.common.api.outer.riskControl.tdapi.vo.collectionVO.vo.phone;

/**
 * 短信记录
 */
public class SmsRecordVO {
    //起始时间
    private String msg_start_time;
    //发送方式
    private String msg_type;
    //对方号码
    private String msg_other_num;
    //信息类型
    private String msg_channel;
    //业务类型
    private String msg_biz_name;
    //短信地区
    private String msg_address;
    //通信费
    private String msg_fee;
    //减免
    private String msg_discount;
    //费用小计
    private String msg_cost;
    //备注
    private String msg_remark;

    public String getMsg_start_time() {
        return msg_start_time;
    }

    public void setMsg_start_time(String msg_start_time) {
        this.msg_start_time = msg_start_time;
    }

    public String getMsg_type() {
        return msg_type;
    }

    public void setMsg_type(String msg_type) {
        this.msg_type = msg_type;
    }

    public String getMsg_other_num() {
        return msg_other_num;
    }

    public void setMsg_other_num(String msg_other_num) {
        this.msg_other_num = msg_other_num;
    }

    public String getMsg_channel() {
        return msg_channel;
    }

    public void setMsg_channel(String msg_channel) {
        this.msg_channel = msg_channel;
    }

    public String getMsg_biz_name() {
        return msg_biz_name;
    }

    public void setMsg_biz_name(String msg_biz_name) {
        this.msg_biz_name = msg_biz_name;
    }

    public String getMsg_address() {
        return msg_address;
    }

    public void setMsg_address(String msg_address) {
        this.msg_address = msg_address;
    }

    public String getMsg_fee() {
        return msg_fee;
    }

    public void setMsg_fee(String msg_fee) {
        this.msg_fee = msg_fee;
    }

    public String getMsg_discount() {
        return msg_discount;
    }

    public void setMsg_discount(String msg_discount) {
        this.msg_discount = msg_discount;
    }

    public String getMsg_cost() {
        return msg_cost;
    }

    public void setMsg_cost(String msg_cost) {
        this.msg_cost = msg_cost;
    }

    public String getMsg_remark() {
        return msg_remark;
    }

    public void setMsg_remark(String msg_remark) {
        this.msg_remark = msg_remark;
    }
}
