package com.geekerstar.oa.dao;

import com.geekerstar.oa.entity.DealRecord;
import com.geekerstar.oa.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("dealRecordDao")
public interface DealRecordDao {
    void insert(DealRecord dealRecord);

    List<DealRecord> selectByClaimVoucher(int cvid);
}
