package com.choice.scm.web.controller.report;

import com.choice.scm.dao.mapper.report.ReportQP;
import com.choice.scm.entity.scm.report.PayableAmountReport;
import com.choice.scm.service.report.HeadquarterPayableAmountReportService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by w2322 on 2018/1/19.
 */
@RestController
@RequestMapping("/report")
public class HeadquarterPayableAmountReportController {

    @Resource
    private HeadquarterPayableAmountReportService service;

    @GetMapping("/listAmountPayable")
    public String listAmountPayable(@RequestParam(name = "supplierId", required = false) String supplierId, @RequestParam(name = "beginDate", required = false) String beginDate,
                                    @RequestParam(name = "endDate", required = false) String endDate, @RequestParam(name = "startPage", required = false) int startPage,
                                    @RequestParam(name = "pageSize", required = false) int pageSize) {
        //TODO 商户id
        String tenantId = "";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date beginD = null;
        Date endD = null;
        try {
            beginD = formatter.parse(beginDate);
            endD = formatter.parse(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        ReportQP reportQP = new ReportQP(tenantId, supplierId, beginD, endD);

        PageHelper.startPage(startPage, pageSize);
        PageInfo<PayableAmountReport> p = new PageInfo<PayableAmountReport>(service.findHeadquarterPayableAmountReport(reportQP));
        p.getSize();
        return supplierId;
    }
}
