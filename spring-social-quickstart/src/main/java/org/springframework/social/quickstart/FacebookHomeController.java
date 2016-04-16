/**
 * Project: spring-social-quickstart
 * Package: org.springframework.social.quickstart
 * FileName: FacebookHomeController.java
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
public class FacebookHomeController {
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/facebook")
	public String enter(){
		return "facebook_home";
	}
}
