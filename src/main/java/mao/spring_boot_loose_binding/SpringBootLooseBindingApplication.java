package mao.spring_boot_loose_binding;

import mao.spring_boot_loose_binding.config.MyConfig;
import mao.spring_boot_loose_binding.data.Student;
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
        Student student = context.getBean(Student.class);
        System.out.println(student);
    }

}
