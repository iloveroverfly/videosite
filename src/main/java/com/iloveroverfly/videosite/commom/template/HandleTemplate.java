package com.iloveroverfly.videosite.commom.template;

import com.iloveroverfly.videosite.commom.exception.AppServiceException;
import com.iloveroverfly.videosite.commom.model.Result;

/**
 * @Author: wind.
 * User: wind
 * Date:Create in  2017/8/10 8:21
 */
public class HandleTemplate {

    public static <T> void excute(Result<T> result, HandleCallback handleCallback) {
        try {
            handleCallback.checkParams();
            handleCallback.doCache();
            handleCallback.process();
            result.setSuccess(true);
        } catch (AppServiceException e) {
            result.setSuccess(false);
        } catch (Throwable e) {
            result.setSuccess(false);
        }
    }
}
