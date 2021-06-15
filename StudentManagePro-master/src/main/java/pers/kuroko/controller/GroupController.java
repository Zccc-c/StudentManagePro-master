package pers.kuroko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.kuroko.entity.Department;
import pers.kuroko.entity.Group;
import pers.kuroko.service.GroupService;

import java.util.List;
import java.util.Map;

@RequestMapping("groupController")
@Controller
public class GroupController {

    @Autowired
    private GroupService groupService;

    @RequestMapping("getAllGroup")
    public String getAllGroup(Map<String, List<Group>> map){
        List<Group> groups = groupService.queryAllGroup();
        map.put("groups",groups);
        return "homePage";
    }

    @ResponseBody
    @RequestMapping(value = "addGroup")
    public String addGroup(Group group){
        //判断该小组号是否已经存在
        Group groupById = groupService.queryGroupById(group.getGroupId());
        if(groupById != null){
            return "isExist";
        }
        //加入数据库，看返回值决定是否成功
        int i= groupService.addGroup(group);
        if(i > 0){
            return "success";
        }else{
            return "error";
        }
    }

    @ResponseBody
    @RequestMapping(value = "deleteGroupById")
    public String deleteGroupById(int id){
        int i = groupService.deleteGroupById(id);
        if(i > 0){
            return "success";
        }else {
            return "error";
        }
    }

    @ResponseBody
    @RequestMapping(value = "updateGroup")
    public String updateGroup(Group group){
        //加入数据库，看返回值决定是否成功
        int i = groupService.updateGroup(group);
        if(i > 0){
            return "success";
        }else{
            return "error";
        }
    }
}

