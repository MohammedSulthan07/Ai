package com.springboot;

import com.springboot.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("My program is Started......");
		try(Scanner sc=new Scanner((System.in))){
			System.out.println("Enter Student Regno");
			int regno=sc.nextInt();
			System.out.println(studentService.printRegNo(regno));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("My program is Ended.....");

	}
}
