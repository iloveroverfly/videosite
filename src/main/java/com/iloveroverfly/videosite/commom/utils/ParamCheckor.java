package com.iloveroverfly.videosite.commom.utils;

import com.iloveroverfly.videosite.commom.enums.VedioSiteErrorCodeEnum;
import com.iloveroverfly.videosite.commom.exception.AppServiceException;

/**
 * @Author: wind.
 * User: wind
 * Date:Create in  2017/8/11 0:31
 */
public class ParamCheckor {
    public static void checkNull(Object targetObject) {
        if (null == targetObject) {
            throw new AppServiceException(VedioSiteErrorCodeEnum.INPUT_PARAM_NULL_ERROR.getDescription(), VedioSiteErrorCodeEnum.INPUT_PARAM_NULL_ERROR);
        }
    }

    public static void checkValidId(long id) {
        if (0 == id || id < 0) {
            throw new AppServiceException(VedioSiteErrorCodeEnum.INPUT_PARAM_ILLEGAL_ERROR.getDescription(), VedioSiteErrorCodeEnum.INPUT_PARAM_ILLEGAL_ERROR
            );
        }
    }
}
