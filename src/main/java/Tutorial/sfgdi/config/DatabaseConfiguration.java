package Tutorial.sfgdi.config;

import Tutorial.sfgdi.ConnectionDb.ConnectionDb;
import Tutorial.sfgdi.ConnectionDb.JmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
/*@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:datasource.properties")
})*/

public class DatabaseConfiguration {

   /* @Autowired
    Environment enviroment;

    */

    @Value("${Tutorial.username}")
    private String user;

    @Value("${Tutorial.password}")
    private String password;

    @Value("${dburl}")
    private String dburl;

    @Value("${jms.username}")
    private String jmsuser;

    @Value("${jms.password}")
    private String jmspassword;

    @Value("${jms.Url}")
    private String jmsdburl;

    @Bean
    public ConnectionDb dataSourceFake(){
        ConnectionDb dataSourceFake=new ConnectionDb();
        dataSourceFake.setPass(password);
        dataSourceFake.setUrl(dburl);
        dataSourceFake.setUser(user);
        /*dataSourceFake.setUser(enviroment.getProperty("USERNAME"));*/
        return dataSourceFake;

    }

    @Bean
    public JmsBroker dataSourceJMSFake(){
        JmsBroker dataSourceFake=new JmsBroker();
        dataSourceFake.setPass(jmspassword);
        dataSourceFake.setUrl(jmsdburl);
        dataSourceFake.setUser(jmsuser);
        return dataSourceFake;

    }

    /*@Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer= new PropertySourcesPlaceholderConfigurer();
        return  propertySourcesPlaceholderConfigurer;
    }*/
}
