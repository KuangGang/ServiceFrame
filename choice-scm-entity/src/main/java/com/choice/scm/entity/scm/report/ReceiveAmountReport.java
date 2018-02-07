package com.choice.scm.entity.scm.report;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by w2322 on 2018/1/19.
 */
@Data
public class ReceiveAmountReport implements Serializable {
    private static final long serialVersionUID = -6966729286491865835L;

    private String storeCode;
    private String storeName;
    private BigDecimal totalReceiveableAmount;
    private BigDecimal totalReceivedAmount;
    private BigDecimal lastAmount;
}
