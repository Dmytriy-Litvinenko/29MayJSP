# 29MayJSP
Jsp  connection to spring boot web application

-create new project using Spring initializer
-choose war type of packaging
-create webapp folder in the main folder of your project
-create a folder in webapp where your jsp files will be created
-set the spring.mvc.view.preffix and spring.mvc.view.suffix properties in the application.properties file of your application
-create a new jsp file and the conroller for it
-check the pom.xml file of your project and add there the following dependencies if they are absent

        <dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
		</dependency>
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
		</dependency>
		
-add all static resources(css,js, etc. folders) of the frontend part of your project to the src/main/resources/static folder

