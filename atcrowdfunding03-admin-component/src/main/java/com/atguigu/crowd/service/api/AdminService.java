package com.atguigu.crowd.service.api;

import com.atguigu.crowd.entity.Admin;

import java.util.List;

/**
 * @author ezuy
 * @date 21/6/28 10:39
 */
public interface AdminService {

    /**
     * save admin
     * @param admin
     */
    void saveAdmin(Admin admin);

    List<Admin> getAll();
}