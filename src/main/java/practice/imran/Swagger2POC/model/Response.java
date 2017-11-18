/**
 * 
 */
package practice.imran.Swagger2POC.model;

import java.io.Serializable;

import lombok.Data;

/**
 * @author imran
 *
 */
@Data
public class Response implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String greetings;
	
	private String status;

}
