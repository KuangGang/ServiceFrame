package com.choice.scm.service;

import com.choice.scm.entity.scm.Demo;

import java.util.List;

/**
 * @author linwbai
 * @version $Id: DemoService.java, v 0.1 2018-01-17 上午11:03 linwbai Exp $$
 */
public interface DemoService {

    void insert(Demo demo);

    List<Demo> findAll();
}
