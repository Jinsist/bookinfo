/**
 * 
 */
package com.imooc.bookinfo.review;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhailiang
 *
 */
@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

	@GetMapping("/{id}")
	public ReviewDTO findOne(Long id) {
		return new ReviewDTO();
	}

}
