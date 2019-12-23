package com.zzhen;

import com.zzhen.log4j.Log4jTest;
import com.zzhen.log4j2.Log4j2Test;
import com.zzhen.logback.LogBackTest;
import com.zzhen.logjul.JULTest;

/**
 * <p>功能描述：</p>
 * <p>类名称：com.zzhen.Test</p>
 * <p>创建时间：2019/12/20 17:00</p>
 *
 * @author zzhen
 */
public class Test {
    public static void main(String[] args) {

        JULTest.main(args);
        Log4jTest.main(args);
        Log4j2Test.main(args);
        LogBackTest.main(args);
    }

    /**
     * 1.日志按照原有日志框架进行打印
     * 2.如果本项目下有引入对应日志框架的配置文件，那么将会使用此配置文件
     */
}
