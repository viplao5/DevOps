package com.zhengtou.cf.user.pojo.entity.person.enums;

/**
 * Created by 葛文镇
 * email:15258397904@163.com
 * 房产类型
 */
public enum  HouseTypeEnum {
    普通住宅("F101"),
    经济适用房("F102"),
    成本价房("F103"),
    央产房("F104"),
    商住("F201"),
    公寓("F202"),
    商业("F301"),
    别墅("F401"),
    写字楼("F402");

    private String code;

    HouseTypeEnum(String code) {
        this.code = code;
    }

    public static com.zhengtou.cf.common.api.outer.cl.apply.enums.HouseTypeEnum getEnum(String code) {
        for (com.zhengtou.cf.common.api.outer.cl.apply.enums.HouseTypeEnum c : com.zhengtou.cf.common.api.outer.cl.apply.enums.HouseTypeEnum.values()) {
            if (c.getCode().equals(code)) {
                return c;
            }
        }
        return null;
    }
    public String getCode() {
        return code;
    }
}
