package com.in28minutes.spring.basics.springin5steps;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {


	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);

		BinarySearchImpl obj = applicationContext.getBean(BinarySearchImpl.class);

		int[] arr = {5, 7, 2, 15 , 23 ,7};
		int ans = obj.binarySearch(arr, 15);

		System.out.println(ans);


	}

}
