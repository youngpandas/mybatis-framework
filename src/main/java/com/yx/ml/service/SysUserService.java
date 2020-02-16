package com.yx.ml.service;

import com.github.pagehelper.PageInfo;
import com.yx.ml.pojo.SysUser;

import java.util.List;

public interface SysUserService {

    SysUser getById(Integer id);

    PageInfo<SysUser> getAll(int page, int size);

    void save(SysUser sysUser);

    void update(SysUser sysUser);

    void deleteById(Integer id);

    SysUser getByUsername(String username);

    List<SysUser> getAllByUsernameContains(String username, int page, int size);
}
