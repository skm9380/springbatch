package com.example.training;

import javax.batch.runtime.JobExecution;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SpringbatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbatchApplication.class, args);
		
		String [] springConfig = {"spring.batch.jobs/job-testsumit.xml"} ; 
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher"); 
		Job job = (Job) context.getBean("helloWorldJob");
		
		try{
			org.springframework.batch.core.JobExecution execution = jobLauncher.run(job, new JobParameters()  );
			System.out.println("Exit Status ::"+execution.getExitStatus());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("successfull");
		
	}

}
