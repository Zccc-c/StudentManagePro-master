package pers.kuroko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.kuroko.entity.Department;
import pers.kuroko.service.DepartmentService;

import java.util.List;
import java.util.Map;

@RequestMapping("departmentController")
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("getAllDepartment")
    public String getAllDepartment(Map<String, List<Department>> map){
        List<Department> departments =departmentService.queryAllDepartment();
        map.put("departments",departments);
        return "homePage";
    }

    @ResponseBody
    @RequestMapping(value = "addDepartment")
    public String addDepartment(Department department){
        //判断该部门号是否已经存在
        Department departmentById = departmentService.queryDepartmentById(department.getDeptId());
        if(departmentById != null){
            return "isExist";
        }
        //加入数据库，看返回值决定是否成功
        int i=departmentService.addDepartment(department);
        if(i > 0){
            return "success";
        }else{
            return "error";
        }
    }

    @ResponseBody
    @RequestMapping(value = "deleteDepartmentById")
    public String deleteDepartmentById(int id){
        int i = departmentService.deleteDepartmentById(id);
        if(i > 0){
            return "success";
        }else {
            return "error";
        }
    }

    @ResponseBody
    @RequestMapping(value = "updateDepartment")
    public String updateDepartment(Department department){
        //加入数据库，看返回值决定是否成功
        int i = departmentService.updateDepartment(department);
        if(i > 0){
            return "success";
        }else{
            return "error";
        }
    }
}
