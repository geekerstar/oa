package com.geekerstar.oa.biz;

import com.geekerstar.oa.entity.Employee;

public interface GlobalBiz {
    Employee login(String sn, String password);

    void changePassword(Employee employee);
}
