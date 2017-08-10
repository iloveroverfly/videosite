package com.iloveroverfly.videosite.modules.user.dao;

import com.iloveroverfly.videosite.commom.persistence.QueryDao;
import com.iloveroverfly.videosite.commom.persistence.annotation.MyBatisDao;

/**
 * @Author: wind.
 * User: wind
 * Date:Create in  2017/8/11 0:02
 */
@MyBatisDao
public interface UserQueryDao<UserVO> extends QueryDao<UserVO> {
}
