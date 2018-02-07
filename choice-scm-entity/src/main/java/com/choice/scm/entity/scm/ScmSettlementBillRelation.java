/**
 * Choicesoft.com.cn Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.choice.scm.entity.scm;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author cui
 * @version $Id: A.java, v 0.1 2018-01-19 上午11:20 cui Exp $$
 *          Description 结算单与单据关联entity
 */
@Data
public class ScmSettlementBillRelation implements Serializable {
    private static final long serialVersionUID = -5908499291210050502L;
    /**
     * id
     */
    private String id;
    /**
     * 结算单id
     */
    private String settlementId;
    /**
     * 入库/退货id
     */
    private String billId;
    /**
     * 类型：入库/退货
     */
    private Integer type;
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
}
