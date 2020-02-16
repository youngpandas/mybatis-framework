package com.yx.ml.mapper;

import com.yx.ml.pojo.SysUser;
import com.yx.ml.pojo.SysUserExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class SysUserMapperTest {

    @Resource
    private SysUserMapper sysUserMapper;

    @Test
    void selectById() {
        Integer id = 2;
        SysUser sysUser = sysUserMapper.selectById(id);
        System.out.println(sysUser);
    }

    @Test
    void selectByUsername() {
        String username = "ss";
        SysUser sysUser = sysUserMapper.selectByUsername(username);
        System.out.println(sysUser);
    }

    @Test
    void selectByExample() {
        SysUserExample example = new SysUserExample();
        example.createCriteria();
        System.out.println(sysUserMapper.selectByExample(example));
    }


}