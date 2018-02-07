package com.choice.scm.entity.scm;

/**
 * 供应链状态码枚举类
 * 新增状态码规则：
 * 采用四位制
 * 第一位：主题域，大写英文字母，从A开头
 * 第二位：主题域下状态类型，大写英文字母，从A开头
 * 第三、四位：两位表示状态码，从00-99，若到99不够用，启用16进制，最大为FF
 * Created by lijw on 2018/1/18.
 */
public enum ScmCodeEnum {

    SETTLEMENT_BILL_STATUS_TO_BE_CHECK("AA00","结算单单据状态：待审核"),

    SETTLEMENT_BILL_STATUS_CHECKED ("AA01" , "结算单单据状态：已审核"),

    SETTLEMENT_BILL_STATUS_CHECK_FAIL("AA02" , "结算单单据状态：审核未通过"),

    SETTLEMENT_BILL_STATUS_OBSOLETED ("AA03" , "结算单单据状态：已作废"),

    SETTLEMENT_STORE_STATUS_TO_BE_CONFIRM ("AB00", "结算单门店状态：待确认"),

    SETTLEMENT_STORE_STATUS_CONFIRMED("AB01" ,"结算单门店状态：已确认" ),

    SETTLEMENT_STORE_STATUS_RETURN("AB02" ,"结算单门店状态：已退回" ),

    SETTLEMENT_PAY_STATUS_TO_BE_PAY("AC00" , "结算单收/付款状态：待付款"),

    SETTLEMENT_PAY_STATUS_PART_PAY("AC01" , "结算单收/付款状态：部分付款"),

    SETTLEMENT_PAY_STATUS_CLEARED("AC02" , "结算单收/付款状态：已结清"),

    SETTLEMENT_CASH_STATUS_NO_CASH ("AD00" , "结算单结账状态：未结账"),

    SETTLEMENT_CASH_STATUS_CASHED ("AD01" , "结算单结账状态：已结账"),

    SETTLEMENT_SCM_IN_BILL ("AE00" , "结算单单据类型：入库单"),

    SETTLEMENT_SCM_RETURN_BILL("AE01" , "结算单单据类型：退货单");



    private  String code ;

    private String desc;

    ScmCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }
}
