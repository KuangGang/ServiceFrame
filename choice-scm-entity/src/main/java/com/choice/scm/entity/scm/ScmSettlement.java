package com.choice.scm.entity.scm;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author linwbai
 * @version $Id: ScmSettlement.java, v 0.1 2018-01-19 上午10:55 linwbai Exp $$
 */
@Data
public class ScmSettlement implements Serializable {

    private static final long serialVersionUID = -953991453786880326L;

    /**
     * 主键
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
     * 供应商id
     */
    private String supplierId;

    /**
     * 结算类型:门店对总部，门店对供应商，总部对供应商
     */
    private Integer settlementType;

    /**
     * 结算单号
     */
    private String settlementCode;

    /**
     * 应收/应付金额
     */
    private BigDecimal settlementAmount;

    /**
     * 已收/已付金额
     */
    private BigDecimal paidAmount;

    /**
     * 待收/待付金额
     */
    private BigDecimal toBePaidAmount;

    /**
     * 单据状态
     */
    private String billStatus;

    /**
     * 门店状态
     */
    private String storeStatus;

    /**
     * 付款状态
     */
    private String payStatus;

    /**
     * 结账状态
     */
    private String cashStatus;

    /**
     * 审核人
     */
    private String checkUser;

    /**
     * 审核时间
     */
    private Date checkTime;

    /**
     * 审核说明
     */
    private String checkRemark;

    /**
     * 作废原因
     */
    private String obsoleteRes;

    /**
     * 退回原因
     */
    private String returnRes;

    /**
     * 文件地址
     */
    private String fileUrl;

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
     * 扩展字段
     */
    private String extInfo;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 备注
     */
    private String remark;
}
