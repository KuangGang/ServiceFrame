package com.choice.scm.service.report;

import com.choice.scm.dao.mapper.report.ReportQP;
import com.choice.scm.entity.scm.report.PayableAmountReport;

import java.util.List;

/**
 * Created by w2322 on 2018/1/22.
 */
public interface HeadquarterPayableAmountReportService {
    List<PayableAmountReport> findHeadquarterPayableAmountReport(ReportQP qp);
}
