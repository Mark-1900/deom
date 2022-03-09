package com.turingcourt.dao;

import com.turingcourt.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author Cyanogen
 * @since 2022-03-08 21:49:42
 */
@Mapper
public interface UserDao {

    /**
     * 查询用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    User getUser(Integer id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param user 实例对象
     * @return 对象列表
     */
    List<User> queryAll(User user);

    /**
     * 用户注册
     *
     * @param user 注册用户
     * @return 影响行数
     */
    int register(User user);

    /**
     * 更改用户信息
     *
     * @param user 更新的用户信息
     * @return 影响行数
     */
    int update(User user);

    /**
     * 用户名校验
     *
     * @param username 用户名
     * @return 是否存在用户
     */
    Boolean checkAccount(String username);

}