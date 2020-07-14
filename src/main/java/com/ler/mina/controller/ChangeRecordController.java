package com.ler.mina.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ler.mina.domain.ChangeRecord;
import com.ler.mina.service.ChangeRecordService;
import com.lww.mina.result.HttpResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 修改记录 前端控制器
 * </p>
 *
 * @author lww
 * @since 2020-07-10
 */
@Api(value = "/test", tags = "测试数据库连接")
@RestController
@RequestMapping("/test")
@Slf4j
public class ChangeRecordController {

    @Resource
    private ChangeRecordService changeRecordService;

    @ApiOperation(value = "查询修改记录", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @GetMapping(value = "/list", name = "查询修改记录")
    public HttpResult list() {
        List<ChangeRecord> list = changeRecordService.list(new QueryWrapper<>());
        return HttpResult.success(list);
    }

}
