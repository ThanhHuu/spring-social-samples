/**
 * Project: spring-social-quickstart
 * Package: org.springframework.social.quickstart
 * FileName: GoogleHomeController.java
 * Author : huu.tra
 */
package org.springframework.social.quickstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huu.tra
 *
 */
@Controller
public class GoogleHomeController {

	/**
	 * 
	 * @return
	 */
	@RequestMapping("/google")
	public String enter(){
		return "google_home";
	}
}
