package com.fei.base.biz.service.impl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fei
 * @date 2020-09-22 16:16
 **/
@RestController
@Api(tags = "健康检查")
public class HealthCheckFacadeController {
    @ApiOperation(value = "SLB健康检测", notes = "只做健康检查,无任何作用")
    @GetMapping(value = "/slb/health")
    public void health() {
        //do nothing
    }
}
