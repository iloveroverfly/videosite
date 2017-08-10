package com.iloveroverfly.videosite.commom.exception;

import com.iloveroverfly.videosite.commom.enums.VedioSiteErrorCodeEnum;

/**
 * @Author: wind.
 * User: wind
 * Date:Create in  2017/8/10 8:28
 */
public class AppServiceException extends RuntimeException {

    protected VedioSiteErrorCodeEnum code;
    protected Throwable originalThrowable;

    public AppServiceException(String message) {
        super(message);
    }

    public AppServiceException(String message, VedioSiteErrorCodeEnum code) {
        super(message);
        this.code = code;
    }

    public VedioSiteErrorCodeEnum getCode() {
        return code;
    }

    public void setCode(VedioSiteErrorCodeEnum code) {
        this.code = code;
    }

    public Throwable getOriginalThrowable() {
        return originalThrowable;
    }

    public void setOriginalThrowable(Throwable originalThrowable) {
        this.originalThrowable = originalThrowable;
    }
}
