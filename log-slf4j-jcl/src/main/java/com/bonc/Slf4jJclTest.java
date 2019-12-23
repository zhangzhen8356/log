package com.bonc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>功能描述：slf4j为日志门面，jcl适配slf4j,使用默认jul</p>
 * <p>类名称：com.bonc.Slf4jJclTest</p>
 * <p>创建时间：2019/12/23 12:30</p>
 *
 * @author zzhen
 */
public class Slf4jJclTest {

    private static final Logger LOGGER
            = LoggerFactory.getLogger(Slf4jJclTest.class);

    public static void main(String[] args) {
        LOGGER.info("slf4j门面----jcl门面适配----jul日志实现----> 日志");
    }
}
