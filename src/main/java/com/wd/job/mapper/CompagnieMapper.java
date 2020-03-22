package com.wd.job.mapper;

import com.wd.job.pojo.Compagnie;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import tk.mybatis.mapper.common.Mapper;

public interface CompagnieMapper extends Mapper<Compagnie> {

    @Insert("insert into compagnie values(#{cid},#{caree},#{type},#{trade},#{phone2},#{phone},#{fax},#{fax2},#{fax22},#{fax222},#{salary},#{salary2},#{other})")
    @Options(useGeneratedKeys = true,keyProperty = "cid")
    void insertBy(Compagnie compagnie);
}
