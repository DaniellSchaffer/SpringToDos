/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.controllers;

import co.edu.utb.softeng.springtodos.entity.Category;
import co.edu.utb.softeng.springtodos.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author windows7
 */
@Controller //Marks a class as a Spring Web MVC controller.
//Beans marked with it are automatically imported into the DI container. Allows use of @RequestMapping to map URLs to instance methods of a class.
@RequestMapping("/category") //Annotation used to map web requests onto specific handler classes and/or handler methods
public class CategoryController {
    @Autowired
    CategoryService service;
    
    @RequestMapping(value={"/test"}, method = RequestMethod.GET)
    public @ResponseBody String test() {
        return "Hello, Spring!";
    }
    
    @RequestMapping(value={"/all"}, method = RequestMethod.GET)
    public @ResponseBody List<Category> getAll() {
        return service.getAllCategories();
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody Category getById(Long id) {
        return service.getCategoryById(id);
    }
}
