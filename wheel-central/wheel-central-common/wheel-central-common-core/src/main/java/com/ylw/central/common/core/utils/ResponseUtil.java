package com.ylw.central.common.core.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ylw.central.common.core.model.Result;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author: YangLinWei
 * @createTime: 2020/12/10 4:25 下午
 */

public class ResponseUtil {
    private ResponseUtil() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * 通过流写到前端
     *
     * @param objectMapper 对象序列化
     * @param response
     * @param msg          返回信息
     * @param httpStatus   返回状态码
     * @throws IOException
     */
    public static void responseWriter(ObjectMapper objectMapper, HttpServletResponse response, String msg, int httpStatus) throws IOException {
        Result result = Result.of(null, httpStatus, msg);
        responseWrite(objectMapper, response, result);
    }

    /**
     * 通过流写到前端
     * @param objectMapper 对象序列化
     * @param response
     * @param obj
     */
    public static void responseSucceed(ObjectMapper objectMapper, HttpServletResponse response, Object obj) throws IOException {
        Result result = Result.succeed(obj);
        responseWrite(objectMapper, response, result);
    }

    /**
     * 通过流写到前端
     * @param objectMapper
     * @param response
     * @param msg
     * @throws IOException
     */
    public static void responseFailed(ObjectMapper objectMapper, HttpServletResponse response, String msg) throws IOException {
        Result result = Result.failed(msg);
        responseWrite(objectMapper, response, result);
    }

    private static void responseWrite(ObjectMapper objectMapper, HttpServletResponse response, Result result) throws IOException {
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        try (
                Writer writer = response.getWriter()
        ) {
            writer.write(objectMapper.writeValueAsString(result));
            writer.flush();
        }
    }
}