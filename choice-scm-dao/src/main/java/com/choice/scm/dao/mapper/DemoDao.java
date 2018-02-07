package com.choice.scm.dao.mapper;

import com.choice.scm.entity.scm.Demo;

import java.util.List;

/**
 * @author linwbai
 * @version $Id: DemoDao.java, v 0.1 2018-01-17 上午9:28 linwbai Exp $$
 */
public interface DemoDao {

    void insert(Demo demo);

    List<Demo> findAll();

}
