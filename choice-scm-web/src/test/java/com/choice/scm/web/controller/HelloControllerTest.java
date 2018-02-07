package com.choice.scm.web.controller;

import com.choice.scm.entity.scm.Demo;
import com.choice.scm.service.DemoService;
import com.choice.scm.service.ScmSettlementService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by linwbai on 18-1-17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest {

    @Autowired
    private DemoService service;

    private ScmSettlementService scmSettlementService;

    @Test
    public void hello() throws Exception {
        Demo demo = new Demo();
//        demo.setId(8L);
//        demo.setTest("test");
        service.insert(demo);
    }

}