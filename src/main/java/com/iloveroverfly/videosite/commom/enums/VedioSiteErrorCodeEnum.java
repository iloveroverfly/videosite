package com.iloveroverfly.videosite.commom.enums;

/**
 * @Author: wind.
 * User: wind
 * Date:Create in  2017/8/10 8:29
 */
public enum VedioSiteErrorCodeEnum {

    INPUT_PARAM_NULL_ERROR("01", "输入参数为空"),
    INPUT_PARAM_EMPTY_ERROR("01", "输入参数字符串为空"),
    INPUT_PARAM_ILLEGAL_ERROR("01", "输入参数不合法"),;

    private String code;
    private String description;

    VedioSiteErrorCodeEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
