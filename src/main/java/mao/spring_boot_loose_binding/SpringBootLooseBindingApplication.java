package mao.spring_boot_loose_binding;

import mao.spring_boot_loose_binding.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootLooseBindingApplication
{

    public static void main(String[] args)
    {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootLooseBindingApplication.class, args);
        MyConfig bean = context.getBean(MyConfig.class);
        System.out.println(bean);
    }

}
