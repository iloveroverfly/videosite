package com.iloveroverfly.videosite.commom.model;

/**
 * @Author: wind.
 * User: wind
 * Date:Create in  2017/8/10 8:23
 */
public class Result<T> {
    private boolean success;
    private String errorContext;
    private T resultObj;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorContext() {
        return errorContext;
    }

    public void setErrorContext(String errorContext) {
        this.errorContext = errorContext;
    }

    public T getResultObj() {
        return resultObj;
    }

    public void setResultObj(T resultObj) {
        this.resultObj = resultObj;
    }
}
