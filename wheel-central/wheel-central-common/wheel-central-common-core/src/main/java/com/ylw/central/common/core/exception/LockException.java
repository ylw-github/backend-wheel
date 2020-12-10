package com.ylw.central.common.core.exception;

/**
 * 分布式锁异常
 *
 * @author: YangLinWei
 * @createTime: 2020/12/10 3:54 下午
 */
public class LockException extends RuntimeException {
    private static final long serialVersionUID = 6610083281801529147L;

    public LockException(String message) {
        super(message);
    }
}
