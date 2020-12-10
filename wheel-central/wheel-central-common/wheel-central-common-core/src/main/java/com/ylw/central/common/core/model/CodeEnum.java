package com.ylw.central.common.core.model;

/**
 * 响应码枚举
 *
 * @author: YangLinWei
 * @createTime: 2020/12/10 3:58 下午
 */
public enum CodeEnum {
    SUCCESS(0),
    ERROR(1);

    private Integer code;

    CodeEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
