### 介绍
主要日志框架jul,log4j,log4j2,logback,以及日志门面jcl,slf4j的使用和结合使用
### 模块
#### 1.log-jcl
使用jcl作为日志门面
#### 2.log-jul
使用jul作为日志框架
#### 3.log-log4j
使用log4j作为日志框架
#### 4.log-log4j2
使用log4j2作为日志框架
#### 5.log-logback
使用logback作为日志框架
#### 6.log-slf4j-jcl
使用slf4j作为日志门面，jcl日志门面适配，采用jul日志框架
#### 7.log-slf4j-jul
使用slf4j作为日志门面，jul作为日志框架
#### 8.log-slf4j-log4j
使用slf4j作为日志门面，log4j作为日志框架
#### 9.log-slf4j-log4j2
使用slf4j作为日志门面，log4j2作为日志框架
#### 10.log-slf4j-logback
使用slf4j作为日志门面，logback作为日志框架
#### 11.log-slf4j-mix
通过引用模块log-jul、log-log4j、log-log4j2、log-logback，分别使用对应的日志框架进行打印
#### 12.log-slf4j-mix01
引用模块log-slf4j-jul、log-slf4j-log4j、log-slf4j-log4j2、log-slf4j-logback，由于slf4j日志门面有多个日志实现，会选择最先被加载的日志实现就行日志打印。可以使用如下两种方式进行剔除  
- 方式一：直接剔除掉适配器依赖
```
         <dependency>
            <groupId>com.zzhen</groupId>
            <artifactId>log-slf4j-jul</artifactId>
            <version>1.0-SNAPSHOT</version>
            <!-- 可以直接剔除掉 -->
            <exclusions>
                <exclusion>
                    <groupId>org.slf4j</groupId>
                    <artifactId>slf4j-jdk14</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

```
- 方式二：直接引入一个不存在的版本的适配器
```
        <dependency>
            <groupId>com.zzhen</groupId>
            <artifactId>log-slf4j-log4j</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
        <!--由于maven之上而下加载，在上层引入一个不存在的,不会加载下层的-->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-log4j12</artifactId>
            <version>99.99.99</version>
        </dependency>
```
####13.log-slf4j-mix02
引用模块log-jul、log-slf4j-log4j、log-slf4j-log4j2、log-slf4j-logback；通过使用logback日志框架打印
需要将jul转移到slf4j上，同时需要将log4j,log4j2对应的日志框架进行剔除，使用logback日志框架
- 引入jul转移到slf4j上面
```
       <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>jul-to-slf4j</artifactId>
            <version>1.7.25</version>
        </dependency>
```
- 剔除log4j,log4j2中的日志适配器
```
        <dependency>
            <groupId>com.zzhen</groupId>
            <artifactId>log-slf4j-log4j</artifactId>
            <version>1.0-SNAPSHOT</version>
            <exclusions>
                <exclusion>
                    <groupId>org.slf4j</groupId>
                    <artifactId>slf4j-log4j12</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>com.zzhen</groupId>
            <artifactId>log-slf4j-log4j2</artifactId>
            <version>1.0-SNAPSHOT</version>
            <exclusions>
                <exclusion>
                    <groupId>org.apache.logging.log4j</groupId>
                    <artifactId>log4j-slf4j-impl</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
```
- 将jul转移到slf4j上面，需要添加如下
```
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
```
- 可以在本项目的resources添加对应的日志配置文件
#### 14.log-slf4j-mix03
引用log-jul，log-log4j，log-log4j2，log-slf4j-logback模块，使用logback日志框架进行输出
- 添加对应的日志框架转移依赖，并剔除对应的日志框架
```
     <dependency>
            <groupId>com.zzhen</groupId>
            <artifactId>log-jul</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>

        <!-- jul日志转移到slf4j -->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>jul-to-slf4j</artifactId>
            <version>1.7.25</version>
        </dependency>

        <dependency>
            <groupId>com.zzhen</groupId>
            <artifactId>log-log4j</artifactId>
            <version>1.0-SNAPSHOT</version>
            <!-- 剔除掉本身的日志框架-->
            <exclusions>
                <exclusion>
                    <groupId>log4j</groupId>
                    <artifactId>log4j</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <!-- 添加log4j日志转移到slf4j-->
        <!-- https://mvnrepository.com/artifact/org.slf4j/log4j-over-slf4j -->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>log4j-over-slf4j</artifactId>
            <version>1.7.25</version>
        </dependency>


        <dependency>
            <groupId>com.zzhen</groupId>
            <artifactId>log-log4j2</artifactId>
            <version>1.0-SNAPSHOT</version>
            <!-- 剔除掉本身的日志框架-->
            <exclusions>
                <exclusion>
                    <groupId>org.apache.logging.log4j</groupId>
                    <artifactId>log4j-core</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <!-- 添加log4j2日志转移到slf4j-->
        <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-to-slf4j -->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-to-slf4j</artifactId>
            <version>2.12.1</version>
        </dependency>
```
#### 15.log-slf4j-mix04
引用log-jul，log-log4j，log-logback，log-slf4j-log4j2模块，使用log4j2日志框架进行输出  
这里需要注意logback操作，剔除本身的依赖
```
    <dependency>
        <groupId>com.zzhen</groupId>
        <artifactId>log-logback</artifactId>
        <version>1.0-SNAPSHOT</version>
        <exclusions>
            <exclusion>
                <groupId>ch.qos.logback</groupId>
                <artifactId>logback-classic</artifactId>
            </exclusion>
        </exclusions>
    </dependency>
```
