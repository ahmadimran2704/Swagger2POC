/**
 * 
 */
package practice.imran.Swagger2POC.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import practice.imran.Swagger2POC.model.RequestObject;
import practice.imran.Swagger2POC.model.Response;

/**
 * @author imran
 *
 */
@RestController
@RequestMapping("swagger")
public class SwaggerController {

	@RequestMapping(value="/greeting",method=RequestMethod.POST,
			produces=MediaType.APPLICATION_JSON_UTF8_VALUE,
			consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody Response getGreetings(@RequestBody RequestObject request) {
		
		Response response=new Response();
		response.setGreetings("hello"+request.getName());
		response.setStatus("SUCCESS");
		return response;
	}
}
