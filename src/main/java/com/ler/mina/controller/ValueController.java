package com.ler.mina.controller;

import com.lww.mina.result.HttpResult;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lww
 * @date 2020-07-09 19:22
 */
@RestController
@RequestMapping("/value")
@Slf4j
public class ValueController {

    @Value("${mina.config.name}")
    private String name;

    @Resource
    private ApplicationContext context;

    @GetMapping(value = "/name1", name = "获取注入的配置")
    public HttpResult name1() {
        return HttpResult.success(name);
    }

    @GetMapping(value = "/name2", name = "直接从Environment获取配置")
    public HttpResult name2() {
        String property = context.getEnvironment().getProperty("mina.config.name");
        return HttpResult.success(property);
    }
}
