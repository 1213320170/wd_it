package com.wd.job.controller;

import com.wd.job.pojo.Compagnie;
import com.wd.job.service.CompagnieService;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CompagnieController {
    @Autowired
    private CompagnieService compagnieService;

    //添加
    @RequestMapping("addMessage")
    public String addMessage(Compagnie compagnie,HttpSession session){
        this.compagnieService.add(compagnie);
        Integer cid = compagnie.getCid();
        Compagnie cpg = this.compagnieService.findById(cid);
        session.setAttribute("cpg",cpg);
        return "redirect:job/all";
    }

    //修改
    @RequestMapping("editMessage")
    public String editMessiage (Compagnie compagnie,HttpSession session){
        session.setAttribute("cpg",compagnie);
        this.compagnieService.update(compagnie);
        return "redirect:job/all";
    }

    public String add (){
        return null;
    }
}
