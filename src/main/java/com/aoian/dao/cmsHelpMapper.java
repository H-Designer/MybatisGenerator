package com.aoian.dao;

import com.aoian.entity.cmsHelp;
import com.aoian.entity.cmsHelpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface cmsHelpMapper {
    long countByExample(cmsHelpExample example);

    int deleteByExample(cmsHelpExample example);

    int insert(cmsHelp record);

    int insertSelective(cmsHelp record);

    List<cmsHelp> selectByExampleWithBLOBs(cmsHelpExample example);

    List<cmsHelp> selectByExample(cmsHelpExample example);

    int updateByExampleSelective(@Param("record") cmsHelp record, @Param("example") cmsHelpExample example);

    int updateByExampleWithBLOBs(@Param("record") cmsHelp record, @Param("example") cmsHelpExample example);

    int updateByExample(@Param("record") cmsHelp record, @Param("example") cmsHelpExample example);
}