package com.baizhi.action;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminAction {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/login")
    public String login(HttpSession session,Admin admin)throws Exception{
        try {
            Admin login = adminService.login(admin);
            session.setAttribute("loginAdmin",login);
            return "redirect:/dept/selectAll.do";
        }catch (Exception e){
            e.printStackTrace();
            return "login";
        }
    }
    @RequestMapping("/register")
    public String register(Admin admin)throws Exception{
        adminService.modifyRegister(admin);
        return "redirect:/login.jsp";
    }
}
