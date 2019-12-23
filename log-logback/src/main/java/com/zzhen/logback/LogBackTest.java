package com.zzhen.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>功能描述：logback测试</p>
 * <p>类名称：com.zzhen.logback.LogBackTest</p>
 * <p>创建时间：2019/12/20 11:18</p>
 *
 * @author zzhen
 */
public class LogBackTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogBackTest.class);

    public static void main(String[] args) {
        LOGGER.info("logback -----------> 日志");
    }

}
