package com.canaan.dao;

import com.canaan.dao.model.TabTask;
import com.canaan.dao.model.TabTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TabTaskMapper {
    @SelectProvider(type=TabTaskSqlProvider.class, method="countByExample")
    long countByExample(TabTaskExample example);

    @DeleteProvider(type=TabTaskSqlProvider.class, method="deleteByExample")
    int deleteByExample(TabTaskExample example);

    @Delete({
        "delete from tab_task",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into tab_task (id, inst_id, ",
        "task_no, plat_corp_id, ",
        "corp_id, contract_no, ",
        "invoice_type_id, pay_type, ",
        "transaction_count, amount, ",
        "fee, file_name, end_at, ",
        "status, create_at, ",
        "update_at, remark)",
        "values (#{id,jdbcType=VARCHAR}, #{instId,jdbcType=VARCHAR}, ",
        "#{taskNo,jdbcType=VARCHAR}, #{platCorpId,jdbcType=VARCHAR}, ",
        "#{corpId,jdbcType=VARCHAR}, #{contractNo,jdbcType=VARCHAR}, ",
        "#{invoiceTypeId,jdbcType=VARCHAR}, #{payType,jdbcType=INTEGER}, ",
        "#{transactionCount,jdbcType=INTEGER}, #{amount,jdbcType=DECIMAL}, ",
        "#{fee,jdbcType=DECIMAL}, #{fileName,jdbcType=VARCHAR}, #{endAt,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=INTEGER}, #{createAt,jdbcType=TIMESTAMP}, ",
        "#{updateAt,jdbcType=TIMESTAMP}, #{remark,jdbcType=LONGVARCHAR})"
    })
    int insert(TabTask record);

    @InsertProvider(type=TabTaskSqlProvider.class, method="insertSelective")
    int insertSelective(TabTask record);

    @SelectProvider(type=TabTaskSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="inst_id", property="instId", jdbcType=JdbcType.VARCHAR),
        @Result(column="task_no", property="taskNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="plat_corp_id", property="platCorpId", jdbcType=JdbcType.VARCHAR),
        @Result(column="corp_id", property="corpId", jdbcType=JdbcType.VARCHAR),
        @Result(column="contract_no", property="contractNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="invoice_type_id", property="invoiceTypeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_type", property="payType", jdbcType=JdbcType.INTEGER),
        @Result(column="transaction_count", property="transactionCount", jdbcType=JdbcType.INTEGER),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="fee", property="fee", jdbcType=JdbcType.DECIMAL),
        @Result(column="file_name", property="fileName", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_at", property="endAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_at", property="updateAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<TabTask> selectByExampleWithBLOBs(TabTaskExample example);

    @SelectProvider(type=TabTaskSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="inst_id", property="instId", jdbcType=JdbcType.VARCHAR),
        @Result(column="task_no", property="taskNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="plat_corp_id", property="platCorpId", jdbcType=JdbcType.VARCHAR),
        @Result(column="corp_id", property="corpId", jdbcType=JdbcType.VARCHAR),
        @Result(column="contract_no", property="contractNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="invoice_type_id", property="invoiceTypeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_type", property="payType", jdbcType=JdbcType.INTEGER),
        @Result(column="transaction_count", property="transactionCount", jdbcType=JdbcType.INTEGER),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="fee", property="fee", jdbcType=JdbcType.DECIMAL),
        @Result(column="file_name", property="fileName", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_at", property="endAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_at", property="updateAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<TabTask> selectByExample(TabTaskExample example);

    @Select({
        "select",
        "id, inst_id, task_no, plat_corp_id, corp_id, contract_no, invoice_type_id, pay_type, ",
        "transaction_count, amount, fee, file_name, end_at, status, create_at, update_at, ",
        "remark",
        "from tab_task",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="inst_id", property="instId", jdbcType=JdbcType.VARCHAR),
        @Result(column="task_no", property="taskNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="plat_corp_id", property="platCorpId", jdbcType=JdbcType.VARCHAR),
        @Result(column="corp_id", property="corpId", jdbcType=JdbcType.VARCHAR),
        @Result(column="contract_no", property="contractNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="invoice_type_id", property="invoiceTypeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="pay_type", property="payType", jdbcType=JdbcType.INTEGER),
        @Result(column="transaction_count", property="transactionCount", jdbcType=JdbcType.INTEGER),
        @Result(column="amount", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="fee", property="fee", jdbcType=JdbcType.DECIMAL),
        @Result(column="file_name", property="fileName", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_at", property="endAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_at", property="updateAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.LONGVARCHAR)
    })
    TabTask selectByPrimaryKey(String id);

    @UpdateProvider(type=TabTaskSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TabTask record, @Param("example") TabTaskExample example);

    @UpdateProvider(type=TabTaskSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") TabTask record, @Param("example") TabTaskExample example);

    @UpdateProvider(type=TabTaskSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TabTask record, @Param("example") TabTaskExample example);

    @UpdateProvider(type=TabTaskSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TabTask record);

    @Update({
        "update tab_task",
        "set inst_id = #{instId,jdbcType=VARCHAR},",
          "task_no = #{taskNo,jdbcType=VARCHAR},",
          "plat_corp_id = #{platCorpId,jdbcType=VARCHAR},",
          "corp_id = #{corpId,jdbcType=VARCHAR},",
          "contract_no = #{contractNo,jdbcType=VARCHAR},",
          "invoice_type_id = #{invoiceTypeId,jdbcType=VARCHAR},",
          "pay_type = #{payType,jdbcType=INTEGER},",
          "transaction_count = #{transactionCount,jdbcType=INTEGER},",
          "amount = #{amount,jdbcType=DECIMAL},",
          "fee = #{fee,jdbcType=DECIMAL},",
          "file_name = #{fileName,jdbcType=VARCHAR},",
          "end_at = #{endAt,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER},",
          "create_at = #{createAt,jdbcType=TIMESTAMP},",
          "update_at = #{updateAt,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(TabTask record);

    @Update({
        "update tab_task",
        "set inst_id = #{instId,jdbcType=VARCHAR},",
          "task_no = #{taskNo,jdbcType=VARCHAR},",
          "plat_corp_id = #{platCorpId,jdbcType=VARCHAR},",
          "corp_id = #{corpId,jdbcType=VARCHAR},",
          "contract_no = #{contractNo,jdbcType=VARCHAR},",
          "invoice_type_id = #{invoiceTypeId,jdbcType=VARCHAR},",
          "pay_type = #{payType,jdbcType=INTEGER},",
          "transaction_count = #{transactionCount,jdbcType=INTEGER},",
          "amount = #{amount,jdbcType=DECIMAL},",
          "fee = #{fee,jdbcType=DECIMAL},",
          "file_name = #{fileName,jdbcType=VARCHAR},",
          "end_at = #{endAt,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER},",
          "create_at = #{createAt,jdbcType=TIMESTAMP},",
          "update_at = #{updateAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TabTask record);
}