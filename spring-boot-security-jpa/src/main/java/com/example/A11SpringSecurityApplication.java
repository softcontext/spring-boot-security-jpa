package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
 * <jpa:repositories base-package="com.example" />
 * 스프링 데이터 JPA는 인터페이스를 찾아서 해당 인터페이스를 구현한 객체를 생성하여 빈으로 등록한다.
 */
@EnableJpaRepositories
@SpringBootApplication
public class A11SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(A11SpringSecurityApplication.class, args);
	}
}
