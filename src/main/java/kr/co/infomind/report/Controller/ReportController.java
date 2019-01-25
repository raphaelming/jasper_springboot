package kr.co.infomind.report.Controller;


import kr.co.infomind.report.Repository.ProductRepository;
import kr.co.infomind.report.Service.ProductService;
import kr.co.infomind.report.Service.ReportService;
import lombok.RequiredArgsConstructor;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static kr.co.infomind.report.Service.ReportService.getDataSource;

@Controller
@RequiredArgsConstructor
@RequestMapping("/report")
public class ReportController {
    private final ReportService reportService;
    private final ProductService productService;
    private JRBeanCollectionDataSource dataSource;



    @GetMapping
    public String report() {
        return "report";
    }

    @GetMapping("/viewer")
    public void reportToHtml(HttpServletResponse response) throws Exception {
        dataSource = getDataSource(productService.productFindAll());
        reportService.exportReportToHtml(response, "SampleReport", dataSource);
    }

    @GetMapping("/pdf")
    public void reportToPdf(HttpServletResponse response) throws Exception {
        dataSource = getDataSource(productService.productFindAll());
        reportService.exportReportToPdf(response, "SampleReport", dataSource);
    }

    @GetMapping("/test")
    public void testReport(HttpServletResponse response) throws Exception {
        dataSource = getDataSource(productService.productTest());
        reportService.exportReportToPdf(response, "SampleReport", dataSource);
    }
}
