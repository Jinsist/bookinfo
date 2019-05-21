/**
 * 
 */
package com.imooc.bookinfo.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhailiang
 *
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

	@GetMapping("/{id}")
	public UserDTO findOne(Long id) {
		return new UserDTO();
	}

}
