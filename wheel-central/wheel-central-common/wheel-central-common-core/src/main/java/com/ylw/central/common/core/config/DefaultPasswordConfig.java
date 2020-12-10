package com.ylw.central.common.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 密码工具类
 *
 * @author: YangLinWei
 * @createTime: 2020/12/10 3:49 下午
 */
public class DefaultPasswordConfig {
    /**
     * 装配BCryptPasswordEncoder用户密码的匹配
     *
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
