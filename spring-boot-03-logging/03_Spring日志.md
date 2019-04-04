### Spring日志

#### 1.获取日志输出

```java
@RunWith(SpringRunner.class)
@SpringBootTest
public class YhchApplicationTests {

    @Test
    public void contextLoads() {
        Log log = LogFactory.getLog(getClass());
        //日志级别由低到高
        log.trace("日志trace");
        log.debug("debug信息");
        //spring默认输出info及info级别以上的信息
        log.info("info信息");
        log.warn("warn信息");
        log.error("error信息");

    }

}
```



#### 2.日志配置

```properties
#日志输出级别（level.包名）
logging.level.xyz.yhch = trace

#将日志输出指定到文件可以指定文件位置

#logging.file.name = D:/springboot.log

#指定日志生成目录

logging.file.path= /spring/log
# 会在当前磁盘下建立 D:\spring\log\ 文件夹,并将日志信息输出至spring.log文件中


#控制台日志输出格式
logging.pattern.console=

#日志文件日志生成格式
logging.pattern.file=
```

