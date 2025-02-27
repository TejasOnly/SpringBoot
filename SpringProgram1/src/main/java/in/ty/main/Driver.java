package in.ty.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ty.beans.Student;

public class Driver {
public static void main(String[] args) {
	String config_loc="/in/ty/resources/applicationContext.xml";
	ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
	Student std=(Student)context.getBean("stdId");
	std.Display();
}
}
