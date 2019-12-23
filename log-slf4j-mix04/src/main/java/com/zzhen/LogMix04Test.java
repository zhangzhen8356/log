package com.zzhen;

import com.zzhen.log4j.Log4jTest;
import com.zzhen.logback.LogBackTest;
import com.zzhen.logjul.JULTest;
import org.slf4j.bridge.SLF4JBridgeHandler;

/**
 * <p>功能描述：</p>
 * <p>类名称：com.zzhen.LogMix04Test</p>
 * <p>创建时间：2019/12/23 16:12</p>
 *
 * @author zzhen
 */
public class LogMix04Test {

    public static void main(String[] args) {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        JULTest.main(args);
        Log4jTest.main(args);
        Slf4jLog4j2Test.main(args);
        LogBackTest.main(args);
    }
}
