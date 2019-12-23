package com.zzhen.log4j;

import org.apache.log4j.Logger;

/**
 * <p>功能描述：log4j测试</p>
 * <p>类名称：PACKAGE_NAME.com.zzhen.log4j.Log4jTest</p>
 * <p>创建时间：2019/12/20 10:37</p>
 *
 * @author zzhen
 */
public class Log4jTest {

    private static final Logger LOGGER = Logger.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        LOGGER.info("log4j -----------> 日志");
    }
}
