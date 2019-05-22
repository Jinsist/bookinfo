/**
 * 
 */
package com.imooc.bookinfo.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhailiang
 *
 */
@RestController
@RequestMapping("/api/books")
public class BookController {

	@GetMapping("/{id}")
	public BookDTO findOne(@PathVariable Long id) {
		return new BookDTO(id);
	}

}
