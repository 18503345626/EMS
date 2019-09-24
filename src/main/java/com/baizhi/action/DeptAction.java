package com.baizhi.action;

import com.baizhi.entity.Dept;
import com.baizhi.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptAction  {
    @Autowired
    private DeptService deptService;
    @RequestMapping("/selectAll")
    public String selectAll(HttpSession session) throws Exception{
        List<Dept> list=deptService.selectAll();
        session.setAttribute("list",list);
        return "departments";
    }
    @RequestMapping("/addDept")
    public  String addDept(Dept dept) throws Exception{
        deptService.modifyaddDept(dept);
        return "redirect:/dept/selectAll.do";
    }
    @RequestMapping("/selectById")
    public String selectById(Model model,Integer id) throws Exception{
       Dept dept=deptService.selectById(id);
       model.addAttribute("dept",dept);
       return "emplist";
    }

    @RequestMapping("/selectAjax")
    @ResponseBody
    public List<Dept> selectAjax()throws Exception{
        List<Dept> depts = deptService.selectAll();
        return  depts;
    }
//    public String selectAjax(HttpServletResponse response) throws Exception{
//        List<Dept> depts = deptService.selectAll();
//        String s = JSON.toJSONString(depts);
//        response.setCharacterEncoding("UTF-8");
//        try {
//            PrintWriter out = response.getWriter();
//            out.print(s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
    @RequestMapping("/selectByIds")
    public String selectByIds(Model model,Integer deptId) throws Exception{
       Dept dept=deptService.selectById(deptId);
       model.addAttribute("dept",dept);
       return "updateDepartment";
    }
    @RequestMapping("/updateOne")
    public String updateOne(Dept dept)throws Exception{
        deptService.modifyUpdateOne(dept);
        return "redirect:/dept/selectAll.do";
    }
}
