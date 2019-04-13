 1) install gradle >= 4.4.1
 2) install mysql and create bd flowable
 
   The parameters  in application.properties, flowable.cfg.xml  are

    spring.datasource.url=jdbc:mysql://127.0.0.1:3306/flowable?characterEncoding=UTF-8
    spring.datasource.username=root
	spring.datasource.password=123456

3) Compile : 

      gradle clean build



In the file startprocess.json has

{"assignee" : "managers",
	"format" : "text",
	"accurancy" : "11"
}


Where 

   assignee: is the candidateGroups of the task call managers

   format: it can be text or ocr

   accurency: If value es < 10, the flow is low and have to Validate Bill details task

   accurency: If value es > 10, the flow finish




5-)  run with:

       gradle bootrun


6 - ) call a new process
   - open a console and run in cmd,  and call the name file 

           startprocess.cmd

 2-) Execute all task
     open a console and run in cmd,  and call the name file 

             completeTask.cmd   


