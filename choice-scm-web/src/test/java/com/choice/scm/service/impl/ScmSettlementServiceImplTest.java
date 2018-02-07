package com.choice.scm.service.impl;

import com.choice.scm.dao.mapper.ScmSettlementDao;
import com.choice.scm.entity.scm.ScmSettlement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import static org.junit.Assert.*;

/**
 * Created by linwbai on 18-1-19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ScmSettlementServiceImplTest {

    @Resource
    private ScmSettlementDao scmSettlementDao;

    @Test
    public void insert() throws Exception {
//        ScmSettlement scmSettlement = new ScmSettlement();
//        scmSettlement.setBillStatus(1);
//        scmSettlement.setCashStatus(1);
//        scmSettlement.setCheckRemark("remark");
//        scmSettlement.setCheckTime(new Date());
//        scmSettlement.setCheckUser(UUID.randomUUID().toString());
//        scmSettlement.setCreateTime(new Date());
//        scmSettlement.setDeleteFlag(1);
//        scmSettlement.setExtInfo("");
//        scmSettlement.setFileUrl("test");
//        scmSettlement.setId(UUID.randomUUID().toString());
//        scmSettlement.setVersion(1);
//        scmSettlement.setUpdateUser(UUID.randomUUID().toString());
//        scmSettlement.setUpdateTime(new Date());
//        scmSettlement.setToBePaidAmount(new BigDecimal(0));
//        scmSettlement.setTenantId(UUID.randomUUID().toString());
//        scmSettlement.setSupplierId(UUID.randomUUID().toString());
//        scmSettlement.setStoreStatus(1);
//        scmSettlement.setStoreId(UUID.randomUUID().toString());
//        scmSettlement.setSettlementType(1);
//        scmSettlement.setSettlementCode("");
//        scmSettlement.setSettlementAmount(new BigDecimal(0));
//        scmSettlement.setReturnRes("test");
//        scmSettlement.setRemark("remark");
//        scmSettlement.setPayStatus(1);
//        scmSettlement.setPaidAmount(new BigDecimal(0));
//        scmSettlement.setObsoleteRes("test");
//        scmSettlement.setCreateUser(UUID.randomUUID().toString());
//        scmSettlementDao.insert(scmSettlement);
    }

}