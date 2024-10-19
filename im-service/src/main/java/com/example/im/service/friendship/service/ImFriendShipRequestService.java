package com.example.im.service.friendship.service;

import com.example.im.service.friendship.model.req.ApproverFriendRequestReq;
import com.example.im.service.friendship.model.req.ReadFriendShipRequestReq;
import com.example.im.common.ResponseVO;
import com.example.im.service.friendship.model.req.FriendDto;


public interface ImFriendShipRequestService {

    public ResponseVO addFienshipRequest(String fromId, FriendDto dto, Integer appId);

    public ResponseVO approverFriendRequest(ApproverFriendRequestReq req);

    public ResponseVO readFriendShipRequestReq(ReadFriendShipRequestReq req);

    public ResponseVO getFriendRequest(String fromId, Integer appId);
}
