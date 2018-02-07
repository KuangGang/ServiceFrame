package com.choice.scm.entity.scm.report;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by w2322 on 2018/1/19.
 */
@Data
public class PayableAmountReport implements Serializable{
    private static final long serialVersionUID = 2648586224146148201L;

    private String supplierCode;
    private String supplierName;
    private BigDecimal payableSettledAmount;
    private BigDecimal payedSettledAmount;
    private BigDecimal lastSettledAmount;
    private BigDecimal payableUnsettledAmount;
    private BigDecimal payedUnsettledAmount;
    private BigDecimal lastUnsettledAmount;
    private BigDecimal totalLastAmount;
    private BigDecimal totalInvoice;
    private BigDecimal totalUnpayedInvoice;

}
