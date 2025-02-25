package com.fei.base.biz.server.manager;

import com.fei.base.service.facade.common.request.DemoRequest;
import com.fei.base.service.facade.common.result.DemoResult;

/**
 * @author fei
 * @date 2020-09-22 16:16
 **/
public interface DemoManager {
    /**
     * select demo by demo id
     *
     * @param demoId
     * @return
     */
    DemoResult selectDemoByDemoId(String demoId);

    /**
     * save demo
     *
     * @param dto
     * @return
     */
    String saveDemo(DemoRequest dto);
}
