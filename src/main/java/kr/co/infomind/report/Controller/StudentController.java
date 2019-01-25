package kr.co.infomind.report.Controller;

import kr.co.infomind.report.Service.ReportService;
import kr.co.infomind.report.Service.StudentService;
import lombok.RequiredArgsConstructor;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

import static kr.co.infomind.report.Service.ReportService.getDataSource;

@Controller
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final ReportService reportService;
    private final StudentService studentService;
    private JRBeanCollectionDataSource dataSource;

    @GetMapping("/grd")
    public void grdPdf(HttpServletResponse response) throws Exception {
        dataSource = getDataSource(studentService.studentTest());
        reportService.exportReportToPdf(response, "JNU_User_Report1", dataSource);
    }
}
