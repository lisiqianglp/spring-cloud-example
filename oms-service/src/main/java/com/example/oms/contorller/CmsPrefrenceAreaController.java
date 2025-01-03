package com.example.oms.contorller;

import com.example.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品优选管理Controller
 * Created by macro on 2018/6/1.
 */
@Controller
@Api(tags = "CmsPrefrenceAreaController", description = "商品优选管理")
@RequestMapping("/prefrenceArea2")
public class CmsPrefrenceAreaController {
    @ApiOperation("获取所有商品优选")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<String> listAll() {
        return CommonResult.success("1212");
    }
}
