package com.zzhen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>功能描述：slf4j门面，log4j日志实现</p>
 * <p>类名称：com.zzhen.Slf4jLogTest</p>
 * <p>创建时间：2019/12/23 10:54</p>
 * @author zzhen
 */
public class Slf4jLogTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jLogTest.class);

    public static void main(String[] args) {
        LOGGER.info("slf4j门面----log4j日志实现----> 日志");
    }
}
