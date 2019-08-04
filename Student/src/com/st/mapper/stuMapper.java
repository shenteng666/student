package com.st.mapper;

import com.st.domain.stu;
import com.st.domain.stuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface stuMapper {
    long countByExample(stuExample example);

    int deleteByExample(stuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(stu record);

    int insertSelective(stu record);

    List<stu> selectByExample(stuExample example);

    stu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") stu record, @Param("example") stuExample example);

    int updateByExample(@Param("record") stu record, @Param("example") stuExample example);

    int updateByPrimaryKeySelective(stu record);

    int updateByPrimaryKey(stu record);
}