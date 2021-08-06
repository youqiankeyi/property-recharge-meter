package com.property.bluecard.propertyrechargemeter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.property"})
@MapperScan("com.property.bluecard.propertyrechargemeter.generator.mapper")
public class PropertyRechargeMeterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertyRechargeMeterApplication.class, args);
	}

}
