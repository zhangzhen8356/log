package com.zzhen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>功能描述：slf4j门面，logback日志实现</p>
 * <p>类名称：com.zzhen.Slf4jLogbackTest</p>
 * <p>创建时间：2019/12/23 11:08</p>
 * @author zzhen
 */
public class Slf4jLogbackTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jLogbackTest.class);

    public static void main(String[] args) {
        LOGGER.info("slf4j门面----logback日志实现----> 日志");
    }
}
