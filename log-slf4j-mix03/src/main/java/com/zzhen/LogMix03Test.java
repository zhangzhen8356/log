package com.zzhen;

import com.zzhen.log4j.Log4jTest;
import com.zzhen.log4j2.Log4j2Test;
import com.zzhen.logjul.JULTest;
import org.slf4j.bridge.SLF4JBridgeHandler;

/**
 * <p>功能描述：</p>
 * <p>类名称：PACKAGE_NAME.com.zzhen.LogMix03Test</p>
 * <p>创建时间：2019/12/23 15:40</p>
 *
 * @author zzhen
 */
public class LogMix03Test {
    public static void main(String[] args) {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        JULTest.main(args);
        Log4jTest.main(args);
        Log4j2Test.main(args);
        Slf4jLogbackTest.main(args);
    }
}
