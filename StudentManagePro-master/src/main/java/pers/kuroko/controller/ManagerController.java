package pers.kuroko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.kuroko.entity.Department;
import pers.kuroko.entity.Manager;
import pers.kuroko.service.ManagerService;

import java.util.List;
import java.util.Map;

@RequestMapping("managerController")
@Controller
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @RequestMapping("getAllManager")
    public String getAllManager(Map<String, List<Manager>> map){
        List<Manager> managers = managerService.queryAllManager();
        map.put("managers",managers);
        return "homePage";
    }

    @ResponseBody
    @RequestMapping(value = "addManager")
    public String addManager(Manager manager){
        //判断该管理号是否已经存在
        Manager managerById = managerService.queryManagerById(manager.getManagerId());
        if(managerById != null){
            return "isExist";
        }
        //加入数据库，看返回值决定是否成功
        int i= managerService.addManager(manager);
        if(i > 0){
            return "success";
        }else{
            return "error";
        }
    }

    @ResponseBody
    @RequestMapping(value = "deleteManagerById")
    public String deleteManagerById(int id){
        int i = managerService.deleteManagerById(id);
        if(i > 0){
            return "success";
        }else {
            return "error";
        }
    }

    @ResponseBody
    @RequestMapping(value = "updateManager")
    public String updateManager(Manager manager){
        //加入数据库，看返回值决定是否成功
        int i = managerService.updateManager(manager);
        if(i > 0){
            return "success";
        }else{
            return "error";
        }
    }
}
