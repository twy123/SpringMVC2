package cn.SpringMVC.controller;

import cn.SpringMVC.model.TEST;
import cn.SpringMVC.service.ITestsService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by wenyuan on 2016/3/31.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    private static Logger logger = Logger.getLogger(TestController.class);

    @Resource
    private ITestsService testsService;

    @RequestMapping("/showTest")
    public String toIndex(HttpServletRequest request,Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        TEST test = testsService.getTestById(userId);
        model.addAttribute("test", test);
        logger.info("this is showTestController");

        return "showTest";
    }
}
