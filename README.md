# Swagger2POC

Swagger 2 is used to add documentation to you API's. The code below is using Springboot 2.0.0 with java 8 and lombok.
Swagger 2.7.0

Steps:
1. Initialize the project from the spring initializer site: https://start.spring.io/.
In the dependency select web and lombock.

2. Add Swagger dependencies:

    <dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.7.0</version>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.7.0</version>
		</dependency>
    
    3. Create a configuration class and iniatialize the swagger bean.
    
    @Configuration
@EnableSwagger2
public class SwaggerConfig {
	
//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.apis(RequestHandlerSelectors.any())
//				.paths(PathSelectors.any())
//				.build();
//	}
//	
	@Bean
	    public Docket productApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()                 
	                .apis(RequestHandlerSelectors.basePackage("practice.imran.Swagger2POC"))
	                .paths(PathSelectors.regex("/swagger.*"))
	                .build();
	    }
	

}

You can initialize the Docket bean using the above 2 methods.
The first one is more genearilized way, it will give description of all the avaliabel APIS.

4.

Run the application and check the API using below link:
http://localhost:8080/swagger-ui.html
