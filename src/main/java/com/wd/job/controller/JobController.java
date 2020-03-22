package com.wd.job.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wd.job.pojo.Compagnie;
import com.wd.job.pojo.Jobs;
import com.wd.job.pojo.User;
import com.wd.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("job")
public class JobController {
    @Autowired
    private JobService jobService;

    //跳转修改
    @RequestMapping("mod_password")
    public String toUser(){
        return "mod_password";
    }
    @RequestMapping("add_basicInfo")
    public String toBasicInfo(){
        return "add_basicInfo";
    }
    @RequestMapping("mod_basicInfo")
    public String modeBasicInfo(){
        return "mod_basicInfo";
    }
    @RequestMapping("jobs_list")
    public String jobsList(Model model,@RequestParam(required = true,defaultValue = "1")Integer pageNum){
        PageHelper.startPage(pageNum,3);
        //查询数据
        List<Jobs> list = this.jobService.queryAll();
        //存入到model中
        //   model.addAttribute("list",list);
        PageInfo<Jobs> page = new PageInfo<>(list);
        model.addAttribute("page",page);
        return "jobs_list";
    }

    //展示
    @RequestMapping("all")
    public String queryAll(Model model,@RequestParam(required = true,defaultValue = "1")Integer pageNum){
        PageHelper.startPage(pageNum,3);
        //查询数据
        List<Jobs> list = this.jobService.queryAll();
        //存入到model中
        //model.addAttribute("list",list);
        PageInfo<Jobs> page = new PageInfo<>(list);
        model.addAttribute("page",page);
        return "jobs_list";

    }

    //去添加页面
    @RequestMapping("addJob")
    public String toaddJoB(){
        return "add_job";
    }

    //添加
    @RequestMapping("toaddJob")
    public String addJobs(Jobs job){
        //添加下架时间
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        job.setDowntime(dateFormat.format(date));
        //添加审批
        job.setTypes("未审批");
        job.setNums(0);
        this.jobService.insertJob(job);
        return "redirect:all";
    }


    //去修改
    @RequestMapping("toeditJob")
    public String toeditJob(@RequestParam("eid")Integer eid,Model model){
        Jobs job = this.jobService.findById(eid);
        model.addAttribute("job",job);
        return "mod_job";
    }

    //修改
    @RequestMapping("editJob")
    public String editJob(Jobs job){
        //添加下架时间
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        job.setDowntime(dateFormat.format(date));
        //添加审批
        job.setTypes("未审批");
        job.setNums(0);
        this.jobService.updateJob(job);
        return "redirect:all";
    }

    //删除
    @RequestMapping("deleteJob")
    public String DeleteJob(@RequestParam("eid")Integer eid){
       this.jobService.deleteById(eid);
       return "redirect:all";
    }
}
