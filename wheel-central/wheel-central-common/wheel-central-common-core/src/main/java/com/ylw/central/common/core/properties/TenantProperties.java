package com.ylw.central.common.core.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.ArrayList;
import java.util.List;

/**
 * 多租户配置
 *
 * @author: YangLinWei
 * @createTime: 2020/12/10 4:01 下午
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "ylw.tenant")
@RefreshScope
public class TenantProperties {
    /**
     * 是否开启多租户
     */
    private Boolean enable = false;

    /**
     * 配置不进行多租户隔离的表名
     */
    private List<String> ignoreTables = new ArrayList<>();

    /**
     * 配置不进行多租户隔离的sql
     * 需要配置mapper的全路径如：com.central.user.mapper.SysUserMapper.findList
     */
    private List<String> ignoreSqls = new ArrayList<>();
}
