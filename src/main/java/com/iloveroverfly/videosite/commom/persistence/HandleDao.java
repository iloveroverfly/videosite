package com.iloveroverfly.videosite.commom.persistence;

/**
 * @Author: wind.
 * User: wind
 * Date:Create in  2017/8/10 23:49
 */
public interface HandleDao<T> {

    T add(T model);

    void queryForUpdate(T model);

    T update(T model);

    T delete(T model);
}
