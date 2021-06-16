package pers.kuroko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.kuroko.entity.Login;
import pers.kuroko.service.LoginService;

import java.util.Map;

//指定在浏览器的路径
@RequestMapping("loginController")
@Controller//注解，表明是Controller
public class LoginController {

    @Autowired
    @Qualifier("loginService")
    LoginService loginService;


    @RequestMapping(value = "homePage")
    public String homePage(Login login, Map<String, Object> map) {
        if(login.getUsername().equals("boss")) {
            int i = loginService.doLogin(login);
            if (i > 0) {
                map.put("login", login);
                return "redirect:/departmentController/getAllDepartment";
            } else {
                return "error";
            }
        }else if (login.getUsername().equals("dept")){
            int i = loginService.doLogin(login);
            if (i > 0) {
                map.put("login", login);
                return "redirect:/managerController/getAllManager";
            } else {
                return "error";
            }
        }else if (login.getUsername().equals("manager")){
            int i = loginService.doLogin(login);
            if (i > 0) {
                map.put("login", login);
                return "redirect:/groupController/getAllGroup";
            } else {
                return "error";
            }
        }else if (login.getUsername().equals("group")){
            int i = loginService.doLogin(login);
            if (i > 0) {
                map.put("login", login);
                return "redirect:/leaderController/getAllLeader";
            } else {
                return "error";
            }
        }else {
            int i = loginService.doLogin(login);
            if (i > 0) {
                map.put("login", login);
                return "redirect:/employeeController/getAllEmployee";
            } else {
                return "error";
            }
        }
    }




    @RequestMapping("login")
    public String login() {
        return "login";
    }

}
