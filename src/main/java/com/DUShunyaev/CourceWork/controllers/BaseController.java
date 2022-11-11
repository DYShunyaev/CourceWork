package com.DUShunyaev.CourceWork.controllers;

import com.DUShunyaev.CourceWork.CRUDService;
import com.DUShunyaev.CourceWork.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.util.List;

@Controller
public class BaseController {

    @Autowired
    private CRUDService service;

    @RequestMapping("/")
    public String mainPage(Model model) {
        List<Employee> employeeList = service.listAll();
        model.addAttribute("listAll", employeeList);


        return "mainPage";
    }

    @RequestMapping("/help")
    public ModelAndView mainPage() {
        List<Employee> employeeList = service.listAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("employeeList", employeeList);
        return mav;
    }

    @RequestMapping("/add")
    public @ResponseBody String addNewEmp(@RequestParam String name, @RequestParam String surname,
                                          @RequestParam Date birthday, @RequestParam String department,
                                          @RequestParam Date dateGetJob,@RequestParam int salary) {
        Employee emp = new Employee();
        emp.setName(name);
        emp.setSurname(surname);
        emp.setBirthday(birthday);
        emp.setDepartment(department);
        emp.setDateGetJob(dateGetJob);
        emp.setSalary(salary);

        return "saved";
    }
    
//    @RequestMapping("/all")
//    public @ResponseBody Iterable<Employee> getAllEmp() {
//        return userRepository.findAll();
//    }
}
