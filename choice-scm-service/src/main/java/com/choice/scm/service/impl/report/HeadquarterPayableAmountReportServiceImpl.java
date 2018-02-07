package com.choice.scm.service.impl.report;

import com.choice.scm.dao.mapper.report.HeadquarterPayableAmountReportDao;
import com.choice.scm.dao.mapper.report.ReportQP;
import com.choice.scm.entity.scm.report.PayableAmountReport;
import com.choice.scm.service.report.HeadquarterPayableAmountReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by w2322 on 2018/1/22.
 */
@Service
public class HeadquarterPayableAmountReportServiceImpl implements HeadquarterPayableAmountReportService {
    @Resource
    private HeadquarterPayableAmountReportDao headquarterPayableAmountReportDao;

    @Override
    public List<PayableAmountReport> findHeadquarterPayableAmountReport(ReportQP qp) {
        return headquarterPayableAmountReportDao.findPayableAmountReport(qp);
    }
}
