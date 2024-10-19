package com.example.im.service.user.model.req;

import com.example.im.common.model.RequestBase;
import com.example.im.service.user.dao.ImUserDataEntity;
import lombok.Data;

import java.util.List;


@Data
public class ImportUserReq extends RequestBase {

    private List<ImUserDataEntity> userData;


}
