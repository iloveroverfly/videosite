package com.iloveroverfly.videosite.commom.template;

/**
 * @Author: wind.
 * User: wind
 * Date:Create in  2017/8/10 8:24
 */
public interface HandleCallback {
    void checkParams();

    void doCache();

    void process();
}
