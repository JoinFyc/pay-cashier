package com.fei.base.service.facade.common.result;

import com.fei.base.service.facade.common.enums.DemoStatusEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * @author fei
 * @date 2020-09-22 16:16
 **/
@Getter
@Setter
public class DemoResult {
    private String result;
    private DemoStatusEnum statusEnum;
}
