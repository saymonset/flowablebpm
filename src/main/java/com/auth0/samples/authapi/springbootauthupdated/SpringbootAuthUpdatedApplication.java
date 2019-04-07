package com.auth0.samples.authapi.springbootauthupdated;

import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringbootAuthUpdatedApplication {

	
	 @Bean
	    public CommandLineRunner init(final RepositoryService repositoryService,
	                                  final RuntimeService runtimeService,
	                                  final TaskService taskService) {

	        return new CommandLineRunner() {
	            @Override
	            public void run(String... strings) throws Exception {
	            	System.out.println("------------------1-----------------------------------");
	                System.out.println("Number of process definitions : "
	                	+ repositoryService.createProcessDefinitionQuery().count());
	                System.out.println("Number of tasks : " + taskService.createTaskQuery().count());
	                runtimeService.startProcessInstanceByKey("myProcess");
	                System.out.println("Number of tasks after process start: "
	                    + taskService.createTaskQuery().count());
	                System.out.println("-------------2----------------------------------------");
	            }
	        };
	    }


	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAuthUpdatedApplication.class, args);


	}
}
