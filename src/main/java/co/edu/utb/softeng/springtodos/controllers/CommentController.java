/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springtodos.controllers;

import co.edu.utb.softeng.springtodos.entity.Comment;
import co.edu.utb.softeng.springtodos.service.CommentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author windows7
 */
@Controller
@RequestMapping("/comment")
public class CommentController {
   @Autowired
   CommentService service;
    
    @RequestMapping(value={"/test"}, method = RequestMethod.GET)
    public @ResponseBody String test() {
        return "Hello, Spring!";
    }
    
    @RequestMapping(value={"/all"}, method = RequestMethod.GET)
    public @ResponseBody List<Comment> getAll() {
        return service.getAllComments();
    }
    
    @RequestMapping(value={"/{id}"}, method = RequestMethod.GET)
    public @ResponseBody Comment getById(@PathVariable Long id) {
        return service.getCommentById(id);
    }
}

