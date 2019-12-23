package com.zzhen.jcl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * <p>功能描述：使用JCL作为门面，JUL实现</p>
 * <p>类名称：com.zzhen.jcl.JULTest</p>
 * <p>创建时间：2019/12/20 14:52</p>
 * @author zzhen
 */
public class JULTest {

    private static final Log log = LogFactory.getLog(JULTest.class.getName());

    public static void main(String[] args) {
        log.info("JCL门面 ---JUL实现 --- 日志");
    }

}
