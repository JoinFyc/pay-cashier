package com.fei.base.biz.service.impl;

import com.mengxiang.base.common.model.result.Result;
import com.fei.base.biz.server.manager.DemoManager;
import com.fei.base.service.facade.common.feign.DemoFacade;
import com.fei.base.service.facade.common.request.DemoRequest;
import com.fei.base.service.facade.common.result.DemoResult;
import org.springframework.beans.factory.annotation.Autowired;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author fei
 * @date ${DATE}
 **/
@RestController
@Api(tags = "demo 服务接口")
public class DemoFacadeController implements DemoFacade {

    @Autowired
    private DemoManager demoManager;

    @Override
    @ApiOperation("get demo 接口")
    public Result<DemoResult> getDemo(@RequestParam("demoId") String demoId) {
        DemoResult demoResult = demoManager.selectDemoByDemoId(demoId);
        return Result.success(demoResult);
    }

    @Override
    public Result<String> addDemo(DemoRequest dto) {
        String demoId = demoManager.saveDemo(dto);
        return Result.success(demoId);
    }

}
