package com.htby.tech.qilian.check.sys.data.dao;

import com.htby.tech.qilian.check.sys.data.entity.TAnnouncement;
import com.htby.tech.qilian.check.sys.data.entity.TAnnouncementExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TAnnouncementMapper {
    @SelectProvider(type=TAnnouncementSqlProvider.class, method="countByExample")
    long countByExample(TAnnouncementExample example);

    @DeleteProvider(type=TAnnouncementSqlProvider.class, method="deleteByExample")
    int deleteByExample(TAnnouncementExample example);

    @Insert({
        "insert into t_announcement (id, announcement_id, ",
        "content, create_by, ",
        "create_time, send_time, ",
        "status, title, update_by, ",
        "update_time)",
        "values (#{id,jdbcType=BIGINT}, #{announcementId,jdbcType=VARCHAR}, ",
        "#{content,jdbcType=VARCHAR}, #{createBy,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{sendTime,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=TINYINT}, #{title,jdbcType=VARCHAR}, #{updateBy,jdbcType=VARCHAR}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(TAnnouncement record);

    @InsertProvider(type=TAnnouncementSqlProvider.class, method="insertSelective")
    int insertSelective(TAnnouncement record);

    @SelectProvider(type=TAnnouncementSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="announcement_id", property="announcementId", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="send_time", property="sendTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_by", property="updateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<TAnnouncement> selectByExample(TAnnouncementExample example);

    @UpdateProvider(type=TAnnouncementSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TAnnouncement record, @Param("example") TAnnouncementExample example);

    @UpdateProvider(type=TAnnouncementSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TAnnouncement record, @Param("example") TAnnouncementExample example);
}