package com.choice.scm.entity.scm.report;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by w2322 on 2018/1/19.
 */
@Data
public class dispatchDiffReport implements Serializable {
    private static final long serialVersionUID = -7363604386337963305L;

    private String goodsCode;
    private String goodsName;
    private String goodsSpec;
    private String goodsUnit;
    private BigDecimal totalNum;
    private BigDecimal diffNum;
    private String diffRate;
    private int storeNum;
    private String storeDiffRate;
}
