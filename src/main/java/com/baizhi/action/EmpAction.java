package com.baizhi.action;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;

@Controller
@RequestMapping("/emp")
public class EmpAction {
    @Autowired
    private EmpService empService;

    @RequestMapping("/deleteById")
    public String deleteById(Integer empId, Integer id) throws Exception {
        empService.modifyDeleteById(empId);
        return "forward:/dept/selectById.do";
    }

    @RequestMapping("/addOneOne")
    public String addOneOne(Emp emp, MultipartFile upload, HttpSession session) throws Exception {
        ServletContext sc = session.getServletContext();
        String realPath = sc.getRealPath("/upload");
        File file = new File(realPath + "//" + upload.getOriginalFilename());
        upload.transferTo(file);
        emp.setCover(upload.getOriginalFilename());
        empService.modifyaddOne(emp);
        return "redirect:/dept/selectAll.do";
    }

    @RequestMapping("/selectOne")
    public String selectOne(Model model, Integer empId, Integer id) throws Exception {
        Emp emp = empService.selectOne(empId);
        model.addAttribute("emp", emp);
        return "updateEmp";
    }

    @RequestMapping("/updateOne")
    public String updateOne(Emp emp, MultipartFile upload, HttpSession session) throws Exception {
        if(!upload.getOriginalFilename().equals("")&&upload.getOriginalFilename()!=null){
            ServletContext sc = session.getServletContext();
            String realPath = sc.getRealPath("/upload");
             File file = new File(realPath + "//" + upload.getOriginalFilename());
             upload.transferTo(file);
             emp.setCover(upload.getOriginalFilename());
        }
        empService.modifyUpdateOne(emp);
        return "forward:/dept/selectById.do";
    }
}
