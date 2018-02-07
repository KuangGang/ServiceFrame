package com.choice.scm.entity.scm.report;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by w2322 on 2018/1/19.
 */
@Data
public class OrderPriceDiffReport implements Serializable {
    private static final long serialVersionUID = -6357326652015574192L;

    private String goodsCode;
    private String goodsName;
    private String goodsSpec;
    private String goodsUnit;
    private String supplierName;
    private BigDecimal totalNum;
    private BigDecimal linkRelativeRatioAvgPrice;
    private BigDecimal yearOnYearBasisAvgPrice;
    private BigDecimal avgPrice;
    private String linkRelativeRatioDiffRate;
    private String yearOnYearBasisDiffRate;
}
