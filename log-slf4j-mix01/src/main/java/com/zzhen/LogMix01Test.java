package com.zzhen;

/**
 * <p>功能描述：</p>
 * <p>类名称：com.zzhen.LogMix01Test</p>
 * <p>创建时间：2019/12/23 14:39</p>
 *
 * @author zzhen
 */
public class LogMix01Test {
    public static void main(String[] args) {
        Slf4jJulTest.main(args);
        Slf4jLogTest.main(args);
        Slf4jLog4j2Test.main(args);
        Slf4jLogbackTest.main(args);
    }
}
