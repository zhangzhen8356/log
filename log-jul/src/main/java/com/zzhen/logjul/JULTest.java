package com.zzhen.logjul;

import java.util.logging.Logger;

/**
 * <p>功能描述：jul测试</p>
 * <p>类名称：PACKAGE_NAME.com.zzhen.logjul.JULTest</p>
 * <p>创建时间：2019/12/20 10:27</p>
 * @author zzhen
 */
public class JULTest {
    private static final Logger logger = Logger.getLogger(JULTest.class.getName());

    public static void main(String[] args) {

        //SEVERE、WARNING、INFO、CONFIG、FINE、FINER、FINEST。
        logger.info("JUL -----------> info --------> 日志");
        //默认只能打印info以上，可以通过修改日志级别，打印更低级别的东西，但是还有一个拦截器去控制级别
    }
}
