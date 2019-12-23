package com.zzhen.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * <p>功能描述：Log4j2测试</p>
 * <p>类名称：com.zzhen.log4j2.Log4j2Test</p>
 * <p>创建时间：2019/12/20 11:29</p>
 * @author zzhen
 */
public class Log4j2Test {

    private static final Logger LOGGER = LogManager.getLogger(Log4j2Test.class);

    public static void main(String[] args) {
        LOGGER.info("log4j2 -----------> 日志");
    }
}
