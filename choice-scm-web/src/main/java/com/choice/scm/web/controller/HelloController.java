package com.choice.scm.web.controller;

import com.choice.scm.entity.scm.Demo;
import com.choice.scm.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author linwbai
 * @version $Id: HelloController.java, v 0.1 2018-01-16 下午2:43 linwbai Exp $$
 */
@RestController
@RequestMapping()
@Api(value = "hello api",tags = "hello")
public class HelloController {

    @Resource
    private DemoService demoService;

    @ApiOperation(value="hello2", notes="hello1")
    @ApiParam(name = "demo", type = "Demo")
    @PostMapping("/hello")
    public String hello(@RequestBody Demo demo) {
        System.out.println(demo.toString());
        return "ok";
    }

    @ApiOperation(value="test", notes="hello1")
    @PostMapping("/test")
    public String test(@RequestParam(name = "int") Integer integer, @RequestParam(name = "str")String string) {
        return string + integer;
    }

    @ApiOperation(value="findAllDemo", notes="hello1")
    @PostMapping("/findAllDemo")
    public List<Demo> findAllDemo() {
        return demoService.findAll();
    }
}
