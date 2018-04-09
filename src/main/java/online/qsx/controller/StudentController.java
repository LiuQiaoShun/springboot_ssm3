package online.qsx.controller;

import online.qsx.model.Student;
import online.qsx.server.StudentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class StudentController {

    @Autowired
    private StudentServer studentServer;

    @RequestMapping(value = "listStudent",method = RequestMethod.GET)
    public ModelAndView listStudent(Student student,ModelAndView mav){
        mav.addObject("student",studentServer.findAllStudent(student));
        mav.setViewName("list");
        return mav;
    }

    @RequestMapping(value = "to_add",method = {RequestMethod.GET,RequestMethod.POST})
    public String to_add(){
        return "add";
    }

    @RequestMapping(value = "do_add", method={RequestMethod.GET,RequestMethod.POST})
    public ModelAndView do_add(Student student,ModelAndView mav){
        mav.addObject("student",studentServer.save(student));
        mav.setViewName("redirect:listStudent");
        return mav;
    }

    @RequestMapping(value = "findStudentByJave",method = RequestMethod.GET)
    public ModelAndView findStudentByJave(Student student,ModelAndView mav){
        mav.addObject("student",studentServer.findStudentByJave(student));
        mav.setViewName("list");
        return mav;
    }

    @RequestMapping(value = "getStudent",method = RequestMethod.GET)
    public String getStudent(Model model, HttpServletRequest request,Student student){
        //创建一个用于存放查询的Student对象，此处使用领域模型damain是更好一些的。

        //为对象存入前端传来的dirId和sex
        student.setDirectionId(Integer.parseInt(request.getParameter("dirId")));
        student.setSex(Integer.parseInt(request.getParameter("sex")));
        model.addAttribute("students",studentServer.findStudent(student));
        return "student";
    }
}
