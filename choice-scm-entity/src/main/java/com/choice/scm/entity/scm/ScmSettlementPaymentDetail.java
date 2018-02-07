/**
 * Choicesoft.com.cn Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.choice.scm.entity.scm;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author cui
 * @version $Id: A.java, v 0.1 2018-01-19 上午11:20 cui Exp $$
 *          Description 结算单收付款明细
 */
@Data
public class ScmSettlementPaymentDetail implements Serializable {
    private static final long serialVersionUID = -2524041305083364163L;
    /**
     * 主键id
     */
    private String id;
    /**
     * 商户id
     */
    private String tenantId;
    /**
     * 门店id
     */
    private String storeId;
    /**
     * 结算id
     */
    private String settlementId;
    /**
     * 金额
     */
    private BigDecimal amount;
    /**
     * 创建者
     */
    private String createUser;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新者
     */
    private String updateUser;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 删除标志
     */
    private Integer deleteFlag;
    /**
     * 富文本
     */
    private String extInfo;
    /**
     * 备注说明
     */
    private String remark;

}
