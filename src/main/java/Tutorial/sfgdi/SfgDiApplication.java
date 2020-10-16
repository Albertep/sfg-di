package Tutorial.sfgdi;

import Tutorial.sfgdi.Controller.ConstructorInyectedController;
import Tutorial.sfgdi.Controller.MyController;
import Tutorial.sfgdi.Controller.PropertyInyectedController;
import Tutorial.sfgdi.Controller.SetterInyectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(SfgDiApplication.class, args);
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
	}

}
