package Tutorial.sfgdi;

import Tutorial.sfgdi.ConnectionDb.ConnectionDb;
import Tutorial.sfgdi.ConnectionDb.JmsBroker;
import Tutorial.sfgdi.Controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SfgDiApplication.class, args);

		/*System.out.println("--------I18n");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.heyYo());
*/
		System.out.println("---------Factoria");

		System.out.println("---------MyController");
		MyController myController= (MyController) ctx.getBean("myController");
		String hello=myController.Hello();
		System.out.println(hello);

		System.out.println("--------PropertyInyectedController");
		PropertyInyectedController property= (PropertyInyectedController) ctx.getBean("propertyInyectedController");
		System.out.println(property.getGreetings());

		System.out.println("---------SetterInyectedController");
		SetterInyectedController setter= (SetterInyectedController) ctx.getBean("setterInyectedController");
		System.out.println(setter.getGreetins());

		System.out.println("---------ConstructorInyectedController");
		ConstructorInyectedController constructor=(ConstructorInyectedController) ctx.getBean("constructorInyectedController");
		System.out.println(constructor.getGreetins());
		System.out.println("-----------------------------------------------------------------Base de Datos-----------------------------------------------------------------------------------------");
		ConnectionDb connectionDb=ctx.getBean(ConnectionDb.class);
		System.out.println(connectionDb.getUser());
		System.out.println(connectionDb.getPass());
		System.out.println(connectionDb.getUrl());
		System.out.println("-----------------------------------------------------------------Base de Datos JMS-----------------------------------------------------------------------------------------");
		JmsBroker jmsBroker=ctx.getBean(JmsBroker.class);
		System.out.println(jmsBroker.getUser());
		System.out.println(jmsBroker.getPass());
		System.out.println(jmsBroker.getUrl());
	}

}
