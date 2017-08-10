package com.iloveroverfly.videosite.modules.user.dao;

import com.iloveroverfly.videosite.commom.model.UserModel;
import com.iloveroverfly.videosite.commom.persistence.HandleDao;
import com.iloveroverfly.videosite.commom.persistence.annotation.MyBatisDao;

/**
 * @Author: wind.
 * User: wind
 * Date:Create in  2017/8/10 23:58
 */
@MyBatisDao
public interface UserHandleDao<UserModel> extends HandleDao<UserModel> {
}
