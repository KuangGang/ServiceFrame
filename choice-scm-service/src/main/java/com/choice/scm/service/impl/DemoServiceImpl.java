package com.choice.scm.service.impl;

import com.choice.scm.dao.mapper.DemoDao;
import com.choice.scm.entity.scm.Demo;
import com.choice.scm.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author linwbai
 * @version $Id: DemoServiceImpl.java, v 0.1 2018-01-17 上午11:05 linwbai Exp $$
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoDao demoDao;

    @Override
    public void insert(Demo demo) {
        demoDao.insert(demo);
    }

    @Override
    public List<Demo> findAll() {
        return demoDao.findAll();
    }
}
