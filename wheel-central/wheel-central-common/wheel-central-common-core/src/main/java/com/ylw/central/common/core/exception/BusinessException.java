package com.ylw.central.common.core.exception;

/**
 * 业务异常
 *
 * @author: YangLinWei
 * @createTime: 2020/12/10 3:53 下午
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 6610083281801529147L;

    public BusinessException(String message) {
        super(message);
    }
}
