package org.springframework.mazh.config;

import org.springframework.mazh.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p></p>
 *
 * @author mazhenhua
 * @version $ Config.java 2022/8/15 14:19 mazhenhua $
 **/
@Configuration
public class Config {

	@Bean
	Service service() {
		return new Service();
	}
}
