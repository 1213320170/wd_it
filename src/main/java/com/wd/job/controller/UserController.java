package com.wd.job.controller;

import com.wd.job.pojo.User;
import com.wd.job.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService ;

    @RequestMapping("tologin")
    public String tologin(){
        return "index";
    }
    //登录
    @RequestMapping("login")
    public String login(User user, Model model,HttpSession session){
        session.setAttribute("user",user);
        List<User> userList = userService.findUser(user);
        if (userList.size()>0){
            return  "redirect:job/all" ;
        }else {
            model.addAttribute("err","密码或账号有误");
            return "index";
        }
    }
    //修改
    @RequestMapping("job/update")
    public String update(User user){
        userService.update(user);
        return "redirect:all" ;
    }
}
