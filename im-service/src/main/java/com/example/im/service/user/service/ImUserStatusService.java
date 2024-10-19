package com.example.im.service.user.service;

import com.example.im.service.user.model.req.PullFriendOnlineStatusReq;
import com.example.im.service.user.model.req.PullUserOnlineStatusReq;
import com.example.im.service.user.model.req.SetUserCustomerStatusReq;
import com.example.im.service.user.model.req.SubscribeUserOnlineStatusReq;
import com.example.im.service.user.model.UserStatusChangeNotifyContent;
import com.example.im.service.user.model.resp.UserOnlineStatusResp;

import java.util.Map;

/**
 * @description:
 * @author: lld
 * @version: 1.0
 */
public interface ImUserStatusService {

    public void processUserOnlineStatusNotify(UserStatusChangeNotifyContent content);

    void subscribeUserOnlineStatus(SubscribeUserOnlineStatusReq req);

    void setUserCustomerStatus(SetUserCustomerStatusReq req);

    Map<String, UserOnlineStatusResp> queryFriendOnlineStatus(PullFriendOnlineStatusReq req);

    Map<String, UserOnlineStatusResp> queryUserOnlineStatus(PullUserOnlineStatusReq req);
}
