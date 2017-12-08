package org.springframework.cloud.config.server;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigServer
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ConfigServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigServerApplication.class)
				.properties("spring.config.name=configserver").run(args);
	}

}
