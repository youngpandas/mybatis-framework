package com.yx.ml.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yx.ml.mapper.SysUserMapper;
import com.yx.ml.pojo.SysUser;
import com.yx.ml.pojo.SysUserExample;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;


@SpringBootTest
class SysUserServiceImplTest {

    @Resource
    private SysUserMapper sysUserMapper;

    @Test
    void getById() {
        Integer id = 2;
        System.out.println(sysUserMapper.selectById(id));
    }

    @Test
    void getAll() {
        PageHelper.startPage(3, 1);
        List<SysUser> userList = sysUserMapper.selectByExample(null);
        System.out.println(userList);
        System.out.println(new PageInfo<>(userList));
    }

    @Test
    void save() {
    }

    @Test
    void update() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void getByUsername() {
    }

    @Test
    void getAllByUsernameContains() {
    }
}