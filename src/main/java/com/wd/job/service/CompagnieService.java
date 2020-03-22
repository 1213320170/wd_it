package com.wd.job.service;

        import com.wd.job.mapper.CompagnieMapper;
        import com.wd.job.pojo.Compagnie;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

@Service
public class CompagnieService {
    @Autowired
    private CompagnieMapper compagnieMapper ;


    public void add(Compagnie compagnie) {
        this.compagnieMapper.insertBy(compagnie);
    }

    public Compagnie findById(Integer cid) {
        return compagnieMapper.selectByPrimaryKey(cid);
    }

    public void update(Compagnie compagnie) {
        this.compagnieMapper.updateByPrimaryKey(compagnie);
    }
}
