package com.ylw.central.common.core.exception;

/**
 * 幂等性异常
 *
 * @author: YangLinWei
 * @createTime: 2020/12/10 3:54 下午
 */
public class IdempotencyException extends RuntimeException {
    private static final long serialVersionUID = 6610083281801529147L;

    public IdempotencyException(String message) {
        super(message);
    }
}
