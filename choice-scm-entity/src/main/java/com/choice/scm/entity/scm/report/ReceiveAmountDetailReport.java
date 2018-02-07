package com.choice.scm.entity.scm.report;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by w2322 on 2018/1/19.
 */
@Data
public class ReceiveAmountDetailReport implements Serializable {
    private static final long serialVersionUID = -2647002244516835411L;

    private String storeName;
    private BigDecimal totalNum;
    private BigDecimal diffNum;
    private String diffRate;
}
