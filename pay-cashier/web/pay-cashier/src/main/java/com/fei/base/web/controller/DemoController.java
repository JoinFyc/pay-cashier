package com.fei.base.web.controller;

import com.mengxiang.base.common.model.result.Result;
import com.fei.base.biz.server.manager.DemoManager;
import com.fei.base.service.facade.common.request.DemoRequest;
import com.fei.base.service.facade.common.result.DemoResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author fei
 * @date 2020-09-22 16:16
 **/
@RestController
@RequestMapping("/pay-cashier")
@Api(tags = "pay-cashier 服务接口")
public class DemoController {
    @Autowired
    private DemoManager demoManager;

    @ApiOperation("get pay-cashier 接口")
    @PostMapping("/getDemoWeb")
    public Result<DemoResult> getDemo(@RequestParam("demoId") String demoId) {
        DemoResult demoResult = demoManager.selectDemoByDemoId(demoId);
        return Result.success(demoResult);
    }

    @PostMapping("/addDemoWeb")
    public Result<String> addDemo(DemoRequest dto) {
        String demoId =demoManager.saveDemo(dto);
        return Result.success(demoId);
    }
}
