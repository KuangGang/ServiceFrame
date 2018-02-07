package com.choice.scm.service.impl;

import com.choice.scm.dao.mapper.ScmSettlementDao;
import com.choice.scm.entity.scm.ScmSettlement;
import com.choice.scm.service.ScmSettlementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author linwbai
 * @version $Id: ScmSettlementServiceImpl.java, v 0.1 2018-01-19 下午1:47 linwbai Exp $$
 */
@Service
public class ScmSettlementServiceImpl implements ScmSettlementService {

    @Resource
    private ScmSettlementDao scmSettlementDao;

    @Override
    public void insert(ScmSettlement scmSettlement) {
        scmSettlementDao.insert(scmSettlement);
    }
}
