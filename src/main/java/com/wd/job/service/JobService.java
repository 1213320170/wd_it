package com.wd.job.service;

import com.wd.job.mapper.JobMapper;
import com.wd.job.pojo.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobMapper jobMapper;

    public List<Jobs> queryAll() {
        return this.jobMapper.selectAll();
    }

    public void deleteById(Integer eid) {
        this.jobMapper.deleteByPrimaryKey(eid);
    }

    public void insertJob(Jobs job) {
        this.jobMapper.insert(job);
    }

    public Jobs findById(Integer eid) {
        return this.jobMapper.selectByPrimaryKey(eid);
    }

    public void updateJob(Jobs job) {
        this.jobMapper.updateByPrimaryKey(job);
    }
}
