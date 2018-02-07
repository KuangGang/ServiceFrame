package com.choice.scm.dao.mapper.report;

import com.choice.scm.entity.scm.report.PayableAmountReport;

import java.util.List;

/**
 * Created by w2322 on 2018/1/22.
 */
public interface HeadquarterPayableAmountReportDao {

    List<PayableAmountReport> findPayableAmountReport(ReportQP qp);

}
