package pers.kuroko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.kuroko.entity.Department;
import pers.kuroko.entity.Leader;
import pers.kuroko.service.LeaderService;

import java.util.List;
import java.util.Map;

@RequestMapping("leaderController")
@Controller
public class LeaderController {

    @Autowired
    private LeaderService leaderService;

    @RequestMapping("getAllLeader")
    public String getAllLeader(Map<String, List<Leader>> map){
        List<Leader> leaders = leaderService.queryAllLeader();
        map.put("leaders",leaders);
        return "LeaderhomePage";
    }

    @ResponseBody
    @RequestMapping(value = "addLeader")
    public String addLeader(Leader leader){
        //判断该领导号是否已经存在
        Leader leaderById = leaderService.queryLeaderById(leader.getLeaderId());
        if(leaderById != null){
            return "isExist";
        }
        //加入数据库，看返回值决定是否成功
        int i= leaderService.addLeader(leader);
        if(i > 0){
            return "success";
        }else{
            return "error";
        }
    }

    @ResponseBody
    @RequestMapping(value = "deleteLeaderById")
    public String deleteLeaderById(int id){
        int i = leaderService.deleteLeaderById(id);
        if(i > 0){
            return "success";
        }else {
            return "error";
        }
    }

    @ResponseBody
    @RequestMapping(value = "updateLeader")
    public String updateLeader(Leader leader){
        //加入数据库，看返回值决定是否成功
        int i = leaderService.updateLeader(leader);
        if(i > 0){
            return "success";
        }else{
            return "error";
        }
    }
}
