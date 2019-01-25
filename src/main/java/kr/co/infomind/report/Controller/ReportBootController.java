package kr.co.infomind.report.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReportBootController {
    @RequestMapping(value = "/")
    public String root() {
        return "index";
    }
}
