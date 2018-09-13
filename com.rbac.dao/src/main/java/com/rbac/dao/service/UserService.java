package com.rbac.dao.service;


import com.rbac.dao.bean.User;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xuyuyong
 * @since 2018-09-12
 */
public interface UserService {

    List<User> queryAll();

    User query4Login(User user);

    List<User> pageQueryData(Map<String, Object> map);

    int pageQueryCount(Map<String, Object> map);

    void insertUser(User user);

    User queryById(Integer id);

    void updateUser(User user);

    void deleteUserById(Integer id);

    void deleteUsers(Map<String, Object> map);

    void deleteUserRoles(Map<String, Object> map);

    void insertUserRoles(Map<String, Object> map);

    List<Integer> queryRoleidsByUserid(Integer id);
}
