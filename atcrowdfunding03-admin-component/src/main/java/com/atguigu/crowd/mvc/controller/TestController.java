package com.atguigu.crowd.mvc.controller;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ezuy
 * @date 21/6/29 20:41
 */
@Controller
public class TestController {

    @Autowired
    private AdminService adminService;

    @ResponseBody
    @RequestMapping("/send/array/one.html")
    public String testReceiveArrayOne(@RequestParam("array[]") List<Integer> array) {

        for (Integer demo : array) {
            System.out.println(demo);
        }
        return "success";
    }

    @RequestMapping("/test/ssm.html")
    public String testSSM(ModelMap modelMap) {

        List<Admin> admins = adminService.getAll();

        modelMap.addAttribute("adminList", admins);

        return "target";
    }
}