package com.example.im.service.user.service;

import com.example.im.service.user.model.req.*;
import com.example.im.common.ResponseVO;
import com.example.im.service.user.dao.ImUserDataEntity;
import com.example.im.service.user.model.req.*;
import com.example.im.service.user.model.resp.GetUserInfoResp;

/**
 * @description:
 * @author: lld
 * @version: 1.0
 */
public interface ImUserService {

    public ResponseVO importUser(ImportUserReq req);

    public ResponseVO<GetUserInfoResp> getUserInfo(GetUserInfoReq req);

    public ResponseVO<ImUserDataEntity> getSingleUserInfo(String userId , Integer appId);

    public ResponseVO deleteUser(DeleteUserReq req);

    public ResponseVO modifyUserInfo(ModifyUserInfoReq req);

    public ResponseVO login(LoginReq req);

    ResponseVO getUserSequence(GetUserSequenceReq req);

}
