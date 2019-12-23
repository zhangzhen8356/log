package com.zzhen;

import com.zzhen.logjul.JULTest;
import org.slf4j.bridge.SLF4JBridgeHandler;

/**
 * <p>功能描述：</p>
 * <p>类名称：com.zzhen.LogMix02Test</p>
 * <p>创建时间：2019/12/23 15:16</p>
 * @author zzhen
 */
public class LogMix02Test {

    public static void main(String[] args) {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        JULTest.main(args);
        Slf4jLogTest.main(args);
        Slf4jLog4j2Test.main(args);
        Slf4jLogbackTest.main(args);
    }
}
