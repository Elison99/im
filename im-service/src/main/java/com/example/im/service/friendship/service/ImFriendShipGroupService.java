package com.example.im.service.friendship.service;

import com.example.im.service.friendship.model.req.DeleteFriendShipGroupReq;
import com.example.im.common.ResponseVO;
import com.example.im.service.friendship.dao.ImFriendShipGroupEntity;
import com.example.im.service.friendship.model.req.AddFriendShipGroupReq;

/**
 * @author: Chackylee
 * @description:
 **/
public interface ImFriendShipGroupService {

    public ResponseVO addGroup(AddFriendShipGroupReq req);

    public ResponseVO deleteGroup(DeleteFriendShipGroupReq req);

    public ResponseVO<ImFriendShipGroupEntity> getGroup(String fromId, String groupName, Integer appId);

    public Long updateSeq(String fromId, String groupName, Integer appId);
}
