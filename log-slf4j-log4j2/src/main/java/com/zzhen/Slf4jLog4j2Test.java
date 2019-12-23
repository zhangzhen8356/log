package com.zzhen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>功能描述：slf4j门面，log4j2日志实现</p>
 * <p>类名称：com.zzhen.Slf4jLog4j2Test</p>
 * <p>创建时间：2019/12/23 11:03</p>
 *
 * @author zzhen
 */
public class Slf4jLog4j2Test {

    private static final Logger LOGGER
            = LoggerFactory.getLogger(Slf4jLog4j2Test.class);

    public static void main(String[] args) {
        LOGGER.info("slf4j门面----log4j2日志实现----> 日志");
    }
}
