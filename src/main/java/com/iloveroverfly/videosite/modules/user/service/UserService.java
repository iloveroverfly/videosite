package com.iloveroverfly.videosite.modules.user.service;

import com.iloveroverfly.videosite.commom.model.Result;
import com.iloveroverfly.videosite.commom.model.UserModel;
import com.iloveroverfly.videosite.commom.service.BaseService;
import com.iloveroverfly.videosite.commom.template.HandleCallback;
import com.iloveroverfly.videosite.commom.template.HandleTemplate;
import com.iloveroverfly.videosite.commom.utils.ParamCheckor;
import com.iloveroverfly.videosite.modules.user.dao.UserHandleDao;
import com.iloveroverfly.videosite.modules.user.dao.UserQueryDao;
import com.iloveroverfly.videosite.modules.user.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @Author: wind.
 * User: wind
 * Date:Create in  2017/8/11 0:20
 */
public class UserService extends BaseService {

    @Autowired
    private TransactionTemplate transactionTemplate;
    @Autowired
    private UserHandleDao<UserModel> userHandleDao;
    @Autowired
    private UserQueryDao<UserVO> userQueryDao;

    public Result<UserVO> get(final long id) {
        final Result<UserVO> result = new Result<UserVO>();
        HandleTemplate.excute(result, new HandleCallback() {

            public void checkParams() {
                ParamCheckor.checkValidId(id);
            }

            public void doCache() {
//TODO
            }

            public void process() {
                UserVO userVO = userQueryDao.get(id);
                if (null != userVO) {
                    result.setResultObj(userVO);
                }
            }
        });
        return result;
    }

    public Result<UserModel> add(final UserModel model) {
        final Result<UserModel> result = new Result<UserModel>();
        HandleTemplate.excute(result, new HandleCallback() {
            public void checkParams() {
                ParamCheckor.checkNull(model);
            }

            public void doCache() {
//TODO
            }

            public void process() {
                transactionTemplate.execute(new TransactionCallback<UserModel>() {
                    public UserModel doInTransaction(TransactionStatus status) {
                        UserModel userModel = userHandleDao.add(model);
                        if (null != userModel) {
                            result.setResultObj(userModel);
                        }
                        return userModel;
                    }
                });
            }
        });
        return result;
    }
}
