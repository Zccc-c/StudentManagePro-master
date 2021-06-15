package pers.kuroko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.kuroko.entity.Department;
import pers.kuroko.entity.Employee;
import pers.kuroko.service.DepartmentService;
import pers.kuroko.service.EmployeeService;

import java.util.List;
import java.util.Map;

@RequestMapping("employeeController")
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("getAllEmployee")
    public String getAllEmployee(Map<String, List<Employee>> map){
        List<Employee> employees = employeeService.queryAllEmployee();
        map.put("employees",employees);
        return "homePage";
    }

    @ResponseBody
    @RequestMapping(value = "addEmployee")
    public String addEmployee(Employee employee){
        //判断该部员号是否已经存在
        Employee employeeById = employeeService.queryEmployeeById(employee.getEmpId());
        if(employeeById != null){
            return "isExist";
        }
        //加入数据库，看返回值决定是否成功
        int i= employeeService.addEmployee(employee);
        if(i > 0){
            return "success";
        }else{
            return "error";
        }
    }

    @ResponseBody
    @RequestMapping(value = "deleteEmployeeById")
    public String deleteEmployeeById(int id){
        int i = employeeService.deleteEmployeeById(id);
        if(i > 0){
            return "success";
        }else {
            return "error";
        }
    }

    @ResponseBody
    @RequestMapping(value = "updateEmployee")
    public String updateEmployee(Employee employee){
        //加入数据库，看返回值决定是否成功
        int i = employeeService.updateEmployee(employee);
        if(i > 0){
            return "success";
        }else{
            return "error";
        }
    }
}