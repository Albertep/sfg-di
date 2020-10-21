package Tutorial.sfgdi.config;

import Tutorial.sfgdi.ConnectionDb.ConnectionDb;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class DatabaseConfiguration {
    @Value("${Tutorial.username}")
    private String user;

    @Value("${Tutorial.password}")
    private String password;

    @Value("${dburl}")
    private String dburl;

    @Bean
    public ConnectionDb dataSourceFake(){
        ConnectionDb dataSourceFake=new ConnectionDb();
        dataSourceFake.setPass(password);
        dataSourceFake.setUrl(dburl);
        dataSourceFake.setUser(user);
        return dataSourceFake;

    }

    /*@Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer= new PropertySourcesPlaceholderConfigurer();
        return  propertySourcesPlaceholderConfigurer;
    }*/
}
