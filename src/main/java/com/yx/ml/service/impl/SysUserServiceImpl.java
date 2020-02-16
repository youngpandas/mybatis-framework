package com.yx.ml.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yx.ml.mapper.SysUserMapper;
import com.yx.ml.pojo.SysUser;
import com.yx.ml.pojo.SysUserExample;
import com.yx.ml.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser getById(Integer id) {
        return sysUserMapper.selectById(id);
    }

    @Override
    public PageInfo<SysUser> getAll(int page, int size) {
        PageHelper.startPage(page, size);
        List<SysUser> userList = sysUserMapper.selectByExample(null);
        return new PageInfo<>(userList);
    }

    @Override
    public void save(SysUser sysUser) {

    }

    @Override
    public void update(SysUser sysUser) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public SysUser getByUsername(String username) {
        return null;
    }

    @Override
    public List<SysUser> getAllByUsernameContains(String username, int page, int size) {
        return null;
    }
}
