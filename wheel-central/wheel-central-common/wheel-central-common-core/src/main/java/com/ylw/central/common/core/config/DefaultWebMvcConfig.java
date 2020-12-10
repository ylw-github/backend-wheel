package com.ylw.central.common.core.config;

import com.ylw.central.common.core.feign.UserService;
import com.ylw.central.common.core.resolver.ClientArgumentResolver;
import com.ylw.central.common.core.resolver.TokenArgumentResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;


/**
 * 默认SpringMVC拦截器
 *
 * @author: YangLinWei
 * @createTime: 2020/12/10 3:49 下午
 */
public class DefaultWebMvcConfig implements WebMvcConfigurer {
	@Lazy
	@Autowired
	private UserService userService;

	/**
	 * Token参数解析
	 *
	 * @param argumentResolvers 解析类
	 */
	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		//注入用户信息
		argumentResolvers.add(new TokenArgumentResolver(userService));
		//注入应用信息
		argumentResolvers.add(new ClientArgumentResolver());
	}
}
