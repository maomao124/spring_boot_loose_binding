package mao.spring_boot_loose_binding.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：spring_boot_loose_binding
 * Package(包名): mao.spring_boot_loose_binding.config
 * Class(测试类名): MyConfigTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/15
 * Time(创建时间)： 22:44
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class MyConfigTest
{
    @Autowired
    MyConfig myConfig;

    @Test
    public void test()
    {
        System.out.println(myConfig);
    }
}