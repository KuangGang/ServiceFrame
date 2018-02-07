package com.choice.scm.dao.mapper.report;

import java.util.Date;

/**
 * Created by w2322 on 2018/1/22.
 */
public class ReportQP {
    private String tenantId;
    private String supplierId;
    private Date beginDate;
    private Date endDate;

    public ReportQP(String tenantId, String supplierId, Date beginDate, Date endDate) {
        this.tenantId = tenantId;
        this.supplierId = supplierId;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
