package com.lintrip.config;

import com.lintrip.domain.Person;
import com.lintrip.filter.CustomTypeFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * 注解配置文件
 *
 * @author kakakeven
 * @ComponentScan 支持扫描多个路径
 * 多路径扫描配置： @ComponentScan(value = {"com.lintrip.controller","com.lintrip.dao"})
 * 扫描排除设置： @ComponentScan(value = "com.lintrip", excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class})})
 * 常用的排除扫描过滤类型为：FilterType.ANNOTATION、FilterType.ASSIGNABLE_TYPE
 * 其中：FilterType.ASSIGNABLE_TYPE 为指定类型排除,FilterType.ANNOTATION 为按照注解排除
 * useDefaultFilters 属性值默认为 true，含义为默认情况下会扫描 @Component、@Repository、@Service、@Controller；
 * 如果 useDefaultFilters 的值为 false，则首先执行 include，然后执行 exclude 操作；
 */
@Configuration
@ComponentScan(value = "com.lintrip", excludeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM, value = {CustomTypeFilter.class}))
public class ApplicationConfig {

    @Bean("pingan")
    public Person person() {
        Person person = new Person();
        person.setName("陈平安");
        person.setAge(22);
        return person;
    }
}
