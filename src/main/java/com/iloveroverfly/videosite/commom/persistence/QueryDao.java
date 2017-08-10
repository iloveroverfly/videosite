package com.iloveroverfly.videosite.commom.persistence;

import java.util.List;

/**
 * @Author: wind.
 * User: wind
 * Date:Create in  2017/8/10 23:48
 */
public interface QueryDao<T> {

    T get(long id);

    List<T> findAll();
}
