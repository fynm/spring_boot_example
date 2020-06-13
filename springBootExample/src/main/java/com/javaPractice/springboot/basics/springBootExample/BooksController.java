package com.javaPractice.springboot.basics.springBootExample;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*Use Rest Controller to define a rest Service */

@RestController
public class BooksController {
    /*Set Mapping URI - when someone does a get request with /books it will return this function*/
    
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(new Book(1l, "How To Do Stuff Sometimes Good 2", "Shawn Fong"));
    }
}