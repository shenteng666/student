package com.st.mapper;

import com.st.domain.announcement;
import com.st.domain.announcementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface announcementMapper {
    long countByExample(announcementExample example);

    int deleteByExample(announcementExample example);

    int insert(announcement record);

    int insertSelective(announcement record);

    List<announcement> selectByExample(announcementExample example);

    int updateByExampleSelective(@Param("record") announcement record, @Param("example") announcementExample example);

    int updateByExample(@Param("record") announcement record, @Param("example") announcementExample example);
}