package com.aoian.dao;

import com.aoian.entity.cmsSubject;
import com.aoian.entity.cmsSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface cmsSubjectMapper {
    long countByExample(cmsSubjectExample example);

    int deleteByExample(cmsSubjectExample example);

    int insert(cmsSubject record);

    int insertSelective(cmsSubject record);

    List<cmsSubject> selectByExampleWithBLOBs(cmsSubjectExample example);

    List<cmsSubject> selectByExample(cmsSubjectExample example);

    int updateByExampleSelective(@Param("record") cmsSubject record, @Param("example") cmsSubjectExample example);

    int updateByExampleWithBLOBs(@Param("record") cmsSubject record, @Param("example") cmsSubjectExample example);

    int updateByExample(@Param("record") cmsSubject record, @Param("example") cmsSubjectExample example);
}