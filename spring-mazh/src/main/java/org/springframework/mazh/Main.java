package org.springframework.mazh;

import org.springframework.mazh.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p></p>
 *
 * @author ${USER}
 * @version $ ${NAME}.java ${DATE} ${TIME} ${USER} $
 **/
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		Service service = ac.getBean(Service.class);
		service.sayHello("马睿");
	}
}

