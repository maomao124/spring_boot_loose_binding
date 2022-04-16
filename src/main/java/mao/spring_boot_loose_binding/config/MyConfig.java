package mao.spring_boot_loose_binding.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Project name(项目名称)：spring_boot_loose_binding
 * Package(包名): mao.spring_boot_loose_binding.config
 * Class(类名): MyConfig
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/15
 * Time(创建时间)： 22:38
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Component
@ConfigurationProperties(prefix = "servers1")
public class MyConfig
{
    static
    {
        System.out.println("加载...");
    }

    private String ipAddress;
    private int port;
    private long timeout;


    public String getIpAddress()
    {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress)
    {
        this.ipAddress = ipAddress;
    }

    public int getPort()
    {
        return port;
    }

    public void setPort(int port)
    {
        this.port = port;
    }

    public long getTimeout()
    {
        return timeout;
    }

    public void setTimeout(long timeout)
    {
        this.timeout = timeout;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("ipAddress：").append(ipAddress).append('\n');
        stringbuilder.append("port：").append(port).append('\n');
        stringbuilder.append("timeout：").append(timeout).append('\n');
        return stringbuilder.toString();
    }
}
