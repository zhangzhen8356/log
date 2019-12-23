package com.zzhen.jcl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * <p>功能描述：使用JCL作为门面，log4j实现</p>
 * <p>类名称：com.zzhen.jcl.Log4jTest</p>
 * <p>创建时间：2019/12/20 15:17</p>
 * @author zzhen
 */
public class Log4jTest {
    private static final Log log = LogFactory.getLog(Log4jTest.class);

    public static void main(String[] args) {
        log.info("JCL门面 ---Log4j实现 --- 日志");
    }
}
