package com.ylw.central.common.core.annotation;

import java.lang.annotation.*;

/**
 * 请求的方法参数上添加该注解，则注入当前登录账号的应用id
 *
 * @author: YangLinWei
 * @createTime: 2020/12/10 3:37 下午
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoginClient {
}
