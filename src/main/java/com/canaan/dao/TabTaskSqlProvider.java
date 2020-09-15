package com.canaan.dao;

import com.canaan.dao.model.TabTask;
import com.canaan.dao.model.TabTaskExample.Criteria;
import com.canaan.dao.model.TabTaskExample.Criterion;
import com.canaan.dao.model.TabTaskExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TabTaskSqlProvider {
    public String countByExample(TabTaskExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tab_task");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TabTaskExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tab_task");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TabTask record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tab_task");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getInstId() != null) {
            sql.VALUES("inst_id", "#{instId,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskNo() != null) {
            sql.VALUES("task_no", "#{taskNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPlatCorpId() != null) {
            sql.VALUES("plat_corp_id", "#{platCorpId,jdbcType=VARCHAR}");
        }
        
        if (record.getCorpId() != null) {
            sql.VALUES("corp_id", "#{corpId,jdbcType=VARCHAR}");
        }
        
        if (record.getContractNo() != null) {
            sql.VALUES("contract_no", "#{contractNo,jdbcType=VARCHAR}");
        }
        
        if (record.getInvoiceTypeId() != null) {
            sql.VALUES("invoice_type_id", "#{invoiceTypeId,jdbcType=VARCHAR}");
        }
        
        if (record.getPayType() != null) {
            sql.VALUES("pay_type", "#{payType,jdbcType=INTEGER}");
        }
        
        if (record.getTransactionCount() != null) {
            sql.VALUES("transaction_count", "#{transactionCount,jdbcType=INTEGER}");
        }
        
        if (record.getAmount() != null) {
            sql.VALUES("amount", "#{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getFee() != null) {
            sql.VALUES("fee", "#{fee,jdbcType=DECIMAL}");
        }
        
        if (record.getFileName() != null) {
            sql.VALUES("file_name", "#{fileName,jdbcType=VARCHAR}");
        }
        
        if (record.getEndAt() != null) {
            sql.VALUES("end_at", "#{endAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreateAt() != null) {
            sql.VALUES("create_at", "#{createAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateAt() != null) {
            sql.VALUES("update_at", "#{updateAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(TabTaskExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("inst_id");
        sql.SELECT("task_no");
        sql.SELECT("plat_corp_id");
        sql.SELECT("corp_id");
        sql.SELECT("contract_no");
        sql.SELECT("invoice_type_id");
        sql.SELECT("pay_type");
        sql.SELECT("transaction_count");
        sql.SELECT("amount");
        sql.SELECT("fee");
        sql.SELECT("file_name");
        sql.SELECT("end_at");
        sql.SELECT("status");
        sql.SELECT("create_at");
        sql.SELECT("update_at");
        sql.SELECT("remark");
        sql.FROM("tab_task");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(TabTaskExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("inst_id");
        sql.SELECT("task_no");
        sql.SELECT("plat_corp_id");
        sql.SELECT("corp_id");
        sql.SELECT("contract_no");
        sql.SELECT("invoice_type_id");
        sql.SELECT("pay_type");
        sql.SELECT("transaction_count");
        sql.SELECT("amount");
        sql.SELECT("fee");
        sql.SELECT("file_name");
        sql.SELECT("end_at");
        sql.SELECT("status");
        sql.SELECT("create_at");
        sql.SELECT("update_at");
        sql.FROM("tab_task");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        TabTask record = (TabTask) parameter.get("record");
        TabTaskExample example = (TabTaskExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tab_task");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getInstId() != null) {
            sql.SET("inst_id = #{record.instId,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskNo() != null) {
            sql.SET("task_no = #{record.taskNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPlatCorpId() != null) {
            sql.SET("plat_corp_id = #{record.platCorpId,jdbcType=VARCHAR}");
        }
        
        if (record.getCorpId() != null) {
            sql.SET("corp_id = #{record.corpId,jdbcType=VARCHAR}");
        }
        
        if (record.getContractNo() != null) {
            sql.SET("contract_no = #{record.contractNo,jdbcType=VARCHAR}");
        }
        
        if (record.getInvoiceTypeId() != null) {
            sql.SET("invoice_type_id = #{record.invoiceTypeId,jdbcType=VARCHAR}");
        }
        
        if (record.getPayType() != null) {
            sql.SET("pay_type = #{record.payType,jdbcType=INTEGER}");
        }
        
        if (record.getTransactionCount() != null) {
            sql.SET("transaction_count = #{record.transactionCount,jdbcType=INTEGER}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("amount = #{record.amount,jdbcType=DECIMAL}");
        }
        
        if (record.getFee() != null) {
            sql.SET("fee = #{record.fee,jdbcType=DECIMAL}");
        }
        
        if (record.getFileName() != null) {
            sql.SET("file_name = #{record.fileName,jdbcType=VARCHAR}");
        }
        
        if (record.getEndAt() != null) {
            sql.SET("end_at = #{record.endAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getCreateAt() != null) {
            sql.SET("create_at = #{record.createAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateAt() != null) {
            sql.SET("update_at = #{record.updateAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tab_task");
        
        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("inst_id = #{record.instId,jdbcType=VARCHAR}");
        sql.SET("task_no = #{record.taskNo,jdbcType=VARCHAR}");
        sql.SET("plat_corp_id = #{record.platCorpId,jdbcType=VARCHAR}");
        sql.SET("corp_id = #{record.corpId,jdbcType=VARCHAR}");
        sql.SET("contract_no = #{record.contractNo,jdbcType=VARCHAR}");
        sql.SET("invoice_type_id = #{record.invoiceTypeId,jdbcType=VARCHAR}");
        sql.SET("pay_type = #{record.payType,jdbcType=INTEGER}");
        sql.SET("transaction_count = #{record.transactionCount,jdbcType=INTEGER}");
        sql.SET("amount = #{record.amount,jdbcType=DECIMAL}");
        sql.SET("fee = #{record.fee,jdbcType=DECIMAL}");
        sql.SET("file_name = #{record.fileName,jdbcType=VARCHAR}");
        sql.SET("end_at = #{record.endAt,jdbcType=TIMESTAMP}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("create_at = #{record.createAt,jdbcType=TIMESTAMP}");
        sql.SET("update_at = #{record.updateAt,jdbcType=TIMESTAMP}");
        sql.SET("remark = #{record.remark,jdbcType=LONGVARCHAR}");
        
        TabTaskExample example = (TabTaskExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tab_task");
        
        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("inst_id = #{record.instId,jdbcType=VARCHAR}");
        sql.SET("task_no = #{record.taskNo,jdbcType=VARCHAR}");
        sql.SET("plat_corp_id = #{record.platCorpId,jdbcType=VARCHAR}");
        sql.SET("corp_id = #{record.corpId,jdbcType=VARCHAR}");
        sql.SET("contract_no = #{record.contractNo,jdbcType=VARCHAR}");
        sql.SET("invoice_type_id = #{record.invoiceTypeId,jdbcType=VARCHAR}");
        sql.SET("pay_type = #{record.payType,jdbcType=INTEGER}");
        sql.SET("transaction_count = #{record.transactionCount,jdbcType=INTEGER}");
        sql.SET("amount = #{record.amount,jdbcType=DECIMAL}");
        sql.SET("fee = #{record.fee,jdbcType=DECIMAL}");
        sql.SET("file_name = #{record.fileName,jdbcType=VARCHAR}");
        sql.SET("end_at = #{record.endAt,jdbcType=TIMESTAMP}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("create_at = #{record.createAt,jdbcType=TIMESTAMP}");
        sql.SET("update_at = #{record.updateAt,jdbcType=TIMESTAMP}");
        
        TabTaskExample example = (TabTaskExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TabTask record) {
        SQL sql = new SQL();
        sql.UPDATE("tab_task");
        
        if (record.getInstId() != null) {
            sql.SET("inst_id = #{instId,jdbcType=VARCHAR}");
        }
        
        if (record.getTaskNo() != null) {
            sql.SET("task_no = #{taskNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPlatCorpId() != null) {
            sql.SET("plat_corp_id = #{platCorpId,jdbcType=VARCHAR}");
        }
        
        if (record.getCorpId() != null) {
            sql.SET("corp_id = #{corpId,jdbcType=VARCHAR}");
        }
        
        if (record.getContractNo() != null) {
            sql.SET("contract_no = #{contractNo,jdbcType=VARCHAR}");
        }
        
        if (record.getInvoiceTypeId() != null) {
            sql.SET("invoice_type_id = #{invoiceTypeId,jdbcType=VARCHAR}");
        }
        
        if (record.getPayType() != null) {
            sql.SET("pay_type = #{payType,jdbcType=INTEGER}");
        }
        
        if (record.getTransactionCount() != null) {
            sql.SET("transaction_count = #{transactionCount,jdbcType=INTEGER}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("amount = #{amount,jdbcType=DECIMAL}");
        }
        
        if (record.getFee() != null) {
            sql.SET("fee = #{fee,jdbcType=DECIMAL}");
        }
        
        if (record.getFileName() != null) {
            sql.SET("file_name = #{fileName,jdbcType=VARCHAR}");
        }
        
        if (record.getEndAt() != null) {
            sql.SET("end_at = #{endAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreateAt() != null) {
            sql.SET("create_at = #{createAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateAt() != null) {
            sql.SET("update_at = #{updateAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TabTaskExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}