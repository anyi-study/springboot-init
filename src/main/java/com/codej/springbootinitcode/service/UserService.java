package com.codej.springbootinitcode.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codej.springbootinitcode.model.domain.User;

import javax.servlet.http.HttpServletRequest;


/**
* @author laoluo
* @description 针对表【user】的数据库操作Service
* @createDate 2024-07-28 13:14:06
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @param userCode    星球编号
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String userCode);
    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);
    /**
     * 用户脱敏
     *
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);
    // [加入编程导航](https://t.zsxq.com/0emozsIJh) 深耕编程提升【两年半】、国内净值【最高】的编程社群、用心服务【20000+】求学者、帮你自学编程【不走弯路】
    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}
