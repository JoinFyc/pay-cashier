package com.fei.base.service.facade.common.feign;

import com.mengxiang.base.common.model.result.Result;
import com.fei.base.service.facade.common.request.DemoRequest;
import com.fei.base.service.facade.common.result.DemoResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author fei
 * @date 2020 09-22 16:16
 **/
@FeignClient(name = "pay-cashier")
public interface DemoFacade {

    /**
     * 获取 demo
     *
     * @param demoId demo id
     * @return
     */
    @PostMapping(path = "/pay-cashier/getDemo")
    Result<DemoResult> getDemo(@RequestParam("demoId") String demoId);

    /**
     * 新增 demo
     *
     * @param dto dto对象
     * @return pay-cashierId
     */
    @PostMapping(path = "/pay-cashier/addDemo")
    Result<String> addDemo(@RequestBody DemoRequest dto);
}